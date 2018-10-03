package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;


public class teamPageController implements Initializable{

    @FXML AnchorPane teamPageID;
    @FXML ImageView teamIcon;
    @FXML Text teamName;
    @FXML Text standingsHeader;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }

    public void goHome(){
        Main.window.setScene(Main.sceneMap.get(0));
    }

    public void setTeamIcon(Image icon){
        teamIcon.setImage(icon);
    }

    public void prepScene(int teamID){
        if(teamID >= 6)
            standingsHeader.setText("CURRENT PACIFIC STANDING");
        else
            standingsHeader.setText("CURRENT ATLANTIC STANDING");



        switch (teamID){
            case 0 :    //pullTeamJson();

                        teamIcon.setImage(new Image("/sample/OWL/ATLANTIC/OWL_BOS_UPRISING.png"));
                        teamName.setText("BOSTON UPRISING");
                        break;         //UPRISING

            case 1 :    teamIcon.setImage(new Image("/sample/OWL/ATLANTIC/OWL_FLOR_MAYHEM.png"));
                        teamName.setText("FLORIDA MAYHEM");
                        break;         //MAYHEM

            case 2 :    teamIcon.setImage(new Image("/sample/OWL/ATLANTIC/OWL_HOUS_OUTLAWS.png"));
                        teamName.setText("HOUSTON OUTLAWS");
                        break;         //OUTLAWS

            case 3 :    teamIcon.setImage(new Image("/sample/OWL/ATLANTIC/OWL_LNDN_SPITFIRE.png"));
                        teamName.setText("LONDON SPITFIRE");
                        break;         //SPITFIRE
            case 4 :    teamIcon.setImage(new Image("/sample/OWL/ATLANTIC/OWL_NY_XL.png"));
                        teamName.setText("NEW YORK EXCELSIOR");
                        break;         //EXCELSIOR

            case 5 :    teamIcon.setImage(new Image("/sample/OWL/ATLANTIC/OWL_PHILLY_FUSION.png"));
                        teamName.setText("PHILADELPHIA FUSION");
                        break;         //FUSION

            case 6 :    teamIcon.setImage(new Image("/sample/OWL/PACIFIC/OWL_DALLAS_FUEL.png"));
                        teamName.setText("DALLAS FUEL");
                         break;         //FUEL

            case 7 :    teamIcon.setImage(new Image("/sample/OWL/PACIFIC/OWL_LA_GLADIATORS.png"));
                        teamName.setText("LOS ANGELES GLADIATORS");
                        break;         //GLADIATORS

            case 8 :    teamIcon.setImage(new Image("/sample/OWL/PACIFIC/OWL_LA_VALIANT.png"));
                        teamName.setText("LOS ANGELES VALIANT");
                        break;         //VALIANT

            case 9 :    teamIcon.setImage(new Image("/sample/OWL/PACIFIC/OWL_SF_SHOCK.png"));
                        teamName.setText("SAN FRANCISCO SHOCK");
                        break;         //SHOCK

            case 10:    teamIcon.setImage(new Image("/sample/OWL/PACIFIC/OWL_SEOUL_DYNASTY.png"));
                        teamName.setText("SEOUL DYNASTY");
                        break;         //DYNASTY

            case 11:    teamIcon.setImage(new Image("/sample/OWL/PACIFIC/OWL_SHAI_DRAGONS.png"));
                        teamName.setText("SHANGHAI DRAGONS");
                        break;         //DRAGONS

            default: goHome(); break;
        }

        return;
    }

    public void closeRequest(){
        System.exit(345);
    }
}