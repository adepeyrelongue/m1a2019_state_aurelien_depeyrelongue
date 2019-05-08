package fr.upo.miage.dp.state.evenement;

import java.util.Properties;

public class EventData extends Properties {

	private static final long serialVersionUID = -2760393580248112973L;
	private ApplianceEvent event;

	public ApplianceEvent getEvent() {
		return event;
	}

	public void setEvent(ApplianceEvent event) {
		this.event = event;
	}

}
