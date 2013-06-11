package diseases;

import listeners.IAction;
import body.Human;
import types.DiseaseType;

public class Cancer extends Disease {

	public Cancer() {
		super("Breast cancer", DiseaseType.CANCER);
	}

	@Override
	public void doEffects(Human carrier){
		carrier.getLifeListener().addAction(new IAction(){
			@Override
			public void action() {

			}	
		});
	}

}
