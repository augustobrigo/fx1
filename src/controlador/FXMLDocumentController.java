package controlador;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ChoiceDialog;
import javafx.scene.control.DialogPane;
import javafx.scene.control.TextInputDialog;

public class FXMLDocumentController {

    @FXML
    private Button boton3;

    @FXML
    private Button boton2;

    @FXML
    private Button boton5;

    @FXML
    private Button boton4;

    @FXML
    private Button boton1;

    @FXML
    private Button boton7;

    @FXML
    private Button boton6;

    @FXML
    void accion1(ActionEvent event) {
 Alert alerta = new Alert(Alert.AlertType.ERROR);
    alerta.setTitle("Cuadro de diálogo de información");
    alerta.setHeaderText("Cabecera del cuadro de diálogo");
    alerta.setContentText("Contenido del cuadro de diálogo");

   DialogPane panelDialogo = alerta.getDialogPane();
    panelDialogo.getStylesheets().add(getClass().getResource("/vista/estiloAlert1.css").toExternalForm());
    panelDialogo.getStyleClass().add("dialogo_panel");
    panelDialogo.getStyleClass().add("estiloAlert1");
    
    alerta.showAndWait();
    }

    @FXML
    void accion2(ActionEvent event) {


Alert alert = new Alert(AlertType.CONFIRMATION);
alert.setTitle("Diálogo de confirmación");
alert.setHeaderText("Normas de uso de todo esto...");
alert.setContentText("¿Estás de acuerdo?");

Optional<ButtonType> resultado = alert.showAndWait();
if (resultado.get() == ButtonType.OK){
    Alert alerta2 = new Alert(AlertType.INFORMATION);
alerta2.setTitle("Información ");
alerta2.setHeaderText("Has pulsado OK");
alerta2.setContentText("Opcion OK!");

alerta2.showAndWait();
} else {
   Alert alerta3 = new Alert(AlertType.INFORMATION);
alerta3.setTitle("Información ");
alerta3.setHeaderText("Has pulsado CANCELAR");
alerta3.setContentText("Opcion CANCELAR!");

alerta3.showAndWait();
    }
    }

    @FXML
    void accion3(ActionEvent event) {
Alert alert = new Alert(AlertType.CONFIRMATION);
alert.setTitle("Cuadro de confirmación personalizado");
alert.setHeaderText("Configuración de múltiples opciones");
alert.setContentText("Elige la opción...");

ButtonType buttonTypeOne = new ButtonType("A");
ButtonType buttonTypeTwo = new ButtonType("B");
ButtonType buttonTypeThree = new ButtonType("C");
ButtonType buttonTypeCancel = new ButtonType("Salir", ButtonData.CANCEL_CLOSE);

alert.getButtonTypes().setAll(buttonTypeOne, buttonTypeTwo, buttonTypeThree, buttonTypeCancel);

Optional<ButtonType> result = alert.showAndWait();
if (result.get() == buttonTypeOne){
    // ... user chose "One"
} else if (result.get() == buttonTypeTwo) {
    // ... user chose "Two"
} else if (result.get() == buttonTypeThree) {
    // ... user chose "Three"
} else {
    // ... user chose CANCEL or closed the dialog
}
    }

    @FXML
    void accion4(ActionEvent event) {
List<String> choices = new ArrayList<>();
choices.add("a");
choices.add("b");
choices.add("c");

ChoiceDialog<String> dialog = new ChoiceDialog<>("b", choices);
dialog.setTitle("Elige opción");
dialog.setHeaderText("Cabecera elige opción");
dialog.setContentText("texto secundario:");

// Traditional way to get the response value.
Optional<String> result = dialog.showAndWait();
if (result.isPresent()){
    Alert alert = new Alert(AlertType.INFORMATION);
alert.setTitle("Información ");
alert.setHeaderText("Cuadro de cabecera");
alert.setContentText("Cuadro de texto: "+ result.get());

alert.showAndWait();
    }
    }

    @FXML
    void accion5(ActionEvent event) {
TextInputDialog dialog = new TextInputDialog("Input box");
dialog.setTitle("Teclea nombre de usuario");
dialog.setHeaderText("Cabecera de un inputbox");
dialog.setContentText("Teclea tu nombre:");

// Traditional way to get the response value.
Optional<String> result = dialog.showAndWait();
if (result.isPresent()){
    Alert alert = new Alert(AlertType.INFORMATION);
alert.setTitle("Información ");
alert.setHeaderText("Cuadro de cabecera");
alert.setContentText("Cuadro de texto: "+ result.get());

alert.showAndWait(); 
    }
    }
    @FXML
    void accion6(ActionEvent event) {

    }

    @FXML
    void accion7(ActionEvent event) {

    }

}
