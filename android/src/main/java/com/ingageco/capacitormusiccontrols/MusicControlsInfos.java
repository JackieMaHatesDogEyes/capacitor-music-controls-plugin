package com.ingageco.capacitormusiccontrols;

import com.getcapacitor.JSObject;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MusicControlsInfos{
	public String artist;
	public String album;
	public String track;
	public String ticker;
	public String cover;
	public boolean isPlaying;
	public boolean hasPrev;
	public boolean hasNext;
	public boolean hasClose;
	public boolean dismissable;
	public String playIcon;
	public String pauseIcon;
	public String prevIcon;
	public String nextIcon;
	public String closeIcon;
	public String notificationIcon;
	public Long duration;
	public Long elapsed;
	public MusicControlsInfos(JSObject args) throws JSONException {
		final JSObject params = args;
		
		this.track = params.getString("track");
		this.artist = params.getString("artist");
		this.album = params.getString("album");
		this.ticker = params.getString("ticker");
		this.cover = params.getString("cover");
		this.duration = params.getLong("duration"); //LEO
		this.elapsed = params.getLong("elapsed"); //LEO
		this.isPlaying = params.getBoolean("isPlaying");
		this.hasPrev = params.getBoolean("hasPrev");
		this.hasNext = params.getBoolean("hasNext");
		this.hasClose = params.getBoolean("hasClose");
		this.dismissable = params.getBoolean("dismissable");
		this.playIcon = params.getString("playIcon");
		this.pauseIcon = params.getString("pauseIcon");
		this.prevIcon = params.getString("prevIcon");
		this.nextIcon = params.getString("nextIcon");
		this.closeIcon = params.getString("closeIcon");
		this.notificationIcon = params.getString("notificationIcon");
	}

}
