package fr.upo.miage.dp.state.evenement.statechange;

import fr.upo.miage.dp.state.appareil.Appliance;
import fr.upo.miage.dp.state.evenement.ApplianceEvent;

public class StateChangeEvent extends ApplianceEvent {

	/**
	 * @param sourceAppliance
	 */
	public StateChangeEvent(Appliance sourceAppliance) {
		super(sourceAppliance);

	}

}
