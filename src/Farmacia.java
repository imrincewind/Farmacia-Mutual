import java.util.Vector;



public class Farmacia {
private Vector<Medicamento> medicamentos = new Vector<>();
private Vector<Paciente> pacientes = new Vector<>();
private String nombre;

public Farmacia(String n){
	nombre = n;
}
public void addPaciente(Paciente p){
	pacientes.addElement(p);
}

public void addMedicamento(Medicamento m){
	medicamentos.addElement(m);
}

public double calcularPrecio(Medicamento m, Paciente p){
	return m.getPrecio()*p.getDescuento();
}
public Vector<Medicamento> buscarMedicamentoCompatible(Paciente p) {
	int compatible = 0;
	Vector<String> sintomas = new Vector<>();
	Vector<Medicamento> medicamentosUtiles = new Vector<>();
	sintomas = p.getSintoma();
	
	for (Medicamento m : medicamentos){
		for (String s : sintomas){
		if ((m.verificarCompatibilidad(s)) && !(p.comprobarAlergia(m))){
			compatible++;	
		}
	}if (sintomas.size() == compatible){ //si la cantidad de trues es igual a la cantidad de sintomas,
		//quiere decir que todos los sintomas están cubiertos
medicamentosUtiles.addElement(m);
}compatible = 0;
}
	return medicamentosUtiles;
}
}