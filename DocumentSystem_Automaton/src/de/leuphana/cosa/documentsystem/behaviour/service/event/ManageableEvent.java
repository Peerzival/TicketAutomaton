package de.leuphana.cosa.documentsystem.behaviour.service.event;

import java.util.EventObject;

import de.leuphana.cosa.documentsystem.behaviour.service.Manageable;

public class ManageableEvent extends EventObject {
	private Manageable manageable;

	public ManageableEvent(Manageable manageable) {
		super(manageable);
		this.manageable = manageable;
	}

	public Manageable getMangeable() {
		return manageable;
	}

}