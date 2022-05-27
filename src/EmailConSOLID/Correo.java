package EmailConSOLID;

public class Correo {

	private String asunto;
	private String destinatario;
	private String cuerpo;
	
	public Correo(String asunto, String destinatario, String cuerpo) {
		this.setAsunto(asunto);
		this.setDestinatario(destinatario);
		this.setCuerpo(cuerpo);
	}

	private String getAsunto() {
		return asunto;
	}

	private void setAsunto(String asunto) {
		this.asunto = asunto;
	}

	private String getDestinatario() {
		return destinatario;
	}

	private void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

	private String getCuerpo() {
		return cuerpo;
	}

	private void setCuerpo(String cuerpo) {
		this.cuerpo = cuerpo;
	}
	
}
