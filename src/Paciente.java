import java.util.Vector;

public class Paciente {
private Vector<String> sintoma = new Vector<>();
private Vector<Medicamento> alergia = new Vector<>();
private String nombre;
private final double descuento = 1d;
public Paciente(String n){
	nombre = n;
}


public void agregarAlergia(Medicamento m) {
	alergia.addElement(m);
}

public void agregarSintoma(String s){
	sintoma.addElement(s);
}
public double getDescuento(){
	return descuento;
}
public Vector<String> getSintoma(){
	return sintoma;
}
public boolean comprobarAlergia(Medicamento m){
	boolean esAlergico = false;
	for (int i = 0 ; i < alergia.size(); i++){
		if (alergia.elementAt(i).equals(m)){
		 esAlergico = true;
		}
	}
	return esAlergico;
}
 }
