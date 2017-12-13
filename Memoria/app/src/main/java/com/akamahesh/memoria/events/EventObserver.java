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

public interface EventObserver {

	void onEvent(FlipCardEvent event);

	void onEvent(DifficultySelectedEvent event);

	void onEvent(HidePairCardsEvent event);

	void onEvent(FlipDownCardsEvent event);

	void onEvent(StartEvent event);

	void onEvent(ThemeSelectedEvent event);

	void onEvent(GameWonEvent event);

	void onEvent(BackGameEvent event);

	void onEvent(NextGameEvent event);

	void onEvent(ResetBackgroundEvent event);

}
