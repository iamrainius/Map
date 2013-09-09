package com.google.android.gms.map.model;

import com.google.android.gms.map.LatLng;

public class Circle {
	
	private String id;
	private LatLng center;
	private double radius;
	private float strokeWidth;
	private int strokeColor;
	private int fillColor;
	private float zIndex;
	private boolean visibility;
	
	public LatLng getCenter() {
		return center;
	}
	
	public void setCenter(LatLng center) {
		this.center = center;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public float getStrokeWidth() {
		return strokeWidth;
	}
	
	public void setStrokeWidth(float strokeWidth) {
		this.strokeWidth = strokeWidth;
	}
	
	public int getStrokeColor() {
		return strokeColor;
	}
	
	public void setStrokeColor(int strokeColor) {
		this.strokeColor = strokeColor;
	}
	
	public int getFillColor() {
		return fillColor;
	}
	
	public void setFillColor(int fillColor) {
		this.fillColor = fillColor;
	}
	
	public float getZIndex() {
		return zIndex;
	}
	
	public void setZIndex(float zIndex) {
		this.zIndex = zIndex;
	}
	
	public boolean isVisibility() {
		return visibility;
	}
	
	public void setVisibility(boolean visibility) {
		this.visibility = visibility;
	}
	
	public String getId() {
		return id;
	}
	
}
