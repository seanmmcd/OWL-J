package sample;

import java.net.URL;

public class Player {
    String name       = "DEFAULT";
    String socTwitter = "DEFAULT";
    String socTwitch  = "DEFAULT";
    String statHero1  = "DEFAULT";
    String statHero2  = "DEFAULT";
    String statRole   = "DEFAULT";
    URL statHeadshot  = null;

    public Player(){}

    public Player(String name, String socTwitter, String socTwitch, String statHero1, String statHero2, String statRole, URL statHeadshot){
        this.name          = name;
        this.socTwitter    = socTwitter;
        this.socTwitch     = socTwitch;
        this.statHero1     = statHero1;
        this.statHero2     = statHero2;
        this.statRole      = statRole;
        this.statHeadshot  = statHeadshot;
    }
}
