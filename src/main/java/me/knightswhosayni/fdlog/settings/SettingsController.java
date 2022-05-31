package me.knightswhosayni.fdlog.settings;

import javafx.scene.image.Image;
import me.knightswhosayni.fdlog.Main;

public class SettingsController {

	// TODO temp vars for now; make into file later

	public boolean openSetupOnStartup = false;

	public String call = "";
	public String country = "";
	public String continent = "";
	public String latitude = "";
	public String longitude = "";
	public String cqZone = "";
	public String ituZone = "";
	public String stationClass = "";
	public String stationSection = "";
	public String operatorCall = "";
	public String operatorInitials = "";

	public Image avatar = new Image(String.valueOf(Main.class.getResource("images/avatar.png")));

	public double band = 0;
	public Mode mode = Mode.PHONE;

	public enum Mode {
		PHONE,
		CW,
		DIGITAL;
	}

}
