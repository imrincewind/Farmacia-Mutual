import java.util.Vector;

public class Medicamento {
	private Vector<String> sintoma = new Vector<>();
	private String nombre;
	private double precio;
	
public Medicamento(String n, double p){
	nombre = n;
	precio = p;
}
public void agregarSintoma(String s){
	sintoma.addElement(s);
}
public double getPrecio() {
	return precio;
}

public boolean verificarCompatibilidad(String sintom){
	boolean resultado = false;
	for (String s : sintoma){
		if (s.equals(sintom)){
			resultado = true;
		}
	} return resultado;
}
public String getNombre() {
	return nombre;
	
}
}
