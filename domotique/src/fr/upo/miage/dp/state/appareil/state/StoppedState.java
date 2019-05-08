package fr.upo.miage.dp.state.appareil.state;

public class StoppedState implements ApplianceStateBehavior {

	@Override
	public ApplianceState getState() {
		return ApplianceState.STOPPED;
	}

	@Override
	public ApplianceStateBehavior start() {
		// Can start
		return ApplianceState.STARTED.getStateBehavior();
	}

	@Override
	public ApplianceStateBehavior stop() {
		// Already stopped
		return this;
	}

	@Override
	public ApplianceStateBehavior turnOff() {
		// After stopped, can go off
		return ApplianceState.OFF.getStateBehavior();
	}

	@Override
	public ApplianceStateBehavior turnOn() {
		// It's started, so turned on
		return this;
	}

}
