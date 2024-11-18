package Controlador;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class AlquilerController implements Initializable{
    
    @FXML
    private Button botonAlquiler;
    @FXML
    private TextField nombreCompleto,numeroSerie;
    @FXML
    private DatePicker fechaRecogida,fechaDevolucion;


    public void handleButtonAction (ActionEvent event) {
        System.out.println("Nuevo alquiler");
        //Comprobamos el campo nombreCompleto
        if(nombreCompleto.getText().isEmpty()) {
            nombreCompleto.setStyle("-fx-control-inner-background: #ef9a9a");
        }else if(numeroSerie.getText().isEmpty()) {
            numeroSerie.setStyle("-fx-control-inner-background: #ef9a9a");
        }else if(fechaRecogida.getValue()==null) {
            fechaRecogida.setStyle("-fx-control-inner-background: #ef9a9a");
        }else if(fechaDevolucion.getValue()==null) {
            fechaDevolucion.setStyle("-fx-control-inner-background: #ef9a9a");
        }else {
            System.out.println("Todos los campos tienen un valor");
        }
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        System.out.println("Inicializo Eventos y otros elementos");
        botonAlquiler.setOnAction(this::handleButtonAction );
    }

}