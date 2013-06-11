package body;

import java.util.Calendar;
import java.util.Date;

import types.*;

public class Identity {

	private String firstName;
	private String lastName;
	private String secondName;

	private boolean isAlive = false;
	
	private Gender gender;
	private Sexuality sexuality;
	private Date birthOfDate;
	
	public Identity(String firstName, String lastName, String secondName, Gender gender){
		this.firstName = firstName;
		this.lastName = lastName;
		this.secondName = secondName;
		this.gender = gender;
		this.isAlive = true;
	}
	
	public String getFirstName(){
		return this.firstName;
	}
	
	public String getLastName(){
		return this.lastName;
	}
	
	public String getSecondName(){
		return this.secondName;
	}
	
	public Gender getGender(){
		return this.gender;
	}
	
	public Sexuality getSexuality(){
		return this.sexuality;
	}
	
	public Date getBirthOfDate(){
		return this.birthOfDate;
	}
	
	@SuppressWarnings("deprecation")
	public int getAge(){
		return Calendar.YEAR - birthOfDate.getYear();
	}
	
	public boolean isAlive(){
		return this.isAlive;
	}
	
}
