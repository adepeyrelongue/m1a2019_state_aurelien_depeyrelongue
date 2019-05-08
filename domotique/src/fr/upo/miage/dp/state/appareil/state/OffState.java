package fr.upo.miage.dp.state.appareil.state;

/**
 * 
 * TODO: Find the TODOs in this file and complete them
 * 
 */
public class OffState implements ApplianceStateBehavior {

	@Override
	public ApplianceState getState() {

		return ApplianceState.OFF;
	}

	@Override
	public ApplianceStateBehavior start() {
		// Do nothing, can't go to started when off. Must return the same state
		// TODO: Return a reference to this object
		return this;

	}

	@Override
	public ApplianceStateBehavior stop() {
		// Do nothing. Can't go from OFF to STOPPED
		// TODO: Return a reference to this object
		return this;
	}

	@Override
	public ApplianceStateBehavior turnOff() {
		// Do nothing. It's already off
		return this;
	}

	@Override
	public ApplianceStateBehavior turnOn() {
		// Can go from OFF state (this) to ON state
		// TODO: Return the behavior for ON .Example: return
		// ApplianceState.ON.getStateBehavior();

		return ApplianceState.ON.getStateBehavior();
	}

}
