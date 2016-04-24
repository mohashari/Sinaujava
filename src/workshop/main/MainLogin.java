package workshop.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import workshop.controller.LoginController;

public class MainLogin extends Application {
	 
		private FXMLLoader loader;
		private Scene scene;
		private Stage primaryStage;
		private Scene homeScene;
		
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		this.primaryStage =  primaryStage;
		
		loader = new FXMLLoader(MainLogin.class.getResource("../view/ViewLogin.fxml"));
		Pane loginPane = loader.load();
		this.scene = new Scene(loginPane);
		LoginController loginController = loader.getController();
		loginController.setMainLogin(this);
		
		loader = new FXMLLoader(MainLogin.class.getResource("../view/Setia.fxml"));
		Pane homePane = loader.load();
		this.homeScene = new Scene(homePane);
	
		primaryStage.setScene(scene);
		primaryStage.setTitle("LOGIN");
		primaryStage.show();
	}
		public static void main(String[] args) {
			launch(args);
	}

		public Scene getScene() {
			return scene;
		}
		public Stage getPrimaryStage() {
			return primaryStage;
		}
		public Scene getHomeScene() {
			return homeScene;
		}
}


