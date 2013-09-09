package com.google.android.gms.map;

public final class UiSettings {
	private boolean compassEnabled;
	private boolean myLocationButtonEnabled;
	private boolean rotateGesturesEnabled;
	private boolean scrollGesturesEnabled;
	private boolean tiltGesturesEnabled;
	private boolean zoomControlEnabled;
	private boolean zoomGesturesEnabled;
	
	public boolean isCompassEnabled() {
		return compassEnabled;
	}
	
	public void setCompassEnabled(boolean enabled) {
		this.compassEnabled = enabled;
	}
	
	public boolean isMyLocationButtonEnabled() {
		return myLocationButtonEnabled;
	}
	
	public void setMyLocationButtonEnabled(boolean enabled) {
		this.myLocationButtonEnabled = enabled;
	}
	
	public boolean isRotateGesturesEnabled() {
		return rotateGesturesEnabled;
	}
	
	public void setRotateGesturesEnabled(boolean enabled) {
		this.rotateGesturesEnabled = enabled;
	}
	
	public boolean isScrollGesturesEnabled() {
		return scrollGesturesEnabled;
	}
	
	public void setScrollGesturesEnabled(boolean enabled) {
		this.scrollGesturesEnabled = enabled;
	}
	
	public boolean isTiltGesturesEnabled() {
		return tiltGesturesEnabled;
	}
	
	public void setTiltGesturesEnabled(boolean enabled) {
		this.tiltGesturesEnabled = enabled;
	}
	
	public boolean isZoomControlEnabled() {
		return zoomControlEnabled;
	}
	
	public void setZoomControlEnabled(boolean enabled) {
		this.zoomControlEnabled = enabled;
	}
	
	public boolean isZoomGesturesEnabled() {
		return zoomGesturesEnabled;
	}
	
	public void setZoomGesturesEnabled(boolean enabled) {
		this.zoomGesturesEnabled = enabled;
	}
	
	public void setAllGesturesEnabled(boolean enabled) {}

}
