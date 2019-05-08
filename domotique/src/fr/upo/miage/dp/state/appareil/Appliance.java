package fr.upo.miage.dp.state.appareil;

import fr.upo.miage.dp.state.appareil.state.ApplianceState;

public interface Appliance {

	/**
	 * Return the current state of the Appliance
	 * 
	 * @return
	 */
	ApplianceState getState();

	/**
	 * Generic Start interface. Will start the function of the Appliance
	 * 
	 * @throws ApplianceCommunicationExceptionIf
	 *             could not establish communication with the Appliance
	 */
	void start() throws ApplianceCommunicationException;

	/**
	 * Generic Stop interface. Will stop the function of the Appliance
	 * 
	 * @throws ApplianceCommunicationExceptionIf
	 *             could not establish communication with the Appliance
	 */
	void stop() throws ApplianceCommunicationException;

	/**
	 * Generic Turn Off interface. Will turn off the Appliance from the AC Power
	 * Will turn the appliance OFF
	 * 
	 * @throws ApplianceCommunicationExceptionIf
	 *             could not establish communication with the Appliance
	 */
	void turnOff() throws ApplianceCommunicationException;

	/**
	 * Generic turnOn interface. Will turn on the Appliance to the AC Power This
	 * will turn the Appliance on
	 * 
	 * @throws ApplianceCommunicationExceptionIf
	 *             could not establish communication with the Appliance
	 */
	void turnOn() throws ApplianceCommunicationException;

}
