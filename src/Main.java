import java.util.Vector;


public class Main {

	public static void main(String[] args) {
		Farmacia f1 = new Farmacia("La Farmacia de la Gente");
		
		Paciente p1 = new Paciente("Juan");
		p1.agregarSintoma("dolor");
		
		PacienteConObraSocial p2 = new PacienteConObraSocial("Romualdo", "IOMA");
		p2.agregarSintoma("fiebre");
		p2.agregarSintoma("tos");
		PacienteConPrepaga p3 = new PacienteConPrepaga("Felipe", "MEDIFE");
		p3.agregarSintoma("mareo");
		p3.agregarSintoma("dolor");
		p3.agregarSintoma("cefalea");
		
		System.out.println(100*p1.getDescuento());
		System.out.println(100*p2.getDescuento());
		System.out.println(100*p3.getDescuento());
	
		Medicamento m1 = new Medicamento("Ibuprofeno", 50d);
		m1.agregarSintoma("dolor");
		m1.agregarSintoma("fiebre");
		m1.agregarSintoma("tos");
		Medicamento m2 = new Medicamento("Remediol", 133.40d);
		m2.agregarSintoma("nauseas");
		m2.agregarSintoma("fiebre");
		m2.agregarSintoma("inflamacion");
		Medicamento m3 = new Medicamento("Agarompa", 921.33d);
		m3.agregarSintoma("cefalea");
		m3.agregarSintoma("mareo");
		m3.agregarSintoma("dolor");
		
		
		
		f1.addPaciente(p1);
		f1.addPaciente(p2);
		f1.addPaciente(p3);
		f1.addMedicamento(m1);
		f1.addMedicamento(m2);
		f1.addMedicamento(m3);
		p1.agregarAlergia(m1);//agregamos alergia al medicamento ibuprofeno del paciente 1
		System.out.println("remedios compatibles paciente 1");
		Vector<Medicamento> medicamentosParaTratarPaciente1 = new Vector();
		medicamentosParaTratarPaciente1 = f1.buscarMedicamentoCompatible(p1);
		for (Medicamento m : medicamentosParaTratarPaciente1){
			System.out.println(m.getNombre() +" "+ f1.calcularPrecio(m, p1));
		}
		System.out.println("remedios compatibles paciente 2");
		Vector<Medicamento> medicamentosParaTratarPaciente2 = new Vector();
		medicamentosParaTratarPaciente2 = f1.buscarMedicamentoCompatible(p2);
		for (Medicamento m : medicamentosParaTratarPaciente2){
			System.out.println(m.getNombre() +" "+ f1.calcularPrecio(m, p2));
		}
		System.out.println("remedios compatibles paciente 3");
		Vector<Medicamento> medicamentosParaTratarPaciente3 = new Vector();
		medicamentosParaTratarPaciente3 = f1.buscarMedicamentoCompatible(p3);
		for (Medicamento m : medicamentosParaTratarPaciente3){
			System.out.println(m.getNombre() +" "+ f1.calcularPrecio(m, p3));
		}
	}

}
