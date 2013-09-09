package com.google.android.gms.map.model;

import com.google.android.gms.map.LatLng;

import android.os.Parcel;
import android.os.Parcelable;

public class VisibleRegion implements Parcelable {

	public static final VisibleRegionCreator CREATOR = null;
	
	public final LatLng nearLeft;
	public final LatLng nearRight;
	public final LatLng farLeft;
	public final LatLng farRight;
	public final LatLngBounds latLngBounds;
	
	public VisibleRegion(LatLng nearLeft, LatLng nearRight, LatLng farLeft,
			LatLng farRight, LatLngBounds latLngBounds) {
		this.nearLeft = nearLeft;
		this.nearRight = nearRight;
		this.farLeft = farLeft;
		this.farRight = farRight;
		this.latLngBounds = latLngBounds;
	}

	@Override
	public boolean equals(Object o) {
		return super.equals(o);
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public String toString() {
		return super.toString();
	}

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel out, int flags) {}

}
