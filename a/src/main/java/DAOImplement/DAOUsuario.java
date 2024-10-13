package DAOImplement;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.Iusuario;
import model.TblUsuariocl2;

public class DAOUsuario implements Iusuario {

	@Override
	public void RegistrarCliente(TblUsuariocl2 cli) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("ProyectoJPAVeterinaria");
		EntityManager em=emf.createEntityManager();
		try {
			em.getTransaction().begin();
			em.persist(cli);
			System.out.println("REGISTRADO CORRECTAMENTE");
			em.getTransaction().commit();
		} catch (RuntimeException e) {
			e.getMessage();
			System.out.println("NO SE PUEDE REGISTRAR EN LA TABLA");
			// TODO: handle exception
		}finally {
			em.close();
			emf.close();
		}
		
	}
		
	

	@Override
	public void ActualizarCliente(TblUsuariocl2 cli) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("ProyectoJPAVeterinaria");
		EntityManager em=emf.createEntityManager();
		try {
			em.getTransaction().begin();
			em.merge(cli);
			em.getTransaction().commit();
		} catch (RuntimeException e) {
			e.getMessage();
			
			// TODO: handle exception
		}
		// TODO Auto-generated method stub
		
	}//fin del metodo act.

	@Override
	public void EliminarCliente(TblUsuariocl2 cli) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("ProyectoJPAVeterinaria");
		EntityManager em=emf.createEntityManager();
		try{
		//iniciamos la transaccion...
		em.getTransaction().begin();
		//recuperamos el codigo a eliminar...
		TblUsuariocl2 codelim=em.find(TblUsuariocl2.class,cli.getIdusuariocl2());
		//aplicamos una condicion...
		if(codelim!=null){
			em.remove(codelim);
		}
		//confirmamos
		em.getTransaction().commit();
		}catch(RuntimeException ex){
			if(em.getTransaction().isActive()) em.getTransaction().rollback();
			ex.getMessage();
		}finally{
		//cerramos
		em.close();
		}
	}//fin del metodo elim...

	

	@Override
	public List<TblUsuariocl2> ListarCLiente() {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("ProyectoJPAVeterinaria");
		EntityManager em=emf.createEntityManager();
		List<TblUsuariocl2> listado=null;
		try{
		//iniciasmos la transaccion...
		em.getTransaction().begin();
		//aplicando JPQL(JAVA PERSISTENCE QUERY LANGUAGE)
		 listado=em.createQuery("select p from TblProducto p",TblUsuariocl2.class).getResultList();
		 em.getTransaction().commit();
		}catch(RuntimeException ex){
			ex.getMessage();
		}finally{
		em.close();
		}
		return listado;
	}//fin del metodo lis...

	
	@Override
	public TblUsuariocl2 BuscarCliente(TblUsuariocl2 cli) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("ProyectoJPAVeterinaria");
		EntityManager em=emf.createEntityManager();
		TblUsuariocl2 listado=null;
		try {
			em.getTransaction().begin();
			listado=em.find(TblUsuariocl2.class, cli.getIdusuariocl2());
			em.getTransaction().commit();
		} catch (RuntimeException e) {
			e.getMessage();
			System.out.println("NO SE PUEDE BUSCAR EN LA TABLA");
			// TODO: handle exception
		}finally {
			em.close();
			emf.close();
		}
		return listado;
	}

}
