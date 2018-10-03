package sample;

import com.google.gson.Gson;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;


public class teamPageController implements Initializable {

    //@FXML Annotations
    @FXML
    AnchorPane teamPageID;
    @FXML
    ImageView teamIcon;
    @FXML
    Text teamName;
    @FXML
    Text standingsHeader;
    @FXML
    Text rosterText;

    //Player 1
    @FXML
    Text player1Name;
    @FXML
    ImageView player1Headshot;
    @FXML
    ImageView player1Twitch;
    @FXML
    ImageView player1Twitter;
    @FXML
    ImageView player1Hero1;
    @FXML
    ImageView player1Hero2;
    @FXML
    ImageView player1Role;

    //Player 2
    @FXML
    Text player2Name;
    @FXML
    ImageView player2Headshot;
    @FXML
    ImageView player2Twitch;
    @FXML
    ImageView player2Twitter;
    @FXML
    ImageView player2Hero1;
    @FXML
    ImageView player2Hero2;
    @FXML
    ImageView player2Role;

    //Player 3
    @FXML
    Text player3Name;
    @FXML
    ImageView player3Headshot;
    @FXML
    ImageView player3Twitch;
    @FXML
    ImageView player3Twitter;
    @FXML
    ImageView player3Hero1;
    @FXML
    ImageView player3Hero2;
    @FXML
    ImageView player3Role;

    //Player 4
    @FXML
    Text player4Name;
    @FXML
    ImageView player4Headshot;
    @FXML
    ImageView player4Twitch;
    @FXML
    ImageView player4Twitter;
    @FXML
    ImageView player4Hero1;
    @FXML
    ImageView player4Hero2;
    @FXML
    ImageView player4Role;  //Players 1-4, Team

        //Player 5
    @FXML
    Text player5Name;
    @FXML
    ImageView player5Headshot;
    @FXML
    ImageView player5Twitch;
    @FXML
    ImageView player5Twitter;
    @FXML
    ImageView player5Hero1;
    @FXML
    ImageView player5Hero2;
    @FXML
    ImageView player5Role;

    //Player 6
    @FXML
    Text player6Name;
    @FXML
    ImageView player6Headshot;
    @FXML
    ImageView player6Twitch;
    @FXML
    ImageView player6Twitter;
    @FXML
    ImageView player6Hero1;
    @FXML
    ImageView player6Hero2;
    @FXML
    ImageView player6Role;

    //Player 7
    @FXML
    Text player7Name;
    @FXML
    ImageView player7Headshot;
    @FXML
    ImageView player7Twitch;
    @FXML
    ImageView player7Twitter;
    @FXML
    ImageView player7Hero1;
    @FXML
    ImageView player7Hero2;
    @FXML
    ImageView player7Role;

    //Player 8
    @FXML
    Text player8Name;
    @FXML
    ImageView player8Headshot;
    @FXML
    ImageView player8Twitch;
    @FXML
    ImageView player8Twitter;
    @FXML
    ImageView player8Hero1;
    @FXML
    ImageView player8Hero2;
    @FXML
    ImageView player8Role;  //Players 5=8



    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }

    public void goHome(){
        Main.window.setScene(Main.sceneMap.get(0));
    }

    public void setTeamIcon(Image icon){
        teamIcon.setImage(icon);
    }

    public void prepScene(int teamID, gsonManager gson){
        if(teamID >= 6)
            standingsHeader.setText("CURRENT PACIFIC STANDING");
        else
            standingsHeader.setText("CURRENT ATLANTIC STANDING");

        wipeScene();


        switch (teamID){
            case 3 :    //pullTeamJson();

                        teamIcon.setImage(new Image("/sample/OWL/ATLANTIC/OWL_BOS_UPRISING.png"));
                        teamName.setText("BOSTON UPRISING");
                        rosterText.setText("UPRISING ROSTER");
                        break;         //UPRISING

            case 8 :    teamIcon.setImage(new Image("/sample/OWL/ATLANTIC/OWL_FLOR_MAYHEM.png"));
                        teamName.setText("FLORIDA MAYHEM");
                        rosterText.setText("MAYHEM ROSTER");
                        break;         //MAYHEM

            case 2 :    teamIcon.setImage(new Image("/sample/OWL/ATLANTIC/OWL_HOUS_OUTLAWS.png"));
                        teamName.setText("HOUSTON OUTLAWS");
                        rosterText.setText("OUTLAWS ROSTER");
                        break;         //OUTLAWS

            case 11 :   teamIcon.setImage(new Image("/sample/OWL/ATLANTIC/OWL_LNDN_SPITFIRE.png"));
                        teamName.setText("LONDON SPITFIRE");
                        rosterText.setText("SPITFIRE ROSTER");
                        break;         //SPITFIRE

            case 4 :    teamIcon.setImage(new Image("/sample/OWL/ATLANTIC/OWL_NY_XL.png"));
                        teamName.setText("NEW YORK EXCELSIOR");
                        rosterText.setText("EXCELSIOR ROSTER");
                        break;         //EXCELSIOR

            case 1 :    teamIcon.setImage(new Image("/sample/OWL/ATLANTIC/OWL_PHILLY_FUSION.png"));
                        teamName.setText("PHILADELPHIA FUSION");
                        rosterText.setText("FUSION ROSTER");
                        break;         //FUSION

            case 0 :    teamIcon.setImage(new Image("/sample/OWL/PACIFIC/OWL_DALLAS_FUEL.png"));
                        teamName.setText("DALLAS FUEL");
                        rosterText.setText("FUEL ROSTER");
                        break;         //FUEL

            case 7 :    teamIcon.setImage(new Image("/sample/OWL/PACIFIC/OWL_LA_GLADIATORS.png"));
                        teamName.setText("LA GLADIATORS");
                        rosterText.setText("GLADIATORS ROSTER");
                        break;         //GLADIATORS

            case 6 :    teamIcon.setImage(new Image("/sample/OWL/PACIFIC/OWL_LA_VALIANT.png"));
                        teamName.setText("LA VALIANT");
                        rosterText.setText("VALIANT ROSTER");
                        break;         //VALIANT

            case 5 :    teamIcon.setImage(new Image("/sample/OWL/PACIFIC/OWL_SF_SHOCK.png"));
                        teamName.setText("SAN FRANCISCO SHOCK");
                        rosterText.setText("SHOCK ROSTER");
                        break;         //SHOCK

            case 10:    teamIcon.setImage(new Image("/sample/OWL/PACIFIC/OWL_SEOUL_DYNASTY.png"));
                        teamName.setText("SEOUL DYNASTY");
                        rosterText.setText("DYNASTY ROSTER");
                        break;         //DYNASTY

            case 9:     teamIcon.setImage(new Image("/sample/OWL/PACIFIC/OWL_SHAI_DRAGONS.png"));
                        teamName.setText("SHANGHAI DRAGONS");
                        rosterText.setText("DRAGONS ROSTER");
                        break;         //DRAGONS

            default: goHome(); break;
        }

        Team team = gson.teamArray[teamID];
        if(!(team.roster[0] == null)) {
            player1Name.setText(team.roster[0].name);
            player1Headshot.setImage(new Image(team.roster[0].statHeadshot.toString()));
            System.out.println( team.roster[0].statHero1);
            player1Hero1.setImage(team.roster[0].statHero1);
            player1Role.setImage(new Image("/sample/OWL/HEROES/" + team.roster[0].statRole + ".png"));
            player1Twitch.setOnMouseClicked (me -> {
                try {
                    Desktop.getDesktop().browse(new URL(team.roster[0].socTwitch).toURI());
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (URISyntaxException e) {
                    e.printStackTrace();
                }
            });
            player1Twitter.setOnMouseClicked (me -> {
                try {
                    Desktop.getDesktop().browse(new URL(team.roster[0].socTwitter).toURI());
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (URISyntaxException e) {
                    e.printStackTrace();
                }
            });
        }    //Player 1

        if(!(team.roster[1] == null)) {
            player2Name.setText(team.roster[1].name);
            player2Headshot.setImage(new Image(team.roster[1].statHeadshot.toString()));
            System.out.println( team.roster[1].statHero1);
            player2Hero1.setImage(team.roster[1].statHero1);
            player2Role.setImage(new Image("/sample/OWL/HEROES/" + team.roster[1].statRole + ".png"));
            player2Twitch.setOnMouseClicked (me -> {
                try {
                    Desktop.getDesktop().browse(new URL(team.roster[1].socTwitch).toURI());
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (URISyntaxException e) {
                    e.printStackTrace();
                }
            });
            player2Twitter.setOnMouseClicked (me -> {
                try {
                    Desktop.getDesktop().browse(new URL(team.roster[1].socTwitter).toURI());
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (URISyntaxException e) {
                    e.printStackTrace();
                }
            });
        }    //Player 2

        if(!(team.roster[2] == null)) {
            player3Name.setText(team.roster[2].name);
            player3Headshot.setImage(new Image(team.roster[2].statHeadshot.toString()));
            System.out.println( team.roster[2].statHero1);
            player3Hero1.setImage(team.roster[2].statHero1);
            player3Role.setImage(new Image("/sample/OWL/HEROES/" + team.roster[2].statRole + ".png"));
            player3Twitch.setOnMouseClicked (me -> {
                try {
                    Desktop.getDesktop().browse(new URL(team.roster[2].socTwitch).toURI());
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (URISyntaxException e) {
                    e.printStackTrace();
                }
            });
            player3Twitter.setOnMouseClicked (me -> {
                try {
                    Desktop.getDesktop().browse(new URL(team.roster[2].socTwitter).toURI());
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (URISyntaxException e) {
                    e.printStackTrace();
                }
            });
        }    //Player 3

        if(!(team.roster[3] == null)) {
            player4Name.setText(team.roster[3].name);
            player4Headshot.setImage(new Image(team.roster[3].statHeadshot.toString()));
            System.out.println( team.roster[3].statHero1URL);
            if(!(team.roster[3].statHero1 == null) && (team.roster[3].statHero1URL != "ana"))
            player4Hero1.setImage(team.roster[3].statHero1);
            player4Role.setImage(new Image("/sample/OWL/HEROES/" + team.roster[3].statRole + ".png"));
            player4Twitch.setOnMouseClicked (me -> {
                try {
                    Desktop.getDesktop().browse(new URL(team.roster[3].socTwitch).toURI());
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (URISyntaxException e) {
                    e.printStackTrace();
                }
            });
            player4Twitter.setOnMouseClicked (me -> {
                try {
                    Desktop.getDesktop().browse(new URL(team.roster[3].socTwitter).toURI());
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (URISyntaxException e) {
                    e.printStackTrace();
                }
            });
        }    //Player 4

        if(!(team.roster[4] == null)) {
            player5Name.setText(team.roster[4].name);
            player5Headshot.setImage(new Image(team.roster[4].statHeadshot.toString()));
            System.out.println( team.roster[4].statHero1);
            if(!(team.roster[4].statHero1.equals(null)))
            player5Hero1.setImage(team.roster[4].statHero1);
            player5Role.setImage(new Image("/sample/OWL/HEROES/" + team.roster[4].statRole + ".png"));
            player5Twitch.setOnMouseClicked (me -> {
                try {
                    Desktop.getDesktop().browse(new URL(team.roster[4].socTwitch).toURI());
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (URISyntaxException e) {
                    e.printStackTrace();
                }
            });
            player5Twitter.setOnMouseClicked (me -> {
                try {
                    Desktop.getDesktop().browse(new URL(team.roster[4].socTwitter).toURI());
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (URISyntaxException e) {
                    e.printStackTrace();
                }
            });
        }    //Player 5


        if(!(team.roster[5] == null)) {
            player6Name.setText(team.roster[5].name);
            player6Headshot.setImage(new Image(team.roster[5].statHeadshot.toString()));
            System.out.println( team.roster[5].statHero1);
            if(!(team.roster[5].statHero1.equals(null)))
            player6Hero1.setImage(team.roster[5].statHero1);
            player6Role.setImage(new Image("/sample/OWL/HEROES/" + team.roster[5].statRole + ".png"));
            player6Twitch.setOnMouseClicked (me -> {
                try {
                    Desktop.getDesktop().browse(new URL(team.roster[5].socTwitch).toURI());
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (URISyntaxException e) {
                    e.printStackTrace();
                }
            });
            player6Twitter.setOnMouseClicked (me -> {
                try {
                    Desktop.getDesktop().browse(new URL(team.roster[5].socTwitter).toURI());
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (URISyntaxException e) {
                    e.printStackTrace();
                }
            });
        }    //Player 6

        if(!(team.roster[6] == null)) {
            player7Name.setText(team.roster[6].name);
            player7Headshot.setImage(new Image(team.roster[6].statHeadshot.toString()));
            System.out.println( team.roster[6].statHero1);
            if(!(team.roster[6].statHero1.equals(null)))
            player7Hero1.setImage(team.roster[6].statHero1);
            player7Role.setImage(new Image("/sample/OWL/HEROES/" + team.roster[6].statRole + ".png"));
            player7Twitch.setOnMouseClicked (me -> {
                try {
                    Desktop.getDesktop().browse(new URL(team.roster[6].socTwitch).toURI());
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (URISyntaxException e) {
                    e.printStackTrace();
                }
            });
            player7Twitter.setOnMouseClicked (me -> {
                try {
                    Desktop.getDesktop().browse(new URL(team.roster[6].socTwitter).toURI());
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (URISyntaxException e) {
                    e.printStackTrace();
                }
            });
        }    //Player 7


        if(!(team.roster[7] == null)) {
            player8Name.setText(team.roster[7].name);
            player8Headshot.setImage(new Image(team.roster[7].statHeadshot.toString()));
            System.out.println( team.roster[7].statHero1);
            if(!(team.roster[7].statHero1.equals(null)))
            player8Hero1.setImage(team.roster[7].statHero1);
            player8Role.setImage(new Image("/sample/OWL/HEROES/" + team.roster[7].statRole + ".png"));
            player8Twitch.setOnMouseClicked (me -> {
                try {
                    Desktop.getDesktop().browse(new URL(team.roster[7].socTwitch).toURI());
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (URISyntaxException e) {
                    e.printStackTrace();
                }
            });
            player8Twitter.setOnMouseClicked (me -> {
                try {
                    Desktop.getDesktop().browse(new URL(team.roster[7].socTwitter).toURI());
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (URISyntaxException e) {
                    e.printStackTrace();
                }
            });
        }    //Player 8

        return;
    }

    public void closeRequest(){
        System.exit(345);
    }

    public void wipeScene(){
        player1Name.setText("NO PLAYER FOUND");
        player1Headshot.setImage(new Image("/sample/OWL/NULL_PLAYER.png"));
        player1Hero1.setImage(null);

        player2Name.setText("NO PLAYER FOUND");
        player2Headshot.setImage(new Image("/sample/OWL/NULL_PLAYER.png"));
        player2Hero1.setImage(null);

        player3Name.setText("NO PLAYER FOUND");
        player3Headshot.setImage(new Image("/sample/OWL/NULL_PLAYER.png"));
        player3Hero1.setImage(null);

        player4Name.setText("NO PLAYER FOUND");
        player4Headshot.setImage(new Image("/sample/OWL/NULL_PLAYER.png"));
        player4Hero1.setImage(null);

        player5Name.setText("NO PLAYER FOUND");
        player5Headshot.setImage(new Image("/sample/OWL/NULL_PLAYER.png"));
        player5Hero1.setImage(null);

        player6Name.setText("NO PLAYER FOUND");
        player6Headshot.setImage(new Image("/sample/OWL/NULL_PLAYER.png"));
        player6Hero1.setImage(null);

        player7Name.setText("NO PLAYER FOUND");
        player7Headshot.setImage(new Image("/sample/OWL/NULL_PLAYER.png"));
        player7Hero1.setImage(null);

        player8Name.setText("NO PLAYER FOUND");
        player8Headshot.setImage(new Image("/sample/OWL/NULL_PLAYER.png"));
        player8Hero1.setImage(null);

    }
}