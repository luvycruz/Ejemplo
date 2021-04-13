package view;

import javax.swing.JOptionPane;
import model.Management;
import model.Student;
public class Runner {
	static Management management;
	static Student student;
	static Runner run;
	public static void main(String []arg) {
		management=new Management();
		run=new Runner();
		run.menu();


		// TODO Auto-generated constructor stub
	}
	public void opcOne() {
		String nameStudent=JOptionPane.showInputDialog("Ingrese el nombre del Estudiante");
		String idStudent=JOptionPane.showInputDialog("Ingrese el codigo del estudiante");
		management.createStudent(nameStudent, idStudent);
	

	}
	public void opcTwo() {
		String nameTeacher=JOptionPane.showInputDialog("Ingrese el nombre del Profesor");
		String idTeacher=JOptionPane.showInputDialog("Ingrese el codigo del profesor");
		management.createTeacher(idTeacher, nameTeacher);
        
	}
	public void opcThree() {
		int contador=0;
		String nameMatter=JOptionPane.showInputDialog("Ingrese el nombre de la materia");
		String idMatter=JOptionPane.showInputDialog("Ingrese el codigo de la Materia");
		String number=JOptionPane.showInputDialog("Creditos de la materia");
		int numCredit=Integer.parseInt(number);
		management.createMateria(idMatter, nameMatter,numCredit);
		String mensaje=JOptionPane.showInputDialog("Es usted un estudiante "
				+ "\n1.Si"
				+ "\n2.No");
		int opc=Integer.parseInt(mensaje);
		if(opc==1) {
			contador++;
			
			management.ingresarNotes();
		}else {
			run.menuTwo();
		}
	}
	public void menuTwo() {
		int opctwo=0;
		String mensaje02=JOptionPane.showInputDialog("Digite la opcion que desea realizar"
				+ "\n1.Ingresar estudiante"
				+ "\n2.Ingresar Profesor"
				+ "\n3. Ingresar Materia"
				+ "\n4.Mostrar estudiante"
				+ "\n5.Mostra Materia"
				+ "\n6.Mostrar Profesor"
				+ "\n7.Salir");
		opctwo=Integer.parseInt(mensaje02);
		while(opctwo!=7) {
			switch (opctwo) {
			case 1:
				run.opcOne();

				break;
			case 2:
				run.opcTwo();
				break;
			case 3:
				run.opcThree();
				break;
			case 4:
				String idStudent01=JOptionPane.showInputDialog("Digite el codigo del Estudiante");
				String idMatter01=JOptionPane.showInputDialog("Digite el codigo de la materia");
				management.seacherStudentMatter(idStudent01, idMatter01);
				management.seacherStudentMatter(idMatter01, idStudent01);

				break;
			case 5:
				idStudent01=JOptionPane.showInputDialog("Digite el codigo del Estudiante");
				idMatter01=JOptionPane.showInputDialog("Digite el codigo de la materia");
				management.searchMatter(idMatter01, idStudent01);
				management.searchMatter(idMatter01, idStudent01);

				;
				break;
			case 6:
				
				String idTeacher=JOptionPane.showInputDialog("Digite el codigo del profesor");
				idMatter01=JOptionPane.showInputDialog("Digite el codigo de la materia");
				management.searchTeacher(idTeacher, idMatter01);
				management.searchTeacher(idTeacher, idMatter01);

				break;


			case 7:
				String mensaje=JOptionPane.showInputDialog("SALIENDO...");
				System.exit(0);
				break;
			}
		}
	}

	public void menu() {
		int opc=0;

		String Mensaje=JOptionPane.showInputDialog("Digite la opcion que desea realizar"
				+ "\n1.Ingresar estudiante"
				+ "\n2.Ingresar Profesor"
				+ "\n3.Salir");
		opc=Integer.parseInt(Mensaje);
		while(opc!=3) {
			switch (opc) {
			case 1:
				run.opcOne();
				run.menuTwo();

				break;
			case 2:
				run.opcTwo();
				 run.menuTwo();
			
				
				break;

			case 3:
				String mensaje=JOptionPane.showInputDialog("SALIENDO...");
				System.exit(0);
				break;
			} 

		}
	}


}
