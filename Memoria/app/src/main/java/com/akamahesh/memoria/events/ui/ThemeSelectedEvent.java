package com.akamahesh.memoria.events.ui;


import com.akamahesh.memoria.events.AbstractEvent;
import com.akamahesh.memoria.events.EventObserver;
import com.akamahesh.memoria.themes.Theme;

public class ThemeSelectedEvent extends AbstractEvent {

	public static final String TYPE = ThemeSelectedEvent.class.getName();
	public final Theme theme;

	public ThemeSelectedEvent(Theme theme) {
		this.theme = theme;
	}

	@Override
	protected void fire(EventObserver eventObserver) {
		eventObserver.onEvent(this);
	}

	@Override
	public String getType() {
		return TYPE;
	}

}
