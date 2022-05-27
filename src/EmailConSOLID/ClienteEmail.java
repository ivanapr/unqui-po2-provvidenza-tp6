package EmailConSOLID;

import java.util.List;

public class ClienteEmail {

	String nombreUsuario;
	String passUsuario;
	Servidor servidor;
	CasillaCorreo casilla;
	
	public ClienteEmail(Servidor servidor, String nombreUsuario, String passUsuario, CasillaCorreo casilla) {
		this.setServidor(servidor);
		this.setNombreUsuario(nombreUsuario);
		this.setPassUsuario(passUsuario);
		this.setCasilla(casilla);
		this.conectar();
	}

	private String getNombreUsuario() {
		return nombreUsuario;
	}

	private void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	private String getPassUsuario() {
		return passUsuario;
	}

	private void setPassUsuario(String passUsuario) {
		this.passUsuario = passUsuario;
	}

	private Servidor getServidor() {
		return servidor;
	}

	private void setServidor(Servidor servidor) {
		this.servidor = servidor;
	}

	private CasillaCorreo getCasilla() {
		return casilla;
	}

	private void setCasilla(CasillaCorreo casilla) {
		this.casilla = casilla;
	}
	
	public void conectar(){
		this.servidor.conectar(this.nombreUsuario,this.passUsuario);
	}
	
	public void recibirNuevos(){
		List<Correo> mails = this.servidor.recibirNuevos(this.nombreUsuario, this.passUsuario);
		this.casilla.addInbox(mails);
	}
	
	public void enviarCorreo(String asunto, String destinatario, String cuerpo){
		Correo correo = new Correo(asunto, destinatario, cuerpo);
		this.servidor.enviar(correo);
	}
}
