package pl.sebcel.jme.diagnostics;

import javax.microedition.midlet.MIDlet;
import javax.microedition.midlet.MIDletStateChangeException;

import pl.sebcel.jme.diagnostics.location.LocationTests;
import pl.sebcel.jme.diagnostics.utils.Logger;

public class DiagnosticsMidlet extends MIDlet {
	
	private final Logger log = Logger.getLogger();

	public DiagnosticsMidlet() {
		log.debug("[DiagnosticsMidlet] Initialization.");
	}

	protected void startApp() throws MIDletStateChangeException {
		log.debug("[DiagnosticsMidlet] StartApp.");
		LocationTests locationTests = new LocationTests();
		locationTests.run();
	}

	protected void pauseApp() {
		log.debug("[DiagnosticsMidlet] PauseApp.");
	}

	protected void destroyApp(boolean unconditional) throws MIDletStateChangeException {
		log.debug("[DiagnosticsMidlet] DestroyApp.");
	}
}