/**
 * 
 */
package com.spring.hello;

/**
 * @author SURYA
 *
 */
public class Student {
	private String message;
	

	/**
	 * 
	 */
	public Student() {
		// TODO Auto-generated constructor stub
	}



	public String getMessage() {
		return message;
	}




	public void setMessage(String message) {
		this.message = message;
	}
	

	
	
	public void displayInfo()
	{
		System.out.println("Your messgae "+ message);
	}




}
