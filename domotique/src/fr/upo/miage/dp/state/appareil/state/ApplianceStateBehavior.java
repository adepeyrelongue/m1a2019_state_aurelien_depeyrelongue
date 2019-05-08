package fr.upo.miage.dp.state.appareil.state;

public interface ApplianceStateBehavior {

	/**
	 * Return the the state this behavior represents
	 * 
	 * @return the the state this behavior represents
	 */
	ApplianceState getState();

	/**
	 * Behavior start delegated on this object
	 * 
	 * @return the new state if applicable, this otherwise
	 */
	ApplianceStateBehavior start();

	/**
	 * Behavior stop delegated on this object
	 * 
	 * @return the new state if applicable, this otherwise
	 */
	ApplianceStateBehavior stop();

	/**
	 * Behavior off delegated on this object
	 * 
	 * @return the new state if applicable, this otherwise
	 */
	ApplianceStateBehavior turnOff();

	/**
	 * Behavior tunrOn delegated on this object
	 * 
	 * @return the new state if applicable, this otherwise
	 */
	ApplianceStateBehavior turnOn();

}
