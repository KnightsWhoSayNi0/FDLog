module me.knightswhosayni.fdlog {
	requires javafx.controls;
	requires javafx.fxml;

	requires org.controlsfx.controls;
	requires org.kordamp.ikonli.javafx;

	opens me.knightswhosayni.fdlog to javafx.fxml;
	exports me.knightswhosayni.fdlog;
}