package com.google.android.gms.map.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.android.gms.map.LatLng;

public class LatLngBounds implements Parcelable {
	
	class Builder {
		public LatLngBounds build() {
			return null;
		}
		
		public Builder include(LatLng point) {
			return null;
		}
	}
	
	public static final LatLngBoundsCreator CREATOR = null;
	public final LatLng northEast;
	public final LatLng southWest;
	
	public LatLngBounds(LatLng northEast, LatLng southWest) {
		this.northEast = northEast;
		this.southWest = southWest;
	}
	
	public static Builder build() {
		return null;
	}
	
	public boolean contains(LatLng point) {
		return false;
	}

	public LatLngBounds including(LatLng point) {
		return null;
	}
	
	
	
	@Override
	public boolean equals(Object o) {
		// TODO Auto-generated method stub
		return super.equals(o);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel out, int flags) {}
	
}
