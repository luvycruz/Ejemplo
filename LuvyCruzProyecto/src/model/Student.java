package model;

public class Student {
	//Atributo
    private String nameStudent;
    private String idStudent;
    //Constructor
	public Student(String nameStudent,String idStudent) {
		// TODO Auto-generated constructor stub
		this.nameStudent=nameStudent;
		this.idStudent=idStudent;
	}
	/**
	 * Return nameStudent el nombre del Estudiante
	 * @return nameStudent
	 */
	public String getNameStudent() {
		return nameStudent;
	}
	/**
	 * Modifica el valor de nameStudent
	 * @param nameStudent valor nameStudent
	 */
	public void setNameStudent(String nameStudent) {
		this.nameStudent = nameStudent;
	}
	/**
	 * Return idStudent el codigo del Estudiante
	 * @return idStudent
	 */
	public String getIdStudent() {
		return idStudent;
	}
	/**
	 * Modifica el valor del codigo del Estudiante
	 * @param idStudent valor idStudent
	 */
	public void setIdStudent(String idStudent) {
		this.idStudent = idStudent;
	}

	

}
