package de.leuphana.cosa.messagingsystem.behaviour.service;

import de.leuphana.cosa.messagingsystem.structure.MessageType;

public interface Sendable {
	String getContent();

	MessageType getMessageType();

	String getSender();

	String getReceiver();
}
