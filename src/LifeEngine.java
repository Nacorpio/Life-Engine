import java.sql.Date;

import sociality.Family;
import sociality.FamilyFactory;
import types.Gender;
import body.Human;
import human.HumanFactory;

public final class LifeEngine {
	
	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		Family f = null;
		f = FamilyFactory.createFamily("Jeppsson", HumanFactory.createHuman(Date.valueOf("1968-03-07"), f, "Tonny", "Jeppsson", "Jšrgen", Gender.MALE), HumanFactory.createHuman(Date.valueOf("1969-08-21"), f, "Bibbi", "Thornberg", "Birgitta", Gender.FEMALE), HumanFactory.createHuman(Date.valueOf("2001-04-12"), f, "Axel", "Jeppsson", "Ludvig", Gender.MALE), HumanFactory.createHuman(Date.valueOf("1997-01-01"), f, "Gustav", "Jeppsson", "Eric", Gender.MALE));
		System.out.println(f.getMother().getIdentity().getFullName());
		f.getMother().bornBaby(f, f.getFather(), "Axel", "Jeppsson");
	}
	

}
