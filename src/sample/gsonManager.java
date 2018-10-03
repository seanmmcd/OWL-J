package sample;

import com.google.gson.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

public class gsonManager {
    Gson gson = new Gson();
    String jsonFile;
    Team teamArray[] = new Team[12];

    {
        try {
            jsonFile = readUrl("https://api.overwatchleague.com/teams");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void init(){
        for(int i = 0; i < 12 ; i++)
        {
            teamArray[i] = new Team();
        }
        buildTeamMap(teamArray, jsonFile);
        return;
    }

    public String readUrl(String urlString) throws Exception {
        BufferedReader reader = null;
        try {
            URL url = new URL(urlString);
            reader = new BufferedReader(new InputStreamReader(url.openStream()));
            StringBuffer buffer = new StringBuffer();
            int read;
            char[] chars = new char[1024];
            while ((read = reader.read(chars)) != -1)
                buffer.append(chars, 0, read);

            return buffer.toString();
        } finally {
            if (reader != null)
                reader.close();
        }
    }

    public void buildTeamMap(Team teamArray[], String jsonString){
        JsonParser parser = new JsonParser();
        JsonElement jsonRoot = parser.parse(jsonString);
        JsonArray competitorArray = jsonRoot.getAsJsonObject().get("competitors").getAsJsonArray();

        String name, twitter, twitch, hero1, hero2, statRole, statHeadshot;

        for(int ii = 0; ii < competitorArray.size(); ii++){
            JsonObject teamObj = competitorArray.get(ii).getAsJsonObject().get("competitor").getAsJsonObject();
            JsonArray roster = teamObj.get("players").getAsJsonArray();


            JsonArray teamAccounts = teamObj.get("accounts").getAsJsonArray();


            teamArray[ii].setTeamName(teamObj.get("name").getAsString());

            for(int soc = 0; soc < teamAccounts.size(); soc++) {

                if(teamAccounts.get(soc).getAsJsonObject().get("accountType").getAsString().equals("FACEBOOK")) {
                    teamArray[ii].setTeamSocialFacebook(teamAccounts.get(soc).getAsJsonObject().get("value").getAsString());
                    continue;
                }
                else{
                    teamArray[ii].setTeamSocialFacebook(" ");
                }

                if(teamAccounts.get(soc).getAsJsonObject().get("accountType").getAsString().equals("TWITCH")) {
                    teamArray[ii].setTeamSocialTwitch(teamAccounts.get(soc).getAsJsonObject().get("value").getAsString());
                    continue;
                }
                else{
                    teamArray[ii].setTeamSocialTwitch(" ");
                }

                if(teamAccounts.get(soc).getAsJsonObject().get("accountType").getAsString().equals("TWITTER")) {
                    teamArray[ii].setTeamSocialTwitter(teamAccounts.get(soc).getAsJsonObject().get("value").getAsString());
                    continue;
                }
                else{
                    teamArray[ii].setTeamSocialTwitter(" ");
                }
            }




            for(int jj = 0; jj < roster.size(); jj++){
                JsonObject player = roster.get(jj).getAsJsonObject().get("player").getAsJsonObject();
                hero1 = "X";
                hero2 = "X";
                twitter = "NO TWITTER ON FILE";
                twitch = "NO TWITCH ON FILE";
                name         = player.get("name").getAsString();
                teamAccounts = player.get("accounts").getAsJsonArray();

                if(player.getAsJsonObject().isJsonNull()){
                    continue;
                }

                if(!teamAccounts.isJsonNull() && teamAccounts.size() != 0) {
                    for (int acc = 0; acc < teamAccounts.size(); acc++) {

                        if (player.get("accounts").getAsJsonArray().get(acc).getAsJsonObject().get("accountType").getAsString().equals("TWITTER")) {
                            twitter = player.get("accounts").getAsJsonArray().get(acc).getAsJsonObject().get("value").getAsString();
                            continue;
                        }
                        if (player.get("accounts").getAsJsonArray().get(acc).getAsJsonObject().get("accountType").getAsString().equals("TWITCH")) {
                            twitch = player.get("accounts").getAsJsonArray().get(acc).getAsJsonObject().get("value").getAsString();
                            continue;
                        }
                    }
                }

                if(player.get("attributes").getAsJsonObject().has("heroes") && player.get("attributes").getAsJsonObject().get("heroes").isJsonArray()) {

                    if (player.getAsJsonObject().get("attributes").getAsJsonObject().has("heroes") && player.getAsJsonObject().get("attributes").getAsJsonObject().get("heroes").getAsJsonArray().size() != 0) {

                        hero1 = player.get("attributes").getAsJsonObject().get("heroes").getAsJsonArray().get(0).getAsString();
                    }
                    if (player.getAsJsonObject().get("attributes").getAsJsonObject().has("heroes") && player.getAsJsonObject().get("attributes").getAsJsonObject().get("heroes").getAsJsonArray().size() > 1) {
                        hero2 = player.get("attributes").getAsJsonObject().get("heroes").getAsJsonArray().get(1).getAsString();
                    }
                }


                statRole     = player.get("attributes").getAsJsonObject().get("role").getAsString();
                statHeadshot = player.get("headshot").getAsString();

                try {
                    teamArray[ii].setPlayer(new Player(name, twitter, twitch, hero1, hero2, statRole, new URL(statHeadshot)), jj);
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }

            }
            printTeam(teamArray[ii]);
        }

        return;
    }

    public void printTeam(Team team){
        System.out.println(team.getTeamName());
        for(int ii = 0; ii < 10; ii++){
            if(team.roster[ii] != null) {
                System.out.println(team.roster[ii].name + " - " + team.roster[ii].statRole + " | Heroes: " + team.roster[ii].statHero1 + ", " + team.roster[ii].statHero2 + "\n\tHeadshot: "+ team.roster[ii].statHeadshot +"\n\t Twitter: " + team.roster[ii].socTwitter + "\n\t Twitch: " + team.roster[ii].socTwitch);
            }
        }System.out.println();
        return;
    }
}
