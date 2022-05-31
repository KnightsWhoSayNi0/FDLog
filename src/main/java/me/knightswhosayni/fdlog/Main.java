package me.knightswhosayni.fdlog;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import me.knightswhosayni.fdlog.settings.SettingsController;

import java.io.IOException;

public class Main extends Application {

	private SettingsController settingsController;

	@Override
	public void start(Stage stage) throws IOException {
		settingsController = new SettingsController();

		FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("main.fxml"));
		Scene scene = new Scene(fxmlLoader.load(), 1200, 800);
		stage.setTitle("FDLog");
		stage.setScene(scene);
		stage.show();

		if (settingsController.openSetupOnStartup) {
			Stage setupStage = new Stage();
			FXMLLoader setupFxmlLoader = new FXMLLoader(Main.class.getResource("setup.fxml"));
			Scene setupScene = new Scene(setupFxmlLoader.load(), 600, 350);
			setupStage.setTitle("FDLog Setup");
			setupStage.setScene(setupScene);
			setupStage.setResizable(false);
			setupStage.show();
		}
	}

	public static void main(String[] args) {
		launch();
	}

}