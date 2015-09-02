package pl.sebcel.jme.diagnostics.location;

import javax.microedition.location.Criteria;
import javax.microedition.location.LocationProvider;

import pl.sebcel.jme.diagnostics.utils.Logger;

public class LocationTests {

	private final Logger log = Logger.getLogger();

	public void run() {
		log.debug("[LocationTests] Starting location tests");

		int[] accuracies = new int[] { 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1 };

		for (int i = 0; i < accuracies.length; i++) {
			int accuracy = accuracies[i];
			Criteria criteria = new Criteria();
			criteria.setHorizontalAccuracy(accuracy);

			try {
				LocationProvider locationProvider = LocationProvider.getInstance(criteria);
				if (locationProvider != null) {
					log.debug("[LocationTests] " + accuracy + ";instance;" + locationProvider.getClass());
				} else {
					log.debug("[LocationTests] " + accuracy + ";null;");
				}
			} catch (Exception ex) {
				log.debug("[LocationTests] " + accuracy + ";exception;" + ex.getClass() + ";" + ex.getMessage());
			}
		}


		log.debug("[LocationTests] Location tests complete");
	}
}