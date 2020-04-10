package internship.project1;

import java.io.File;
import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;
import static javafx.application.Platform.exit;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 * @name 3D Lab Internship Project
 * @author James Floyd, Jared Smith
 */
public class FXMLDocumentController implements Initializable {
    
    final private DateTimeFormatter currentDate = DateTimeFormatter.ofPattern("MM/dd/yyyy");
    final private LocalDate localDate = LocalDate.now();
    public FileChooser fileChooser = new FileChooser();

    
    @FXML
    private Label label;
    
    @FXML
    private Button closeButton;
    
    @FXML
    private Button openButton;
    
    @FXML
    private Button saveButton;
    
    @FXML
    private TextField nameTextField;
    
    @FXML
    private TextField capitalTextField;
    
    @FXML
    private TextField dateTextField;
  
    @FXML
    private void openButtonAction(ActionEvent event)
    {
        //Test Openner Code
        Stage stage = new Stage();
        //Filters out for the .std files
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Stl Files", "*.stl")
        );
                
        fileChooser.setTitle("Open Resource File");
        //fileChooser.showOpenDialog(stage);
        File file = fileChooser.showOpenDialog(stage);
        if(file != null)
        {
            System.out.println(file);
        }
        
        System.out.println("File uploaded!");
        
       // File file = fileChooser.getSelectFile();

        dateTextField.setText(currentDate.format(localDate));
    }
    
    @FXML
    private void saveButtonAction(ActionEvent event)
    {
        //Runs the renameSTL X function
        //RunRename.RenameSTL();
        //Once it is saved...       
        System.out.println("You clicked saved button!");
        label.setText("Your new file name is 4/1/JWheel.std");
    }
    
    @FXML
    private void closeButtonAction(ActionEvent event)
    {
        exit();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        assert dateTextField != null : "fx:id=\"dateTextField\" was not injected: check your FXML file 'FXMLDocument.fxml'.";
        assert label != null : "fx:id=\"label\" was not injected: check your FXML file 'FXMLDocument.fxml'.";
        assert openButton != null : "fx:id=\"openButton\" was not injected: check your FXML file 'FXMLDocument.fxml'.";
        assert saveButton != null : "fx:id=\"saveButton\" was not injected: check your FXML file 'FXMLDocument.fxml'.";
        assert closeButton != null : "fx:id=\"closeButton\" was not injected: check your FXML file 'FXMLDocument.fxml'.";
    }    
    
    public void renameFile()
    {
        
    }
    
    public TextField getNameTextField() {
        return nameTextField;
    }

    public void setNameTextField(TextField nameTextField) {
        this.nameTextField = nameTextField;
    }

    public TextField getCapitalTextField() {
        return capitalTextField;
    }

    public void setCapitalTextField(TextField capitalTextField) {
        this.capitalTextField = capitalTextField;
    }

    public TextField getDateTextField() {
        return dateTextField;
    }

    public void setDateTextField(TextField dateTextField) {
        this.dateTextField = dateTextField;
    }
    
}
