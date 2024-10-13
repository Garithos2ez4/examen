package Controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.TblProveedorcl2;
import DAOImplement.*;
/**
 * Servlet implementation class SvProveedor
 */
@WebServlet("/SvProveedor")
public class SvProveedor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SvProveedor() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Instancia el DAO y llama al método ListarProveedor
        DAOProveedor daoProveedor = new DAOProveedor();
        List<TblProveedorcl2> proveedores = daoProveedor.ListarProveedor();

        // Verifica si se obtuvieron resultados
        if (proveedores != null) {
            // Agrega la lista de proveedores al request para la JSP
            request.setAttribute("proveedores", proveedores);
        } else {
            request.setAttribute("error", "No se encontraron proveedores.");
        }

        // Redirige a la página JSP para mostrar los proveedores
        request.getRequestDispatcher("listarProveedores.jsp").forward(request, response);
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 String nombre = request.getParameter("nombre");
	        String ruc = request.getParameter("ruc");
	        String razonSocial = request.getParameter("razonSocial");
	        String email = request.getParameter("email");
	        String fechaIngresoString = request.getParameter("fechaIngreso");
		
		 TblProveedorcl2 nuevoProveedor  = new TblProveedorcl2();
		 nuevoProveedor.setNomproveecl2(nombre);
	        nuevoProveedor.setRucproveecl2(ruc);
	        nuevoProveedor.setRsocialproveecl2(razonSocial);
	        nuevoProveedor.setEmailproveecl2(email);
	        nuevoProveedor.setFeingproveecl2(java.sql.Date.valueOf(fechaIngresoString)); // Convierte a java.sql.Date
		 
		 
	}

}
