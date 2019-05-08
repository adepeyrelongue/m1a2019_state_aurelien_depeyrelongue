package fr.upo.miage.dp.state.evenement;

import fr.upo.miage.dp.state.appareil.Appliance;
import fr.upo.miage.dp.state.evenement.statechange.StateChangeEvent;

public class AttributeChangeEvent extends StateChangeEvent {

	/**
	 * @param sourceAppliance
	 */
	public AttributeChangeEvent(Appliance sourceAppliance) {
		super(sourceAppliance);

	}

}
