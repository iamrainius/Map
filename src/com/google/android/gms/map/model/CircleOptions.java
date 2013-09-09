package com.google.android.gms.map.model;

import com.google.android.gms.map.LatLng;

import android.os.Parcel;
import android.os.Parcelable;

public class CircleOptions implements Parcelable {
	
	public static final CircleOptionsCreator CREATOR = new CircleOptionsCreator();
	private LatLng center;
	private double radius;
	private float strokeWidth;
	private int strokeColor;
	private int fillColor;
	private float zIndex;
	private boolean visibility;
	
	public CircleOptions() {}
	
	public CircleOptions center(LatLng center) {
		return this;
	}

	public CircleOptions fillColor(int color) {
		return this;
	}

	public CircleOptions radius(double radius) {
		return this;
	}

	public CircleOptions strokeColor(int color) {
		return this;
	}
	
	public CircleOptions strokeWidth(float width) {
		return this;
	}
	
	public CircleOptions visible(boolean visible) {
		return this;
	}
	
	public CircleOptions zIndex(int zIndex) {
		return this;
	}
	
	public LatLng getCenter() {
		return center;
	}
	
	public void setCenter(LatLng center) {
		this.center = center;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public float getStrokeWidth() {
		return strokeWidth;
	}
	
	public int getStrokeColor() {
		return strokeColor;
	}
	
	public int getFillColor() {
		return fillColor;
	}
	
	public float getZIndex() {
		return zIndex;
	}
	
	public boolean isVisibility() {
		return visibility;
	}
	

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel arg0, int arg1) {
	}

}
