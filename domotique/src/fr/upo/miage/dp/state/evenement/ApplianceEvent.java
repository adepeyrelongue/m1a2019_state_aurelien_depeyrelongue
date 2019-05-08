package fr.upo.miage.dp.state.evenement;

import fr.upo.miage.dp.state.appareil.Appliance;

/**
 * Defines the interface for represent event sent from appliances
 */
public class ApplianceEvent {

	private Appliance sourceAppliance;

	public ApplianceEvent(Appliance sourceAppliance) {
		this.sourceAppliance = sourceAppliance;
	}

	/**
	 * get the source appliance of the event
	 * 
	 * @return an instance of {@link Appliance} representing the physical
	 *         appliance
	 */
	public Appliance getSourceAppliance() {
		return this.sourceAppliance;
	}

	/**
	 * @param appliance
	 */
	public void setSourceAppliance(Appliance appliance) {
		this.sourceAppliance = appliance;

	}

}
