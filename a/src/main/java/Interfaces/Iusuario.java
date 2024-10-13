package Interfaces;

import java.util.List;

import model.TblUsuariocl2;

public interface Iusuario {
	void RegistrarCliente(TblUsuariocl2 cli);
	void ActualizarCliente(TblUsuariocl2 cli);
	void EliminarCliente(TblUsuariocl2 cli);
	List<TblUsuariocl2> ListarCLiente();
	TblUsuariocl2 BuscarCliente(TblUsuariocl2 cli);
}	

	


