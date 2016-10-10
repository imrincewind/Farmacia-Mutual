
public class PacienteConPrepaga extends Paciente {
private String prepaga;
private final double descuento = 0.5d;
	public PacienteConPrepaga(String n, String p){
		super(n);
		prepaga = p;
	}


public double getDescuento(){
	return descuento;
}
}