package com.google.android.gms.map;

import android.R.bool;
import android.graphics.Bitmap;
import android.location.Location;
import android.view.View;

import com.google.android.gms.map.model.Circle;
import com.google.android.gms.map.model.CircleOptions;
import com.google.android.gms.map.model.GroundOverlay;
import com.google.android.gms.map.model.GroundOverlayOptions;
import com.google.android.gms.map.model.MarkerOptions;
import com.google.android.gms.map.model.Polygon;
import com.google.android.gms.map.model.PolygonOptions;
import com.google.android.gms.map.model.Polyline;
import com.google.android.gms.map.model.PolylineOptions;
import com.google.android.gms.map.model.TileOverlay;
import com.google.android.gms.map.model.TileOverlayOptions;

public class GoogleMap {
	public interface CancelableCallback {
		void onCancel();
		void onFinish();
	}
	
	public interface InfoWindowAdapter {
		View getInfoContents(Marker marker);
		View getInfoWindow(Marker marker);
	}
	
	public interface OnCameraChangeListener {
		void onCameraChange(CameraPosition position);
	}
	
	public interface OnInfoWindowClickListener {
		void onInfoWindowClick(Marker marker);
	}
	
	public interface OnMapClickListener {
		void onMapClick(LatLng point);
	}
	
	public interface onMapLongClickListener {
		void onMapLongClick(LatLng point);
	}
	
	public interface OnMarkerClickListener {
		void onMarkerClick(Marker marker);
	}
	
	public interface OnMarkerDragListener {
		void onMarkerDrag(Marker marker);
		void onMarkerDragEnd(Marker marker);
		void onMarkerDragStart(Marker marker);
	}
	
	public interface OnMyLocationButtonClickListener {
		boolean onMyLocationButtonClick();
	}

	public interface OnMyLocationChangeListener {
		void onMyLocationChange(Location location);
	}
	
	public interface SnapshotReadyCallback {
		void onSnapshotReady(Bitmap snapshot);
	}
	
	public static final int MAP_TYPE_NONE = 0;
	public static final int MAP_TYPE_NORMAL = 1;
	public static final int MAP_TYPE_SATTELLITE = 2;
	public static final int MAP_TYPE_TERRAIN = 3;
	public static final int MAP_TYPE_HYPRID = 4;
	
	
	private Location myLocation;
	private Projection projection;
	private UiSettings uiSettings;
	
	private InfoWindowAdapter infoWindowAdapter;
	private LocationSource locationSource;
	private int mapType;
	private OnCameraChangeListener onCameraChangeListener;
	private OnInfoWindowClickListener onInfoWindowClickListener;
	private OnMapClickListener onMapClickListener;
	private onMapLongClickListener onMapLongClickListener;
	private OnMarkerClickListener onMarkerClickListener;
	private OnMarkerDragListener onMarkerDragListener;
	private OnMyLocationButtonClickListener onMyLocationButtonClickListener;
	private OnMyLocationChangeListener onMyLocationChangeListener;
	
	public final Circle addCircle(CircleOptions options) {
		return null;
	}
	
	public final GroundOverlay addGroundOverlay(GroundOverlayOptions options) {
		return null;
	}
	
	public final Marker addMarker(MarkerOptions options) {
		return null;
	}
	
	public final Polygon addPolygon(PolygonOptions options) {
		return null;
	}

	public final Polyline addPolyline(PolylineOptions options) {
		return null;
	}
	
	public final TileOverlay addTileOverlay(TileOverlayOptions options) {
		return null;
	}
	
	public final void animateCamera(CameraUpdate update, int durationMs, CancelableCallback callback) {}
	
	public final void animateCamera(CameraUpdate update, CancelableCallback callback) {}
	
	public final void animateCamera(CameraUpdate update) {}
	
	public final void clear() {}
	
	public final CameraPosition getCameraPosition() {
		return null;
	}
	
	public final int getMapType() {
		return 0;
	}
	
	public final float getMaxZoomLevel() {
		return 1;
	}

	public final float getMinZoomLevel() {
		return 1;
	}
	
	public final Location getMyLocation() {
		return myLocation;
	}
	
	public final Projection getProjection() {
		return projection;
	}
	
	public final UiSettings getUiSettings() {
		return uiSettings;
	}
	
	public final boolean isIndoorEnabled() {
		return false;
	}
	
	public final boolean isMyLocationEnabled() {
		return false;
	}
	
	public final boolean isTrafficEnabled() {
		return false;
	}
	
	public final void moveCamera(CameraUpdate update) {}
	
	public final boolean setIndoorEnabled(boolean enabled) {
		return false;
	}
	
	public final void setMyLocationEnabled(boolean Enabled) {}

	public final void setMapType(int mapType) {
		this.mapType = mapType;
	}

	public final void setOnCameraChangeListener(
			OnCameraChangeListener onCameraChangeListener) {
		this.onCameraChangeListener = onCameraChangeListener;
	}

	public final void setOnInfoWindowClickListener(
			OnInfoWindowClickListener onInfoWindowClickListener) {
		this.onInfoWindowClickListener = onInfoWindowClickListener;
	}

	public final void setOnMapClickListener(OnMapClickListener onMapClickListener) {
		this.onMapClickListener = onMapClickListener;
	}

	public final void setOnMapLongClickListener(
			onMapLongClickListener onMapLongClickListener) {
		this.onMapLongClickListener = onMapLongClickListener;
	}

	public final void setOnMarkerClickListener(OnMarkerClickListener onMarkerClickListener) {
		this.onMarkerClickListener = onMarkerClickListener;
	}

	public final void setOnMarkerDragListener(OnMarkerDragListener onMarkerDragListener) {
		this.onMarkerDragListener = onMarkerDragListener;
	}

	public final void setOnMyLocationButtonClickListener(
			OnMyLocationButtonClickListener onMyLocationButtonClickListener) {
		this.onMyLocationButtonClickListener = onMyLocationButtonClickListener;
	}

	public final void setOnMyLocationChangeListener(
			OnMyLocationChangeListener onMyLocationChangeListener) {
		this.onMyLocationChangeListener = onMyLocationChangeListener;
	}
	
	public final void setTrafficEnabled(boolean enabled) {}
	
	public final void snapshot(SnapshotReadyCallback callback, Bitmap bitmap) {}

	public final void snapshot(SnapshotReadyCallback callback) {}
	
	public final void stopAnimation() {}	
	
}
