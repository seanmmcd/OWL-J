package sample;

public class Team {
    private String teamName           = "DEFAULT";
    private String teamSocialTwitter  = "DEFAULT";
    private String teamSocialFacebook = "DEFAULT";
    private String teamSocialTwitch   = "DEFAULT";

    public Player[] roster = new Player[7];

    private Player player0 = new Player();
    private Player player1 = new Player();
    private Player player2 = new Player();
    private Player player3 = new Player();
    private Player player4 = new Player();
    private Player player5 = new Player();
    private Player player6 = new Player();
    private Player player7 = new Player();


    public Player getPlayer(int rosterID) {
        return roster[rosterID];
    }
    public void setPlayer(Player player, int rosterID) {
        roster[rosterID] = player;
    }

    public String getTeamSocialTwitter() {
        return teamSocialTwitter;
    }
    public void setTeamSocialTwitter(String teamSocialTwitter) {
        this.teamSocialTwitter = teamSocialTwitter;
    }

    public String getTeamSocialFacebook() {
        return teamSocialFacebook;
    }
    public void setTeamSocialFacebook(String teamSocialFacebook) {
        this.teamSocialFacebook = teamSocialFacebook;
    }

    public String getTeamSocialTwitch() {
        return teamSocialTwitch;
    }
    public void setTeamSocialTwitch(String teamSocialTwitch) {
        this.teamSocialTwitch = teamSocialTwitch;
    }

    public String getTeamName() {
        return teamName;
    }
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    //OKOK
}
