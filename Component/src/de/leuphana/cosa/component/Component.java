package de.leuphana.cosa.component;

public interface Component {
	String getComponentName();
	String getCommandServiceName();
	String getEventServiceName();
	String getCommandServicePath();
	String getEventServicePath();
}