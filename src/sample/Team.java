package sample;

public class Team {
    private String teamName           = "DEFAULT";
    private String teamSocialTwitter  = "DEFAULT";
    private String teamSocialFacebook = "DEFAULT";
    private String teamSocialTwitch   = "DEFAULT";

    private Player player0 = new Player();
    private Player player1 = new Player();
    private Player player2 = new Player();
    private Player player3 = new Player();
    private Player player4 = new Player();
    private Player player5 = new Player();
    private Player player6 = new Player();
    private Player player7 = new Player();


    public Player getPlayer0() {
        return player0;
    }
    public void setPlayer0(Player player0) {
        this.player0 = player0;
    }

    public Player getPlayer1() {
        return player1;
    }
    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }

    public Player getPlayer2() {
        return player2;
    }
    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }

    public Player getPlayer3() {
        return player3;
    }
    public void setPlayer3(Player player3) {
        this.player3 = player3;
    }

    public Player getPlayer4() {
        return player4;
    }
    public void setPlayer4(Player player4) {
        this.player4 = player4;
    }

    public Player getPlayer5() {
        return player5;
    }
    public void setPlayer5(Player player5) {
        this.player5 = player5;
    }

    public Player getPlayer6() {
        return player6;
    }
    public void setPlayer6(Player player6) {
        this.player6 = player6;
    }

    public Player getPlayer7() {
        return player7;
    }
    public void setPlayer7(Player player7) {
        this.player7 = player7;
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

}
