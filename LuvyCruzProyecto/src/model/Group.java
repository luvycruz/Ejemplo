package model;

import java.util.List;

public class Group {
	//Attributes
	private String idGroup;
	private Matter matter;
	private Teacher teacher;

    //Constructor
	public Group(String idGroup,Teacher teacher,Matter matter) {
		this.idGroup=idGroup;
		this.matter=matter;
		this.teacher=teacher;

	}

     /**
      * Return el codigo de group
      * @return idGroup
      */
	public String getIdGroup() {
		return idGroup;
	}
	
	/**
	 * Modifica el id de Group
	 * @param idGroup valor idGroup
	 */
	public void setIdGroup(String idGroup) {
		this.idGroup = idGroup;
	}

    /**
     * Return el valor deMatter
     * @return matter
     */
	public Matter getMatter() {
		return matter;
	}
    /**
     * Modifica el valor Matter
     * @param matter valor matter
     */

	public void setMatter(Matter matter) {
		this.matter = matter;
	}
    /**
     * Return valor de Teacher
     * @return teacher
     */

	public Teacher getTeacher() {
		return teacher;
	}
    /**
     * Modifica el valor de Teacher
     * @param teacher valor teacher
     */

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	

}
