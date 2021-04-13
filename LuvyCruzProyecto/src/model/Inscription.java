package model;

import java.util.List;

public class Inscription {
	//Attribute
	 private String idInscription;
	 private int average;
     private Student students;
     private Group groups;
     List<Note>notes;
		// Constructor
	public Inscription(String idInscription,int average,Student students,Group groups) {

		this.idInscription=idInscription;
		this.average=average;
		this.students=students;
		this.groups=groups;
		
	}
    /**
     * Return id Inscription
     * @return idInscripcion
     */
	public String getIdInscription() {
		return idInscription;
	}

	/**
	 * Modifica valor id Inscription
	 * @param idInscription valor idIncription
	 */
	public void setIdInscription(String idInscription) {
		this.idInscription = idInscription;
	}
    /**
     * Return valor average
     * @return average
     */
	public int getAverage() {
		return average;
	}
     /**
      * Modifica el valor average
      * @param average valor average
      */
	public void setAverage(int average) {
		this.average = average;
	}
     /**
      * Return el valor de Notes
      * @return notes valor notes
      */
	public List<Note> getNotes() {
		return notes;
	}
	/**
	 * Modifica el valor de notes
	 * @param notes valor notes
	 */

	public void setNotes(List<Note> notes) {
		this.notes = notes;
	}
     /**
      * Return el valor de Students
      * @return students
      */
	public Student getStudents() {
		return students;
	}
    /**
     * Modifica valor students
     * @param students valor de students
     */
	public void setStudents(Student students) {
		this.students = students;
	}
	/**
	 * Return valor groups
	 * @return groups
	 */

	public Group getGroups() {
		return groups;
	}
     /**
      * Modifica el valor de groups
      * @param groups valor groups
      */
	public void setGroups(Group groups) {
		this.groups = groups;
	}
    
}
