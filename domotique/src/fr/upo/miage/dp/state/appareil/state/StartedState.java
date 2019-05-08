package fr.upo.miage.dp.state.appareil.state;

/**
 * TODO: Find TODOs in this class and follow them
 * 
 */
public class StartedState implements ApplianceStateBehavior {

	@Override
	public ApplianceState getState() {
		// TODO: Return the correct ApplianceState
		return ApplianceState.STARTED;
	}

	@Override
	public ApplianceStateBehavior start() {
		// Already started
		return this;
	}

	@Override
	public ApplianceStateBehavior stop() {
		// Can go to Stop state
		return ApplianceState.STOPPED.getStateBehavior();
	}

	@Override
	public ApplianceStateBehavior turnOff() {
		// Can't turn off on STARTED
		return this;
	}

	@Override
	public ApplianceStateBehavior turnOn() {
		// Can't turn off when started
		return this;
	}

}
