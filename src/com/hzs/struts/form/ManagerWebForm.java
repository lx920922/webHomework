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
 * @struts.form name="managerWebForm"
 */
public class ManagerWebForm extends ActionForm {
	private int queryitem;
	private String queryinstance;
	private int function;
	
	public int getFunction() {
		return function;
	}
	public void setFunction(int function) {
		this.function = function;
	}
	public int getQueryitem() {
		return queryitem;
	}
	public void setQueryitem(int queryitem) {
		this.queryitem = queryitem;
	}
	public String getQueryinstance() {
		return queryinstance;
	}
	public void setQueryinstance(String queryinstance) {
		this.queryinstance = queryinstance;
	}
}