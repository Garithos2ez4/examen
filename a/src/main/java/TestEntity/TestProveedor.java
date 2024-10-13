package TestEntity;
import java.sql.Date;
import DAOImplement.DAOProveedor;
import model.*;

public class TestProveedor {

	
	public static void main(String[] args) {
		//realizamos la respectiva instancia...
		TblProveedorcl2 tblprod=new TblProveedorcl2();
		DAOProveedor tblimp=new DAOProveedor();
		
		tblprod.setIdprooveedorcl2(1);
		tblprod.setNomproveecl2("luigui");
		tblprod.setRucproveecl2("123");
		tblprod.setRsocialproveecl2("juju");
		tblprod.setEmailproveecl2("@mas");
		String fechaString = "2023-10-15"; // Formato YYYY-MM-DD
		Date fecha = Date.valueOf(fechaString);
		tblprod.setFeingproveecl2(fecha);
		//asignamos valores...
		/*tblprod.setNomprod("azuar rubia");
		tblprod.setPrecio(3.5);
		tblprod.setCantidad(4);
		tblprod.setTotal(tblprod.getPrecio()*tblprod.getCantidad());
		tblprod.setCodbarras("7778899");
		tblprod.setNrolote("lote4589");
		Date fecha=new Date();
		Date fechasql=new Date(fecha.getTime());
		tblprod.setFechaven(fechasql);
		//invocamos el metodo registrar
		tblimp.RegistrarProducto(tblprod);
		//emitimos mensaje por consola
		System.out.println("dato registrado en BD");*/
		
	//	tblprod.setIdproducto(1);
		//tblprod.setNomprod("Arroz Faron");
		//tblprod.setPrecio(4.5);
		//tblprod.setCantidad(5);
		//tblimp.ActualizarProducto(tblprod);
		tblimp.RegistrarProveedor(tblprod);
		System.out.println("dato actualizados en BD");

	}//fin de metodo prinpal..

}//fin de la clase...

