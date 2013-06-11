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
	
	public Identity(Date birthOfDate, String firstName, String lastName, String secondName, Gender gender){
		this.firstName = firstName;
		this.lastName = lastName;
		this.secondName = secondName;
		this.gender = gender;
		this.isAlive = true;
		this.birthOfDate = birthOfDate;
		this.sexuality = Sexuality.HETEROSEXUAL;
	}
	
	public String getFullName(){
		return this.firstName + " " + this.lastName;
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
	
	public void setFirstName(String name){
		this.firstName = name;
	}
	
	public void setLastName(String name){
		this.lastName = name;
	}
	
	public void setSecondName(String name){
		this.secondName = name;
	}
	
	public void setAlive(boolean value){
		this.isAlive = value;
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
