package sample;

import com.google.gson.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Map;

public class gsonManager {
    Gson gson = new Gson();
    String jsonFile;
    Map <Integer, Team> teamMap;
    {
        try {
            jsonFile = readUrl("https://api.overwatchleague.com/teams");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void init(){
        Map <Integer, Team> teamMap = null;
        buildTeamMap(teamMap, jsonFile);
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

    public void buildTeamMap(Map teamMAP, String jsonString){
        JsonParser parser = new JsonParser();
        JsonElement jsonRoot = parser.parse(jsonString);
        JsonArray competitorArray = jsonRoot.getAsJsonObject().get("competitors").getAsJsonArray();

        JsonElement teamObj = competitorArray.get(0);


        System.out.println(teamObj.getAsJsonObject().get("competitor").getAsJsonObject().get("name").getAsString());
        return;
    }
}
