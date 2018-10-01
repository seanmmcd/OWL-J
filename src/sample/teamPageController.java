package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.media.MediaView;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.awt.*;
import java.util.ResourceBundle;

public class teamPageController {

    //@FXML

    public static int contTeamID = 0;

    public static void setTeamID(int teamID){
        contTeamID = teamID;
        return;
    }

    public void closeRequest(){
        System.exit(345);
    }
}