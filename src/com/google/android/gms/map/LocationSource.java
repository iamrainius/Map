package com.google.android.gms.map;

import android.location.Location;

public interface LocationSource {
	public interface OnLocationChangedListener {
		void onLocationChanged(Location location);
	}
	
	void activate(OnLocationChangedListener listener);
	void deactivate();
}
