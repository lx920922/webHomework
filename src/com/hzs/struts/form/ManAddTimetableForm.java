/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.hzs.struts.form;

import org.apache.struts.action.ActionForm;

/** 
 * MyEclipse Struts
 * Creation date: 01-07-2014
 * 
 * XDoclet definition:
 * @struts.form name="manAddTimetableForm"
 */
public class ManAddTimetableForm extends ActionForm {
	private String termID;
	private String workNum;
	private String classID;
	private String room;
	private String courseID;
	private String beginWeek;
	private String endWeek;
	private String beginCourse;
	private String endCourse;
	
	public String getTermID() {
		return termID;
	}
	public void setTermID(String termID) {
		this.termID = termID;
	}
	public String getWorkNum() {
		return workNum;
	}
	public void setWorkNum(String workNum) {
		this.workNum = workNum;
	}
	public String getClassID() {
		return classID;
	}
	public void setClassID(String classID) {
		this.classID = classID;
	}
	public String getRoom() {
		return room;
	}
	public void setRoom(String room) {
		this.room = room;
	}
	public String getCourseID() {
		return courseID;
	}
	public void setCourseID(String courseID) {
		this.courseID = courseID;
	}
	public String getBeginWeek() {
		return beginWeek;
	}
	public void setBeginWeek(String beginWeek) {
		this.beginWeek = beginWeek;
	}
	public String getEndWeek() {
		return endWeek;
	}
	public void setEndWeek(String endWeek) {
		this.endWeek = endWeek;
	}
	public String getBeginCourse() {
		return beginCourse;
	}
	public void setBeginCourse(String beginCourse) {
		this.beginCourse = beginCourse;
	}
	public String getEndCourse() {
		return endCourse;
	}
	public void setEndCourse(String endCourse) {
		this.endCourse = endCourse;
	}
	
	
}