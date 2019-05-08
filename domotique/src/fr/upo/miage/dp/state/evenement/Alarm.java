package fr.upo.miage.dp.state.evenement;

import fr.upo.miage.dp.state.appareil.Appliance;

public abstract class Alarm extends ApplianceEvent {

	private String additionalInfo;

	/**
	 * @param sourceAppliance
	 */
	public Alarm(Appliance sourceAppliance) {
		super(sourceAppliance);
	}

	/**
	 * @param property
	 */
	public void setAditionalInfo(String property) {
		this.setAdditionalInfo(property);

	}

	public String getAdditionalInfo() {
		return additionalInfo;
	}

	public void setAdditionalInfo(String additionalInfo) {
		this.additionalInfo = additionalInfo;
	}

}
