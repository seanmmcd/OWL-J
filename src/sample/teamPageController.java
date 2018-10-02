package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;


public class teamPageController implements Initializable{

    @FXML
    AnchorPane teamPageID;
    @FXML
    ImageView teamIcon;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }

    public void goHome(){
        Main.window.setScene(Main.sceneMap.get(0));
    }

    public void setTeamIcon(Image icon){
        teamIcon.setImage(icon);
    }
    public void closeRequest(){
        System.exit(345);
    }
}