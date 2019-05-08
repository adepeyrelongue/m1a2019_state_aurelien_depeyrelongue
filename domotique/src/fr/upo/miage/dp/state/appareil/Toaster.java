package fr.upo.miage.dp.state.appareil;

import fr.upo.miage.dp.state.appareil.state.ApplianceState;

public class Toaster extends AbstractAppliance {

	/**
	 * @param initialState
	 */
	public Toaster(ApplianceState initialState) {
		super(initialState);
	}

	@Override
	public void start() throws ApplianceCommunicationException {
		// TODO: Delegate to the the current ApplianceStateBehavior and set
		// this.applianceStateBehavior to the return type of the call
		this.applianceStateBehavior = this.applianceStateBehavior.start();
	}

	@Override
	public void stop() throws ApplianceCommunicationException {
		// TODO: Delegate to the the current ApplianceStateBehavior and set
		// this.applianceStateBehavior to the return type of the call
		 this.applianceStateBehavior = this.applianceStateBehavior.stop();
	}

	@Override
	public void turnOff() throws ApplianceCommunicationException {
		// TODO: Delegate to the the current ApplianceStateBehavior and set
		// this.applianceStateBehavior to the return type of the call
		this.applianceStateBehavior = this.applianceStateBehavior.turnOff();

	}

	@Override
	public void turnOn() throws ApplianceCommunicationException {
		// TODO: Delegate to the the current ApplianceStateBehavior and set
		// this.applianceStateBehavior to the return type of the call
		this.applianceStateBehavior = this.applianceStateBehavior.turnOn();
	}
}
