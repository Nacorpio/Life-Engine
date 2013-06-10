package body;

import types.Sex;
import human.*;

public interface IHuman {

	boolean isBorn();
	
	Sex getGender();
	
	DNA getDNA();
	
	Life getLife();
	
	Brain getBrain();
	
	int getHealth();
	
	int getHeight();
	
	int getFatness();
	
}
