package sample;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.text.Text;

import java.awt.*;
import java.net.URL;

public class Player {

    String name       = "DEFAULT";
    String socTwitter = "DEFAULT";
    String socTwitch  = "DEFAULT";
    String statRole   = "DEFAULT";
    Image statHero1  = null;
    String statHero1URL = "DEFAULT";
    URL statHeadshot  = null;

    public Player(){}

    public Player(String name, String socTwitter, String socTwitch, String statHero1, String statHero2, String statRole, URL statHeadshot){
        this.name          = name;
        this.socTwitter    = socTwitter;
        this.socTwitch     = socTwitch;
        this.statHero1     = new Image("/sample/OWL/HEROES/"+statHero1+".png");
        this.statHero1URL  = statHero1;
        this.statRole      = statRole;
        this.statHeadshot  = statHeadshot;
    }
}
