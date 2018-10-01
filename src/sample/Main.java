package sample;

import com.sun.javafx.scene.SceneHelper;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
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
import java.io.IOException;
import java.net.MalformedURLException;
import static javafx.stage.StageStyle.UNDECORATED;

public class Main extends Application {

    private double x,y;

    Stage window = null;


    FXMLLoader homeScreenLoader = new FXMLLoader(getClass().getResource("homeScreen.fxml"));
    FXMLLoader teamPageLoader   = new FXMLLoader(getClass().getResource("teamPage.fxml"));

    homeScreenController homeScreenControllerLocal = homeScreenLoader.getController();
    teamPageController   teamPageControllerLocal = teamPageLoader.getController();

    @Override
    public void start(Stage primaryStage) throws Exception{
        Pane homeScreen = homeScreenLoader.load();
        Pane teamPage = teamPageLoader.load();

        window = primaryStage;
        window.setTitle("Overwatch E-Sports Official Standings");
        window.initStyle(UNDECORATED);
        window.getIcons().add(new Image("/sample/OWL/ICON.png"));
        window.setResizable(false);

        File f = new File("C:/Users/Aspen/Documents/GitHub/OWL-J/src/sample/OWL/menubackground.mp4");
        Media media = null;

        try {
            media = new Media(f.toURI().toURL().toString());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

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

        ImageView atlanticImage = new ImageView(new Image("/sample/OWL/DIVISIONCOVERS/AtlanticCover.png"));
        ImageView pacificImage  = new ImageView(new Image("/sample/OWL/DIVISIONCOVERS/PacificCover.png"));
        ImageView owwcGlobe     = new ImageView(new Image("/sample/OWL/DIVISIONCOVERS/globe.png"));
        ImageView owwcIcon      = new ImageView(new Image("/sample/OWL/DIVISIONCOVERS/OWWC.png"));

        initializeDivisionButtons(atlanticImage, pacificImage, owwcIcon, owwcGlobe, homeScreen);

        //PACIFIC TEAMS
        ImageView OWL_DALLAS_FUEL   = new ImageView(new Image("/sample/OWL/PACIFIC/OWL_DALLAS_FUEL.png"));
        ImageView OWL_LA_GLADIATORS = new ImageView(new Image("/sample/OWL/PACIFIC/OWL_LA_GLADIATORS.png"));
        ImageView OWL_LA_VALIANT    = new ImageView(new Image("/sample/OWL/PACIFIC/OWL_LA_VALIANT.png"));
        ImageView OWL_SEOUL_DYNASTY = new ImageView(new Image("/sample/OWL/PACIFIC/OWL_SEOUL_DYNASTY.png"));
        ImageView OWL_SF_SHOCK      = new ImageView(new Image("/sample/OWL/PACIFIC/OWL_SF_SHOCK.png"));
        ImageView OWL_SHAI_DRAGONS  = new ImageView(new Image("/sample/OWL/PACIFIC/OWL_SHAI_DRAGONS.png"));

        initializePacificButtons(OWL_DALLAS_FUEL, OWL_LA_GLADIATORS, OWL_LA_VALIANT, OWL_SEOUL_DYNASTY, OWL_SF_SHOCK, OWL_SHAI_DRAGONS, homeScreen);

        //ATLANTIC TEAMS



        atlanticImage.setOnMouseClicked(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent me) {
                window.setScene(new Scene(teamPage));
            }
        });
        pacificImage.setOnMouseClicked(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent me) {
                window.setScene(new Scene(teamPage));
            }
        });
        owwcIcon.setOnMouseClicked(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent me) {
                window.setScene(new Scene(teamPage));
            }
        });











        Font.loadFont(getClass().getResourceAsStream("/sample/OWL/bignoodletoo.ttf"), 14);
        window.setScene(new Scene(homeScreen));
        window.show();
    }

    public void setScene(){

    }
    public static void ok(){

        return;
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
        fuel.setFitHeight(158.0);
        fuel.setFitWidth(324.0);
        fuel.setLayoutX(622.0);
        fuel.setLayoutY(328.0);
        fuel.setPickOnBounds(true);
        fuel.setPreserveRatio(true);

        glad.setFitHeight(158.0);
        glad.setFitWidth(324.0);
        glad.setLayoutX(622.0);
        glad.setLayoutY(328.0);
        glad.setPickOnBounds(true);
        glad.setPreserveRatio(true);

        vali.setFitHeight(158.0);
        vali.setFitWidth(324.0);
        vali.setLayoutX(622.0);
        vali.setLayoutY(328.0);
        vali.setPickOnBounds(true);
        vali.setPreserveRatio(true);

        dyna.setFitHeight(158.0);
        dyna.setFitWidth(324.0);
        dyna.setLayoutX(622.0);
        dyna.setLayoutY(328.0);
        dyna.setPickOnBounds(true);
        dyna.setPreserveRatio(true);

        shock.setFitHeight(158.0);
        shock.setFitWidth(324.0);
        shock.setLayoutX(622.0);
        shock.setLayoutY(328.0);
        shock.setPickOnBounds(true);
        shock.setPreserveRatio(true);

        drag.setFitHeight(158.0);
        drag.setFitWidth(324.0);
        drag.setLayoutX(622.0);
        drag.setLayoutY(328.0);
        drag.setPickOnBounds(true);
        drag.setPreserveRatio(true);

        homeScreen.getChildren().addAll(fuel, glad, vali, dyna, shock, drag);

        return;
    }

    public void initializeAtlanticButtons(ImageView rise, ImageView mayh, ImageView outl, ImageView spit, ImageView excel, ImageView fusion, Pane homeScreen){
        rise.setFitHeight(158.0);
        rise.setFitWidth(324.0);
        rise.setLayoutX(622.0);
        rise.setLayoutY(328.0);
        rise.setPickOnBounds(true);
        rise.setPreserveRatio(true);

        mayh.setFitHeight(158.0);
        mayh.setFitWidth(324.0);
        mayh.setLayoutX(622.0);
        mayh.setLayoutY(328.0);
        mayh.setPickOnBounds(true);
        mayh.setPreserveRatio(true);

        outl.setFitHeight(158.0);
        outl.setFitWidth(324.0);
        outl.setLayoutX(622.0);
        outl.setLayoutY(328.0);
        outl.setPickOnBounds(true);
        outl.setPreserveRatio(true);

        spit.setFitHeight(158.0);
        spit.setFitWidth(324.0);
        spit.setLayoutX(622.0);
        spit.setLayoutY(328.0);
        spit.setPickOnBounds(true);
        spit.setPreserveRatio(true);

        excel.setFitHeight(158.0);
        excel.setFitWidth(324.0);
        excel.setLayoutX(622.0);
        excel.setLayoutY(328.0);
        excel.setPickOnBounds(true);
        excel.setPreserveRatio(true);

        fusion.setFitHeight(158.0);
        fusion.setFitWidth(324.0);
        fusion.setLayoutX(622.0);
        fusion.setLayoutY(328.0);
        fusion.setPickOnBounds(true);
        fusion.setPreserveRatio(true);

        homeScreen.getChildren().addAll(rise, mayh, outl, spit, excel, fusion);

        return;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
