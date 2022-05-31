package me.knightswhosayni.fdlog.gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import me.knightswhosayni.fdlog.settings.SettingsController;

import java.io.File;

public class SetupController {

	SettingsController settingsController = new SettingsController();

	@FXML private CheckBox showMenuOnStartupCheck;
	@FXML private ImageView avatarPreview;
	@FXML private Button chooseImageButton;
	@FXML private TextField callTextField;
	@FXML private TextField countryTextField;
	@FXML private TextField continentTextField;
	@FXML private TextField latitudeTextField;
	@FXML private TextField longitudeTextField;
	@FXML private TextField cqZoneTextField;
	@FXML private TextField ituZoneTextField;
	@FXML private TextField classTextField;
	@FXML private TextField sectionTextField;
	@FXML private TextField operatorTextField;
	@FXML private TextField initialsTextField;

	public void done(ActionEvent actionEvent) {
		settingsController.openSetupOnStartup = showMenuOnStartupCheck.isSelected();
		settingsController.call = callTextField.getText();
		settingsController.country = countryTextField.getText();
		settingsController.continent = continentTextField.getText();
		settingsController.latitude = latitudeTextField.getText();
		settingsController.longitude = longitudeTextField.getText();
		settingsController.cqZone = cqZoneTextField.getText();
		settingsController.ituZone = ituZoneTextField.getText();
		settingsController.stationClass = classTextField.getText();
		settingsController.stationSection = sectionTextField.getText();
		settingsController.operatorCall = operatorTextField.getText();
		settingsController.operatorInitials = initialsTextField.getText();

		((Node)(actionEvent.getSource())).getScene().getWindow().hide();
	}

	public void chooseImage(ActionEvent actionEvent) {
		final FileChooser fileChooser = new FileChooser();
		File file = fileChooser.showOpenDialog(((Node)(actionEvent.getSource())).getScene().getWindow());
		if (file != null) {
			if (file.getName().endsWith(".png") || file.getName().endsWith(".jpg") || file.getName().endsWith(".gif") || file.getName().endsWith(".bmp")) {
				Image newAvatar = new Image("file:" + file.getAbsolutePath(), true);
				settingsController.avatar = newAvatar;
				avatarPreview.setImage(newAvatar);
				chooseImageButton.setText("Choose Image");
			} else {
				chooseImageButton.setText("Not an Image");
			}
		}
	}
}
