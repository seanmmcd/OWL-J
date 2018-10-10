package sample;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import java.io.File;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;

import static javafx.stage.StageStyle.UNDECORATED;

public class Main extends Application {

    private double x,y;

    static Stage window = null;

    public static Map<Integer,Scene> sceneMap = new HashMap<Integer,Scene>();
    public static Map<Integer,Pane>  paneMap  = new HashMap<Integer,Pane>();


    FXMLLoader homeScreenLoader = new FXMLLoader(getClass().getResource("homeScreen.fxml"));
    FXMLLoader teamPageLoader   = new FXMLLoader(getClass().getResource("teamPage.fxml"));



    static Pane homeScreen;
    static Pane teamPage;

    @Override
    public void start(Stage primaryStage) throws Exception{
        homeScreen = homeScreenLoader.load();
        teamPage = teamPageLoader.load();
        homeScreenController homeScreenControllerLocal = homeScreenLoader.getController();
        teamPageController   teamPageControllerLocal = teamPageLoader.getController();

        window = primaryStage;
        window.setTitle("Overwatch E-Sports Official Standings");
        window.getIcons().add(new Image(getClass( ).getResourceAsStream("/sample/OWL/ICON.png")));
        window.setResizable(false);

        File f = new File(String.valueOf("/sample/OWL/menubackground.mp4"));
        Media media = null;

        try {
            media = new Media(f.toURI().toURL().toString());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        gsonManager gsonMan = new gsonManager();
        gsonMan.init();

        MediaPlayer player = new  MediaPlayer(media);
        player.setAutoPlay(true);
        MediaView backgroundLoop = new MediaView(player);

        backgroundLoop.fitWidthProperty().bind(homeScreen.widthProperty());
        backgroundLoop.fitWidthProperty().bind(homeScreen.widthProperty());

        homeScreen.getChildren().add(backgroundLoop);

        player.setCycleCount(MediaPlayer.INDEFINITE);
        player.play();

        backgroundLoop.setY(25);
        backgroundLoop.setX(0);
        backgroundLoop.toBack();



        //DIVISION COVERS
        ImageView atlanticImage = new ImageView(new Image(getClass( ).getResourceAsStream("/sample/OWL/DIVISIONCOVERS/AtlanticCover.png")));
        ImageView pacificImage  = new ImageView(new Image(getClass( ).getResourceAsStream("/sample/OWL/DIVISIONCOVERS/PacificCover.png")));
        ImageView owwcGlobe     = new ImageView(new Image(getClass( ).getResourceAsStream("/sample/OWL/DIVISIONCOVERS/globe.png")));
        ImageView owwcIcon      = new ImageView(new Image(getClass( ).getResourceAsStream("/sample/OWL/DIVISIONCOVERS/OWWC.png")));

        initializeDivisionButtons(atlanticImage, pacificImage, owwcIcon, owwcGlobe, homeScreen);

        //PACIFIC TEAMS
        ImageView OWL_DALLAS_FUEL   = new ImageView(new Image(getClass( ).getResourceAsStream("/sample/OWL/PACIFIC/OWL_DALLAS_FUEL.png")));
        ImageView OWL_LA_GLADIATORS = new ImageView(new Image(getClass( ).getResourceAsStream("/sample/OWL/PACIFIC/OWL_LA_GLADIATORS.png")));
        ImageView OWL_LA_VALIANT    = new ImageView(new Image(getClass( ).getResourceAsStream("/sample/OWL/PACIFIC/OWL_LA_VALIANT.png")));
        ImageView OWL_SEOUL_DYNASTY = new ImageView(new Image(getClass( ).getResourceAsStream("/sample/OWL/PACIFIC/OWL_SEOUL_DYNASTY.png")));
        ImageView OWL_SF_SHOCK      = new ImageView(new Image(getClass( ).getResourceAsStream("/sample/OWL/PACIFIC/OWL_SF_SHOCK.png")));
        ImageView OWL_SHAI_DRAGONS  = new ImageView(new Image(getClass( ).getResourceAsStream("/sample/OWL/PACIFIC/OWL_SHAI_DRAGONS.png")));

        initializePacificButtons(OWL_DALLAS_FUEL, OWL_LA_GLADIATORS, OWL_LA_VALIANT, OWL_SEOUL_DYNASTY, OWL_SF_SHOCK, OWL_SHAI_DRAGONS, homeScreen);

        //ATLANTIC TEAMS
                    ImageView OWL_BOS_UPRISING  = new ImageView(new Image(getClass( ).getResourceAsStream("/sample/OWL/ATLANTIC/OWL_BOS_UPRISING.png")));
                    ImageView OWL_FLA_MAYHEM    = new ImageView(new Image(getClass( ).getResourceAsStream("/sample/OWL/ATLANTIC/OWL_FLOR_MAYHEM.png")));
                    ImageView OWL_HOU_OUTLAWS   = new ImageView(new Image(getClass( ).getResourceAsStream("/sample/OWL/ATLANTIC/OWL_HOUS_OUTLAWS.png")));
                    ImageView OWL_LON_SPITFIRE  = new ImageView(new Image(getClass( ).getResourceAsStream("/sample/OWL/ATLANTIC/OWL_LNDN_SPITFIRE.png")));
                    ImageView OWL_NYC_EXCEL     = new ImageView(new Image(getClass( ).getResourceAsStream("/sample/OWL/ATLANTIC/OWL_NY_XL.png")));
                    ImageView OWL_PHI_FUSION    = new ImageView(new Image(getClass( ).getResourceAsStream("/sample/OWL/ATLANTIC/OWL_PHILLY_FUSION.png")));

        initializeAtlanticButtons(OWL_BOS_UPRISING, OWL_FLA_MAYHEM, OWL_HOU_OUTLAWS, OWL_LON_SPITFIRE, OWL_NYC_EXCEL, OWL_PHI_FUSION, homeScreen);

        atlanticImage.setOnMouseClicked     (me -> window.setScene(sceneMap.get(1)));
        pacificImage.setOnMouseClicked      (me -> window.setScene(sceneMap.get(1)));
        owwcIcon.setOnMouseClicked          (me -> window.setScene(sceneMap.get(1)));


        //ATLANTIC TEAM ICON CLICK PROCESSING
        OWL_BOS_UPRISING.setOnMouseClicked (me -> {
            teamPageControllerLocal.prepScene(3 ,gsonMan);
            window.setScene(sceneMap.get(1));
        });
        OWL_FLA_MAYHEM.setOnMouseClicked   (me -> {
            teamPageControllerLocal.prepScene(8,gsonMan);
            window.setScene(sceneMap.get(1));
        });
        OWL_HOU_OUTLAWS.setOnMouseClicked  (me -> {
            teamPageControllerLocal.prepScene(2,gsonMan);
            window.setScene(sceneMap.get(1));
        });
        OWL_LON_SPITFIRE.setOnMouseClicked (me -> {
            teamPageControllerLocal.prepScene(11,gsonMan);
            window.setScene(sceneMap.get(1));
        });
        OWL_NYC_EXCEL.setOnMouseClicked    (me -> {
            teamPageControllerLocal.prepScene(4,gsonMan);
            window.setScene(sceneMap.get(1));
        });
        OWL_PHI_FUSION.setOnMouseClicked   (me -> {
            teamPageControllerLocal.prepScene(1,gsonMan);
            window.setScene(sceneMap.get(1));
        });


        //PACIFIC TEAM ICON CLICK PROCESSING
        OWL_DALLAS_FUEL.setOnMouseClicked  (me -> {
            teamPageControllerLocal.prepScene(0,gsonMan);
            window.setScene(sceneMap.get(1));
        });
        OWL_LA_GLADIATORS.setOnMouseClicked(me -> {
            teamPageControllerLocal.prepScene(7,gsonMan);
            window.setScene(sceneMap.get(1));
        });
        OWL_LA_VALIANT.setOnMouseClicked   (me -> {
            teamPageControllerLocal.prepScene(6,gsonMan);
            window.setScene(sceneMap.get(1));
        });
        OWL_SF_SHOCK .setOnMouseClicked    (me -> {
            teamPageControllerLocal.prepScene(5,gsonMan);
            window.setScene(sceneMap.get(1));
        });
        OWL_SEOUL_DYNASTY.setOnMouseClicked(me -> {
            teamPageControllerLocal.prepScene(10,gsonMan);
            window.setScene(sceneMap.get(1));
        });
        OWL_SHAI_DRAGONS.setOnMouseClicked (me -> {
            teamPageControllerLocal.prepScene(9,gsonMan);
            window.setScene(sceneMap.get(1));
        });




        Font.loadFont(getClass().getResourceAsStream("/sample/OWL/bignoodletoo.ttf"), 14);

        Scene homeScreenScene = new Scene(homeScreen);
        Scene teamPageScene = new Scene(teamPage);

        sceneMap.put(0, homeScreenScene);
        sceneMap.put(1, teamPageScene);
        paneMap.put(0, homeScreen);
        paneMap.put(1, teamPage);

        window.setScene(sceneMap.get(0));
        window.show();
    }

    public void initializeDivisionButtons(ImageView imageATL, ImageView imagePAC, ImageView owwcIcon, ImageView owwcGlobe, Pane homeScreen){
        imageATL.setFitHeight(158.0);
        imageATL.setFitWidth(324.0);
        imageATL.setLayoutX(622.0);
        imageATL.setLayoutY(328.0);
        imageATL.setPickOnBounds(true);
        imageATL.setPreserveRatio(true);

        imagePAC.setFitHeight(158.0);
        imagePAC.setFitWidth(324.0);
        imagePAC.setLayoutX(14.0);
        imagePAC.setLayoutY(328.0);
        imagePAC.setPickOnBounds(true);
        imagePAC.setPreserveRatio(true);

        owwcIcon.setFitHeight(113.0);
        owwcIcon.setFitWidth(161.0);
        owwcIcon.setLayoutX(405.0);
        owwcIcon.setLayoutY(351.0);
        owwcIcon.setPickOnBounds(true);
        owwcIcon.setPreserveRatio(true);

        owwcGlobe.setFitHeight(150.0);
        owwcGlobe.setFitWidth(200.0);
        owwcGlobe.setLayoutX(382.0);
        owwcGlobe.setLayoutY(332.0);
        owwcGlobe.setPickOnBounds(true);
        owwcGlobe.setPreserveRatio(true);

        homeScreen.getChildren().addAll(imageATL, imagePAC, owwcGlobe, owwcIcon);
        return;
    }

    public void initializePacificButtons(ImageView fuel, ImageView glad, ImageView vali, ImageView dyna, ImageView shock, ImageView drag, Pane homeScreen){
        fuel.setFitHeight(86);
        fuel.setFitWidth(41);
        fuel.setLayoutX(14);
        fuel.setLayoutY(279);
        fuel.setPickOnBounds(true);
        fuel.setPreserveRatio(true);

        glad.setFitHeight(86);
        glad.setFitWidth(41);
        glad.setLayoutX(55);
        glad.setLayoutY(279);
        glad.setPickOnBounds(true);
        glad.setPreserveRatio(true);

        vali.setFitHeight(86);
        vali.setFitWidth(41);
        vali.setLayoutX(106);
        vali.setLayoutY(279);
        vali.setPickOnBounds(true);
        vali.setPreserveRatio(true);

        dyna.setFitHeight(86);
        dyna.setFitWidth(41);
        dyna.setLayoutX(254);
        dyna.setLayoutY(279);
        dyna.setPickOnBounds(true);
        dyna.setPreserveRatio(true);

        shock.setFitHeight(86);
        shock.setFitWidth(41);
        shock.setLayoutX(154);
        shock.setLayoutY(279);
        shock.setPickOnBounds(true);
        shock.setPreserveRatio(true);

        drag.setFitHeight(86);
        drag.setFitWidth(41);
        drag.setLayoutX(205);
        drag.setLayoutY(279);
        drag.setPickOnBounds(true);
        drag.setPreserveRatio(true);

        homeScreen.getChildren().addAll(fuel, glad, vali, dyna, shock, drag);

        return;
    }

    public void initializeAtlanticButtons(ImageView rise, ImageView mayh, ImageView outl, ImageView spit, ImageView excel, ImageView fusion, Pane homeScreen){
        rise.setFitHeight(86);
        rise.setFitWidth(41);
        rise.setLayoutX(622);
        rise.setLayoutY(272);
        rise.setPickOnBounds(true);
        rise.setPreserveRatio(true);

        mayh.setFitHeight(86);
        mayh.setFitWidth(41);
        mayh.setLayoutX(662);
        mayh.setLayoutY(272);
        mayh.setPickOnBounds(true);
        mayh.setPreserveRatio(true);

        outl.setFitHeight(86);
        outl.setFitWidth(41);
        outl.setLayoutX(710);
        outl.setLayoutY(272);
        outl.setPickOnBounds(true);
        outl.setPreserveRatio(true);

        spit.setFitHeight(86);
        spit.setFitWidth(41);
        spit.setLayoutX(762);
        spit.setLayoutY(272);
        spit.setPickOnBounds(true);
        spit.setPreserveRatio(true);

        excel.setFitHeight(86);
        excel.setFitWidth(41);
        excel.setLayoutX(811);
        excel.setLayoutY(272);
        excel.setPickOnBounds(true);
        excel.setPreserveRatio(true);

        fusion.setFitHeight(86);
        fusion.setFitWidth(41);
        fusion.setLayoutX(860);
        fusion.setLayoutY(272);
        fusion.setPickOnBounds(true);
        fusion.setPreserveRatio(true);

        homeScreen.getChildren().addAll(rise, mayh, outl, spit, excel, fusion);

        return;
    }

    public void changeToDivisionPage(int divID){
        //prepDivScene

        return;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
