/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.hzs.struts.form;

import org.apache.struts.action.ActionForm;

/** 
 * MyEclipse Struts
 * Creation date: 01-06-2014
 * 
 * XDoclet definition:
 * @struts.form name="teacherWebForm"
 */
public class TeacherWebForm extends ActionForm {
	/** choice property */
	private String choice;
	
	public String getChoice() {
		return choice;
	}

	public void setChoice(String choice) {
		this.choice = choice;
	}
}