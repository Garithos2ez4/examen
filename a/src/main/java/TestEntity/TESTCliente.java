package TestEntity;


import DAOImplement.DAOUsuario;
import model.TblUsuariocl2;

public class TESTCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TblUsuariocl2 cli=new TblUsuariocl2();
		DAOUsuario implc=new DAOUsuario();
		cli.setIdusuariocl2(1);
		cli.setUsuariocl2("hahaha");
		cli.setPasswordcl2("123");
		/*
		 
		
		cli.setNomCliet("MANCO");
		cli.setApeCliet("EFRAIN");
		cli.setDniCliet("78965412");
		cli.setEmaiClie("EFRAIN@GMAIL.COM");;
		cli.setSexoClie("MACHAZO");
		cli.setTelCliet("987456321");
		implc.RegistrarCliente(cli);
		
		cli.setApeCliet("EL GLI GLIS");
		cli.setDniCliet("85463217");
		cli.setEmaiClie("GLIS@GMAIL.COM");;
		cli.setSexoClie("MACHAZO");
		cli.setTelCliet("936582147");
		*
		*/
		
		//cli.setIdClient(2);
	//	cli.setNomCliet("REALES HASTA ");
		implc.RegistrarCliente(cli);
		
	}

}
