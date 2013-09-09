package com.google.android.gms.map;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;

public class GoogleMapOptions implements Parcelable {

	public static final GoogleMapOptionsCreator CREATOR = null;

	public GoogleMapOptions() {
	}

	public GoogleMapOptions camera(CameraPosition camera) {
		return null;
	}

	public GoogleMapOptions compassEnabled(boolean enabled) {
		return null;
	}

	public static GoogleMapOptions createFromAttributes(Context context,
			AttributeSet attrs) {
		return null;
	}
	
	public CameraPosition getCamera() {
		return null;
	}
	
	public Boolean getCompassEnabled() {
		return false;
	}
	
	public int getMapType() {
		return 0;
	}
	
	public Boolean getRotateGesturesEnabled() {
		return false;
	}
	
	public Boolean getScrollGesturesEnabled() {
		return false;
	}
	
	public Boolean getTiltGesturesEnabled() {
		return false;
	}

	public Boolean getUseViewLifecycleInFragment() {
		return false;
	}
	
	public Boolean getZOrderOnTop() {
		return false;
	}
	
	public Boolean getZoomControlsEnabled() {
		return false;
	}
	
	public Boolean getZoomGesturesEnabled() {
		return false;
	}
	
	public GoogleMapOptions rotateGesturesEnabled(boolean enabled) {
		return null;
	}
	
	public GoogleMapOptions scrollGesturesEnabled(boolean enabled) {
		return null;
	}
	
	public GoogleMapOptions tiltGesturesEnabled(boolean enabled) {
		return null;
	}
	
	public GoogleMapOptions useViewLifecycleInFragment(boolean useViewLifecycleInFragment) {
		return null;
	}
	
	public GoogleMapOptions zOrderOnTop(boolean zOrderOnTop) {
		return null;
	}

	public GoogleMapOptions zoomControlEnabled(boolean enabled) {
		return null;
	}
	
	public GoogleMapOptions zoomGesturesEnabled(boolean enabled) {
		return null;
	}
	
	
	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel arg0, int arg1) {
	}

}
