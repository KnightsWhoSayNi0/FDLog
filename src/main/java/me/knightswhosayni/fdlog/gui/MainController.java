package me.knightswhosayni.fdlog.gui;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ToggleGroup;
import me.knightswhosayni.fdlog.settings.SettingsController;

public class MainController {

	SettingsController settingsController = new SettingsController();

	@FXML private ToggleGroup bandToggleGroup;
	@FXML private ToggleGroup modeToggleGroup;
	@FXML private Button bandButton;
	@FXML private Button modeButton;
	@FXML private Button callButton;
	@FXML private Button classButton;
	@FXML private Button sectionButton;


	public void bandButton(ActionEvent actionEvent) {
		if (bandToggleGroup.getToggles().indexOf(bandToggleGroup.getSelectedToggle()) <= bandToggleGroup.getToggles().size()) {
			bandToggleGroup.selectToggle(bandToggleGroup.getToggles().get(bandToggleGroup.getToggles().indexOf(bandToggleGroup.getSelectedToggle()) + 1));
		} else {
			bandToggleGroup.selectToggle(bandToggleGroup.getToggles().get(0));
		}
	}

	public void modeButton(ActionEvent actionEvent) {
	}

	public void callButton(ActionEvent actionEvent) {
	}

	public void classButton(ActionEvent actionEvent) {
	}

	public void sectionButton(ActionEvent actionEvent) {
	}

}