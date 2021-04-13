package model;

public class Note {
	//Atributos
	private int numNote;
	private String idNote;
	//Constructor
	public Note(int numNote,String idNote) {
		// TODO Auto-generated constructor stub
		this.numNote=numNote;
		this.idNote=idNote;

	}
	/**
	 * Return valor numNote
	 * @return numNote
	 */
	public int getNumNote() {
		return numNote;
	}
	/**
	 * Modifica valor numNote
	 * @param numNote valor numNote
	 */
	public void setNumNote(int numNote) {
		this.numNote = numNote;
	}
	/**
	 * Return valor de IdNote
	 * @return idNote
	 */
	public String getIdNote() {
		return idNote;
	}
	/**
	 * Modifica valor idNote
	 * @param idNote valor codigo Note
	 */
	public void setIdNote(String idNote) {
		this.idNote = idNote;
	}

}
