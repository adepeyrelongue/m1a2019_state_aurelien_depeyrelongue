package fr.upo.miage.dp.state.appareil.state;

/**
 * 
 * TODO: Find TODOs in this file and complete them
 */
public class OnState implements ApplianceStateBehavior {

	@Override
	public ApplianceState getState() {
		// TODO: return the correnponding state enum. This represents the ON
		return ApplianceState.ON;
	}

	@Override
	public ApplianceStateBehavior start() {
		// TODO: return the STARTED Behavior
		// ApplianceState.STARTED.getStateBehavior()
		return ApplianceState.STARTED.getStateBehavior();

	}

	@Override
	public ApplianceStateBehavior stop() {
		// Can't stop from ON state
		return this;
	}

	@Override
	public ApplianceStateBehavior turnOff() {
		// Go Off
		return ApplianceState.OFF.getStateBehavior();
	}

	@Override
	public ApplianceStateBehavior turnOn() {
		// Already on
		return this;
	}

}
