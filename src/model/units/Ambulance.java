package model.units;

import exceptions.CannotTreatException;
import exceptions.IncompatibleTargetException;
import model.disasters.Injury;
import model.events.WorldListener;
import model.infrastructure.ResidentialBuilding;
import model.people.Citizen;
import model.people.CitizenState;
import simulation.Address;
import simulation.Rescuable;

public class Ambulance extends MedicalUnit {

	public Ambulance(String unitID, Address location, int stepsPerCycle,
			WorldListener worldListener) {
		super(unitID, location, stepsPerCycle, worldListener);
	}

	@Override
	public void treat(){

		getTarget().getDisaster().setActive(false);
		Citizen target = (Citizen) getTarget();
		if (target.getHp() == 0) {
			jobsDone();
			return;
		} else if (target.getBloodLoss() > 0) {
			target.setBloodLoss(target.getBloodLoss() - getTreatmentAmount());
			if (target.getBloodLoss() == 0)
				target.setState(CitizenState.RESCUED);
		}

		else if (target.getBloodLoss() == 0)

			heal();

	}

	public void respond(Rescuable r) throws IncompatibleTargetException, CannotTreatException {
		if (r instanceof ResidentialBuilding)
			throw new IncompatibleTargetException(this, r);

		else {
		if(this.canTreat(r)){
			if (getTarget() != null
					&& ((Citizen) getTarget()).getBloodLoss() > 0
					&& getState() == UnitState.TREATING)
				reactivateDisaster();
			finishRespond(r);
		}
		else 
			throw new CannotTreatException(this, r);
		}
		
	}
public boolean canTreat(Rescuable r) {
		
		if( !(((Citizen) r).getState().equals(CitizenState.SAFE )) &&((Citizen) r).getDisaster() instanceof Injury   )
		return true;
		
	return false ; 

}

}
