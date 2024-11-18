module AlquilerPatinete {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	requires javafx.base;
	
	opens application to javafx.graphics, javafx.fxml;
	exports Controlador;  // Exporta el paquete Controlador
    opens Controlador to javafx.fxml;
}
