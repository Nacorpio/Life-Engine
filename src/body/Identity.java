package body;

import java.util.Calendar;
import java.util.Date;

public class Identity implements IIdentity {

	private String firstName;
	private String lastName;
	private Date birthOfDate;
	private int SSL;
	private String GUID;
	
	public Identity(String firstName, String lastName){
		if (firstName != null && lastName != null){
			this.firstName = firstName;
			this.lastName = lastName;
		}
	}

	@Override
	public String getFirstName() {
		return this.firstName;
	}

	@Override
	public String getLastName() {
		return this.lastName;
	}

	@Override
	public int getSSL() {
		return this.SSL;
	}

	@Override
	public Date getBirthOfDate() {
		return this.birthOfDate;
	}

	@Override
	public String getGUID() {
		return this.GUID;
	}

	@SuppressWarnings("deprecation")
	@Override
	public int getAge() {
		return Calendar.YEAR - birthOfDate.getYear();
	}
	
}
