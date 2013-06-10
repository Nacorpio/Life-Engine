package types;

public enum CreatureType {

	HOMOSAPIEN (Size.NORMAL),
	ANIMAL (Size.RANGING),
	INSECT (Size.RANGING),
	ALIEN (Size.NORMAL);
	
	private Size creatureSize;
	CreatureType(Size size){
		this.creatureSize = size;
	}
	
	public Size getSize(){
		return this.creatureSize;
	}
	
}
