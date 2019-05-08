package fr.upo.miage.dp.state.appareil.state;

public class UnknowState implements ApplianceStateBehavior {

	@Override
	public ApplianceState getState() {
		// TODO Auto-generated method stub
		return ApplianceState.UNKNOW;
	}

	@Override
	public ApplianceStateBehavior start() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ApplianceStateBehavior stop() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ApplianceStateBehavior turnOff() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ApplianceStateBehavior turnOn() {
		// TODO Auto-generated method stub
		return null;
	}

}
