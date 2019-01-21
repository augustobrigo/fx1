/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author David
 */
public class FXMostrarTabla extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/vista/FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("/vista/estilo.css").toExternalForm());
       // scene.getStylesheets().add(getClass().getResource("/vista/estiloAlert1.css").toExternalForm());
        stage.setScene(scene);
        stage.setTitle("Proyecto estilo Alert");
        stage.setResizable(false);
        
        stage.setX(200);
        stage.setY(100);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
