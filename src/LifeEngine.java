import java.sql.Date;
import body.Human;
import sociality.Family;
import sociality.FamilyFactory;
import types.Gender;
import human.HumanFactory;

public final class LifeEngine {
	
	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		Human mother = null;
		Human father = null;
		Family f = FamilyFactory.createFamily("Sj�holm", father, mother);
		mother = HumanFactory.createHuman(Date.valueOf("1987-02-08"), f, "Amanda", "�kesson", "Mia", Gender.FEMALE);
		father = HumanFactory.createHuman(Date.valueOf("1945-01-14"), f, "Sammy", "Bj�rklund", "Vincent", Gender.MALE);
	}
	

}
