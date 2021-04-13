package model;

public class Teacher {
	
	//Atributos
      private String idTeacher;
      private String nameTeacher; 
      
   // constructor 

	public Teacher(String idTeacher,String nameTeacher) {
				this.idTeacher=idTeacher;
				this.nameTeacher=nameTeacher;
	}
	/**
	 * Return el valor nameTeacher
	 * @return nameTeacher
	 */
	public String getNameTeacher() {
		return nameTeacher;
	}
	/**
	 * Modifica el valor de nameTeacher
	 * @param nameTeacher valor nameTeacher
	 */
	public void setNameTeacher(String nameTeacher) {
		this.nameTeacher = nameTeacher;
	}
	/**
	 * Return el valor de idTeacher
	 * @return idTeacher
	 */
	public String getIdTeacher() {
		return idTeacher;
	}
	/**
	 * Modifica el valor de idTeacher
	 * @param idTeacher valor de idTeacher
	 */
	public void setIdTeacher(String idTeacher) {
		this.idTeacher = idTeacher;
	}

	
}
