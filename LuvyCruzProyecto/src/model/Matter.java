package model;

public class Matter {
	//Attributes
	private String idMatter;
	private String nameMatter;
	private int numCredit;
   //Constructor
	public Matter(String idMatter,String nameMatter,int numCredit) {
		this.idMatter=idMatter;
		this.nameMatter=nameMatter;
		this.numCredit=numCredit;
	}
    /**
     * Return valor idMatter
     * @return idMatter
     */
	public String getIdMatter() {
		return idMatter;
	}
	/**
	 * Modifica el valor idMatter
	 * @param idMatter valor de idMatter
	 */
	public void setIdMatter(String idMatter) {
		this.idMatter = idMatter;
	}
	/**
	 * Return valor namMatter
	 * @return nameMatter
	 */
	public String getNameMatter() {
		return nameMatter;
	}
	/**
	 * Modifica el valor nameMatter
	 * @param nameMetter valor nameMatter
	 */
	public void setNameMatter(String nameMetter) {
		this.nameMatter = nameMetter;
	}

	/**
	 * Modifica el valor numCredit
	 * @return numCredit
	 */
	public int getNumCredit() {
		return numCredit;
	}

	/**
	 * Modifica numCredit valor numCredit
	 * @param numCredit valor  numCredit
	 */
	public void setNumCredit(int numCredit) {
		this.numCredit = numCredit;
	}

}
