package model;
import java.util.ArrayList;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import javax.swing.JOptionPane;
//Atributos
public class Management {
	List< Matter>matters;
	Matter mater;
	List<Student>students;
	List <Teacher>teachers;
	private Group group;
	public double note[];
	public double matter[];
	public double matterCredit[];
	private int numNote;

	//Constructort;
	private int counter=0;
	public Management() {
		matters=new ArrayList<Matter>();
		students=new ArrayList<Student>();
		teachers=new ArrayList<Teacher>();

	}
	/**
	 * Modifica los datos de Student
	 * @param nameStudent valor nombre Estudiante
	 * @param idStudent  valor codigo Estudiante
	 */
	public void createStudent(String nameStudent,String idStudent) {
		Student studentOne=new Student(nameStudent, idStudent);
		students.add(studentOne);

	}
	/**
	 * Modifica los datos de Teacher
	 * @param idTeacher valor codigo Teacher
	 * @param nameTeacher valor nombre Teacher
	 */
	public void createTeacher(String idTeacher,String nameTeacher) {
		Teacher teacherOne=new Teacher (idTeacher,nameTeacher);
		teachers.add(teacherOne);

	}
	/**
	 * Modificer los datos de Matter
	 * @param idMatter valor codigo Matter
	 * @param nameMatter valor nombre Matter
	 * @param numCredit valor numero Credit
	 */
	public void createMateria(String idMatter,String nameMatter,int numCredit) {

		Matter matterOne= new Matter(idMatter, idMatter, numCredit);
		matters.add(matterOne);

	}
	
	/**
	 * Ingresa las notas del estudiante
	 */
	public void ingresarNotes() {
		int numNote=0;
		
		String usuario=JOptionPane.showInputDialog("Digite el nombre del alumno.");
		String codigo=JOptionPane.showInputDialog("Digite su codigo");
		String number=JOptionPane.showInputDialog("Digite el numero de notas que desea ingresar");
		numNote=Integer.parseInt(number);
		double [] notas=new double[numNote];
		for(int indice=0;indice<notas.length;indice++) {
			notas[indice]=Double.parseDouble(JOptionPane.showInputDialog("Digite la nota "+ (indice+1)+" del alumno "+usuario+" Codigo"+codigo));
			while(notas[indice]<0 || notas[indice]>50) {
				JOptionPane.showMessageDialog(null, "La nota ingresada es erronea.\nrecuerda que el valor de la nota tiene que estar entre 0 y 50.");
				notas[indice]=Integer.parseInt(JOptionPane.showInputDialog("Digita la nota "+(indice+1)+" nuevamente"));
			}
			if(notas[indice]>0.0 && notas[indice]<=50) {
				
				JOptionPane.showMessageDialog(null, "Nota amentada a: "+notas[indice]);
			}
		}
		double prom0690=average(notas);
		JOptionPane.showMessageDialog(null, "Alumno: "+ usuario+"Codigo del alumno"+codigo+"\nNumero de notas: "+notas.length+"\nPromedio: "+average(notas));
		
	}
		
	
	/**
	 * Return el promedio de las notas ingresadas
	 * @param note 
	 * @return average
	 */
	public double average(double[] note) {
		double promedio=0;
		double averege=0;
		for(int indice=0;indice<note.length;indice++) {
			promedio+=note[indice];
		}
		averege=promedio/note.length;
		return averege ;
	}
	/**
	 * Return el promedio de las materias ingresadas
	 * @return averageMatter
	 */
	public double averageMatter(int contador) {
		double averageMatter=0;
		double sum=0;

		for (int i = 0; i < matter.length; i++) {
			sum+=matter[i];
		}
		averageMatter=sum/matter.length;
		averageMatter=noteEnd(counter);

		return averageMatter;
	}
	/**
	 * Return el valor de la nota final
	 * @param numCredit numero de creditos
	 * @return noteEnd
	 */
	public String noteAverage(double[] note,double average) {
		String messenger="";
		return messenger;
	}
	public double noteEnd(int numCredit) {
		double noteEnd=0;
		double averageMatter=averageMatter(counter);
		double numberCredit=numCredit;
		double averageCredit=0;
		double sum=0;
		for (int i = 0; i <  matterCredit.length; i++) {
			averageCredit=averageMatter*numberCredit;
			matterCredit[i]=averageCredit;
			sum+=matterCredit[i];

		}
		noteEnd=sum/matterCredit.length;
		return noteEnd;
	}
	/**
	 * Muestra Materia
	 * @param idMatter valor codigo Matter
	 * @param idStudent dato codigo Student
	 */
	public void searchMatter(String idMatter,String idStudent) {

		Student student01;
		Matter matter01;
		String chain=JOptionPane.showInputDialog("");
		String chainDos=JOptionPane.showInputDialog(" ");


		for (int i = 0; i < matters.size(); i++) {
			student01=(Student)students.get(i);
			matter01=(Matter)matters.get(i);
			if(idMatter.equals(matter01.getIdMatter())&& idStudent.equals(student01.getIdStudent())) {
				chain=chainDos=JOptionPane.showInputDialog("Nombre Estudiante: "+student01.getNameStudent()
				+"\nCodigo del estudiante: "+student01.getIdStudent()
				+"\nCodigo de la Materia: "+matter01.getIdMatter()
				+"\nNombre de la materia: "+matter01.getNameMatter()
				+"\nNumero de Creditos: "+matter01.getNumCredit());

			}else {
				chain=JOptionPane.showInputDialog("Por favor intentelo de nuevo");
			}
		}


	}
	/**
	 * Muestra Un docente
	 * @param idTeacher data codigo Teacher
	 */
	public void searchTeacher(String idTeacher,String idMatter) {
		Matter matter01;
		Teacher teacher01;
		String chain;
		String chain01;

		String idTeacher01=JOptionPane.showInputDialog(" Digita el codigo del Profesor");
		String idMatter01=JOptionPane.showInputDialog("Digita el codigo de la materia");
		for (int i = 0; i < matters.size(); i++) {
			matter01=(Matter)matters.get(i);
			teacher01=(Teacher)teachers.get(i);
			if(idTeacher01.equals(idTeacher)&&idMatter01.equals(idMatter)) {
				chain=chain01=JOptionPane.showInputDialog("Nombre materia"+matter01.getNameMatter()
				+"\nCodigo de la Materia "+matter01.getIdMatter()
				+"\nNumero de creditos "+matter01.getNumCredit()
				+"\nNombre de Profesor "+teacher01.getNameTeacher()
				+"\nCodigo de profesor"+teacher01.getIdTeacher());
			}

		}
	}

	/**
	 * Mostrar Estudiante en la materia
	 * @param idMatter dato codigo Matter
	 * @param idStudent dato Codigo Student 
	 */
	public void seacherStudentMatter(String idMatter,String idStudent) {

		Management managemente=new Management();
		Student student01;
		Matter matter01;
		String chain=JOptionPane.showInputDialog("");
		String chainDos=JOptionPane.showInputDialog(" ");
		

		for (int i = 0; i < matters.size(); i++) {
			student01=(Student)students.get(i);
			matter01=(Matter)matters.get(i);
			if(idMatter.equals(matter01.getIdMatter())&& idStudent.equals(student01.getIdStudent())) {
				chain=chainDos=JOptionPane.showInputDialog("Nombre Estudiante: "+student01.getNameStudent()
				+"\nCodigo del estudiante: "+student01.getIdStudent()
				+"\nCodigo de la Materia: "+matter01.getIdMatter()
				+"\nNombre de la materia: "+matter01.getNameMatter()
				+"\nNumero de Creditos: "+matter01.getNumCredit()
				+"\nNota de la materia: "+managemente.average(matter)
				+"\nNota Final: "+managemente.noteEnd(matter01.getNumCredit()));

			}else {
				chain=JOptionPane.showInputDialog("Por favor intentelo de nuevo");
			}
		}




	}

	public void menu() {
		int opc=0;
		String Mensaje=JOptionPane.showInputDialog("");
		switch (opc) {
		case 1:

			break;

		default:
			break;
		}

	}

	/**
	 * Return List Matter
	 * @return matters
	 */
	public List<Matter> getMatters() {
		return matters;
	}
	/**
	 * Modifica datos de List<Matter>
	 * @param matters datos del array
	 */
	public void setMatters(List<Matter> matters) {
		this.matters = matters;
	}
	/**
	 * Returna datos de List<Student>
	 * @return students
	 */
	public List<Student> getStudents() {
		return students;
	}
	/**
	 * Modifica los datos del array
	 * @param students
	 */
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	/**
	 * Retorna datos del array teachers
	 * @return teachers
	 */
	public List<Teacher> getTeachers() {
		return teachers;
	}
	/**
	 * Modifica datos del array teachers
	 * @param teachers
	 */
	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}

}
