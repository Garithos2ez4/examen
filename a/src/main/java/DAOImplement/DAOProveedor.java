package DAOImplement;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.Iproveedor;
import model.TblProveedorcl2;


public class DAOProveedor implements Iproveedor {

	@Override
	public void RegistrarProveedor(TblProveedorcl2 pro) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("ProyectoJPAVeterinaria");
		EntityManager em=emf.createEntityManager();
		try {
			em.getTransaction().begin();
			em.persist(pro);
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
	public void ActualizarProveedor(TblProveedorcl2 pro) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("ProyectoJPAVeterinaria");
		EntityManager em=emf.createEntityManager();
		try {
			em.getTransaction().begin();
			em.merge(pro);
			em.getTransaction().commit();
		} catch (RuntimeException e) {
			e.getMessage();
			
			// TODO: handle exception
		}
		// TODO Auto-generated method stub
		
	}//fin del metodo act...
	

	@Override
	public void EliminarProveedor(TblProveedorcl2 pro) {
		//nos conectamos con la U.P.	
				EntityManagerFactory emf=Persistence.createEntityManagerFactory("ProyectoJPAVeterinaria");
				EntityManager em=emf.createEntityManager();
				try{
				//iniciamos la transaccion...
				em.getTransaction().begin();
				//recuperamos el codigo a eliminar...
				TblProveedorcl2 codelim=em.find(TblProveedorcl2.class,pro.getIdprooveedorcl2());
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
	public List<TblProveedorcl2> ListarProveedor() {
		//nos conectamos con la U.P.	
				EntityManagerFactory emf=Persistence.createEntityManagerFactory("ProyectoJPAVeterinaria");
				EntityManager em=emf.createEntityManager();
				List<TblProveedorcl2> listado=null;
				try{
				//iniciasmos la transaccion...
				em.getTransaction().begin();
				//aplicando JPQL(JAVA PERSISTENCE QUERY LANGUAGE)
				 listado=em.createQuery("select p from TblProducto p",TblProveedorcl2.class).getResultList();
				 em.getTransaction().commit();
				}catch(RuntimeException ex){
					ex.getMessage();
				}finally{
				em.close();
				}
				return listado;
			}//fin del metodo lis...

	@Override
	public TblProveedorcl2 BuscarProveedor(TblProveedorcl2 pro) {
		//nos conectamos con la U.P.	
		   EntityManagerFactory emf=Persistence.createEntityManagerFactory("ProyectoJPAVeterinaria");
		   EntityManager em=emf.createEntityManager();
		   TblProveedorcl2 buscaprod=null;
		   try{
		   //iniciamos la transaccion...
		   em.getTransaction().begin();
		   //buscamos el producto....
		    buscaprod=em.find(TblProveedorcl2.class,pro.getIdprooveedorcl2());
		   //confirmar
		   em.getTransaction().commit();
		   }catch(RuntimeException ex){
			   ex.getMessage();
		   }finally{
		   //cerramos 
		   em.close();
		   }
		   return buscaprod;
		} //fin del metodo busc...

	}//fin de la clase...
