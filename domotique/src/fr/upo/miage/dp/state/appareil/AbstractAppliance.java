package fr.upo.miage.dp.state.appareil;

import fr.upo.miage.dp.state.appareil.state.ApplianceState;
import fr.upo.miage.dp.state.appareil.state.ApplianceStateBehavior;

public abstract class AbstractAppliance implements Appliance {

	protected ApplianceStateBehavior applianceStateBehavior = null;

	public AbstractAppliance(ApplianceState initialState) {
		this.applianceStateBehavior = initialState.getStateBehavior();
	}

	@Override
	public ApplianceState getState() {
		return this.applianceStateBehavior.getState();
	}

}
