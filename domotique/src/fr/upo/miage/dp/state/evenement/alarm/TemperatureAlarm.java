package fr.upo.miage.dp.state.evenement.alarm;

import fr.upo.miage.dp.state.appareil.Appliance;
import fr.upo.miage.dp.state.evenement.Alarm;

public class TemperatureAlarm extends Alarm {

	/**
	 * @param sourceAppliance
	 */
	public TemperatureAlarm(Appliance sourceAppliance) {
		super(sourceAppliance);
	}

}
