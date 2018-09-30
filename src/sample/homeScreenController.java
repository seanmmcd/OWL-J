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

public class homeScreenController implements Initializable {

        @FXML
        MediaView backgroundLoop;
        @FXML
        Text titleOW;

        @Override
        public void initialize(URL location, ResourceBundle resources){
                Font OWfont = Font.loadFont(getClass().getResourceAsStream("/sample/OWL/bignoodletoo.ttf"), 48);

                System.out.print(OWfont.toString());
                titleOW.setFont(OWfont);
        }

        //SCENE HANDLER
        public void switchScene(int teamID){

        }

        //TRANSITION PROCESSING

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

        public void teamClicked(int teamID){
                switch (teamID){
                        case 0  : break;        //DALLAS FUEL
                        case 1  : break;        //LOS ANGELES VALIANT
                        case 2  : break;        //LOS ANGELES GLADIATORS
                        case 3  : break;        //SAN FRANCISCO SHOCK
                        case 4  : break;        //SHANGHAI DRAGONS
                        case 5  : break;        //SEOUL DYNASTY
                        case 6  : break;        //BOSTON UPRISING
                        case 7  : break;        //FLORIDA MAYHEM
                        case 8  : break;        //HOUSTON OUTLAWS
                        case 9  : break;        //PHILADELPHIA FUSION
                        case 10 : break;        //LONDON SPITFIRE
                        case 11 : break;        //NEW YORK EXCEL
                        default : return;
                }
                return;
        }


        //PACIFIC PROCESSING

        public void fuelClicked(){
                teamClicked(0);         //Opens new window for team.
                return;
        }

        public void valiantClicked(){
                teamClicked(1);         //Opens new window for team.
                return;
        }

        public void gladiatorsClicked(){
                teamClicked(2);         //Opens new window for team.
                return;
        }

        public void shockClicked(){
                teamClicked(3);         //Opens new window for team.
                return;
        }

        public void dragonsClicked(){
                teamClicked(4);         //Opens new window for team.
                return;
        }

        public void dynastyClicked(){
                teamClicked(5);         //Opens new window for team.
                return;
        }
        //ATLANTIC PROCESSING

        public void uprisingClicked(){
                teamClicked(6);         //Opens new window for team.
                return;
        }
        public void mayhemClicked(){
                teamClicked(7);         //Opens new window for team.
                return;
        }
        public void outlawsClicked(){
                teamClicked(8);         //Opens new window for team.
                return;
        }
        public void fusionClicked(){
                teamClicked(9);         //Opens new window for team.
                return;
        }
        public void spitfireClicked(){
                teamClicked(10);         //Opens new window for team.
                return;
        }
        public void excelClicked(){
                teamClicked(11);         //Opens new window for team.
                return;
        }


        //MENU PROCESSING

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
