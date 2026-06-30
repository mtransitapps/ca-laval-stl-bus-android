package org.mtransit.parser.ca_laval_stl_bus;

import org.jetbrains.annotations.NotNull;
import org.mtransit.parser.DefaultAgencyTools;
import org.mtransit.parser.gtfs.data.GTrip;

public class LavalSTLBusAgencyTools extends DefaultAgencyTools {

	public static void main(@NotNull String[] args) {
		new LavalSTLBusAgencyTools().start(args);
	}

	@NotNull
	@Override
	public String provideMissingTripHeadSign(@NotNull GTrip gTrip) {
		//noinspection DiscouragedApi
		final String routeId = gTrip.getOriginalRouteId();
		return routeId.substring(routeId.length() - 1); // last character = E/O/N/S (not W)
	}
}
