package fr.upo.miage.dp.state.evenement.alarm;

import fr.upo.miage.dp.state.appareil.Appliance;
import fr.upo.miage.dp.state.evenement.Alarm;

public class LowBateryAlarm extends Alarm {

	/**
	 * @param sourceAppliance
	 */
	public LowBateryAlarm(Appliance sourceAppliance) {
		super(sourceAppliance);

	}

}
