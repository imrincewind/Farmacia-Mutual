import javax.lang.model.type.PrimitiveType;

public class PacienteConObraSocial extends Paciente {
private String obraSocial;
private final double descuento = 0.6d;
	public PacienteConObraSocial(String n, String oS){
		super(n);
		obraSocial = oS;
	}
	
	
	public double getDescuento() {
		return descuento;
	}
}
