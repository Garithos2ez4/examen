package Controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAOImplement.DAOUsuario;
import model.TblUsuariocl2;

/**
 * Servlet implementation class SvUsuario
 */
@WebServlet("/SvUsuario")
public class SvUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SvUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		DAOUsuario usu = new DAOUsuario();
		List<TblUsuariocl2> usuarios = usu.ListarCLiente();
		if(usuarios !=null) {
			request.setAttribute("usuarios", usu);
		}else {
			request.setAttribute("error", "e");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    // Obtener los parámetros del formulario
	    String usuario = request.getParameter("usuariocl2");
	    String password = request.getParameter("passwordcl2");

	    // Validar los datos de entrada
	    if (usuario == null || password == null || usuario.isEmpty() || password.isEmpty()) {
	        request.setAttribute("error", "Usuario y contraseña son obligatorios.");
	        request.getRequestDispatcher("registrarpro.jsp").forward(request, response);
	        return;
	    }

	    // Crear la instancia del usuario
	    TblUsuariocl2 nuevoUsuario = new TblUsuariocl2();
	    nuevoUsuario.setUsuariocl2(usuario);
	    nuevoUsuario.setPasswordcl2(password);

	    // Registrar el nuevo usuario utilizando el DAO
	    DAOUsuario daoUsuario = new DAOUsuario();
	    daoUsuario.RegistrarCliente(nuevoUsuario); // Asegúrate de que este método exista y funcione correctamente

	    // Mensaje de éxito
	    request.setAttribute("mensaje", "Usuario registrado exitosamente.");

	    // Redirigir a la página de inicio de sesión
	    response.sendRedirect("registrarpro.jsp"); // Cambia a login.jsp para redirigir
	}
}
