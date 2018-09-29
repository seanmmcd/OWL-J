package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.media.MediaView;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.awt.*;
import java.util.ResourceBundle;

public class homeScreenController implements Initializable {

        @FXML
        MediaView backgroundLoop;

        @Override
        public void initialize(URL location, ResourceBundle resources){

        }

        public void atlanticClicked(){
                System.out.println("Atlantic Division was selected.");
                return;
        }

        public void pacificClicked(){
                System.out.println("Pacific Division was selected.");
                return;
        }

        public void owwcClicked(){
                System.out.println("Overwatch World Cup was selected.");
                return;
        }

        public void kickToBrowser(){
                try {
                        Desktop.getDesktop().browse(new URL("https://overwatchleague.com/en-us/standings/season/1/stage/4").toURI());
                } catch (IOException e) {
                        e.printStackTrace();
                } catch (URISyntaxException e) {
                        e.printStackTrace();
                }
        }

        public void closeRequest(){
                System.exit(345);
        }
}
