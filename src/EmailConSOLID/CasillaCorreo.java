package EmailConSOLID;

import java.util.ArrayList;
import java.util.List;

public class CasillaCorreo {
	public ArrayList<Correo> inbox;
	ArrayList<Correo> borrados;
	
	public CasillaCorreo() {
		this.inbox = new ArrayList<Correo>();
		this.borrados = new ArrayList<Correo>();
	}
	public void borrarCorreo(Correo correo) {
		this.inbox.remove(correo);
		this.eliminarBorrado(correo);
	}
	public int contarBorrados() {
		return borrados.size();
	}
	public int contarInbox() {
		return inbox.size();
	}
	public void eliminarBorrado(Correo correo) {
		this.borrados.remove(correo);
	}
	public void addInbox(List<Correo> mails) {
		mails.stream().forEach(correo -> inbox.add(correo));
	}
}
