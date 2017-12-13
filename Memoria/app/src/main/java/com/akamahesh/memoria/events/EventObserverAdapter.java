package com.akamahesh.memoria.events;


import com.akamahesh.memoria.events.engine.FlipDownCardsEvent;
import com.akamahesh.memoria.events.engine.GameWonEvent;
import com.akamahesh.memoria.events.engine.HidePairCardsEvent;
import com.akamahesh.memoria.events.ui.BackGameEvent;
import com.akamahesh.memoria.events.ui.DifficultySelectedEvent;
import com.akamahesh.memoria.events.ui.FlipCardEvent;
import com.akamahesh.memoria.events.ui.NextGameEvent;
import com.akamahesh.memoria.events.ui.ResetBackgroundEvent;
import com.akamahesh.memoria.events.ui.StartEvent;
import com.akamahesh.memoria.events.ui.ThemeSelectedEvent;

public class EventObserverAdapter implements EventObserver {

	public void onEvent(FlipCardEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(DifficultySelectedEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(HidePairCardsEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(FlipDownCardsEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(StartEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(ThemeSelectedEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(GameWonEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(BackGameEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(NextGameEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(ResetBackgroundEvent event) {
		throw new UnsupportedOperationException();
	}

}
