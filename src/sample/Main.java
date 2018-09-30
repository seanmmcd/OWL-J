package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import java.io.File;
import java.net.MalformedURLException;
import static javafx.stage.StageStyle.UNDECORATED;

public class Main extends Application {

    private double x,y;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Pane root = FXMLLoader.load(getClass().getResource("homeScreen.fxml"));
        primaryStage.setTitle("Overwatch E-Sports Official Standings");


        primaryStage.initStyle(UNDECORATED);

        primaryStage.getIcons().add(new Image("/sample/OWL/ICON.png"));

        primaryStage.setResizable(false);

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

        root.getChildren().add(backgroundLoop);

        player.setCycleCount(MediaPlayer.INDEFINITE);
        player.play();

        backgroundLoop.setY(25);
        backgroundLoop.setX(0);

        backgroundLoop.fitWidthProperty().bind(root.widthProperty());
        backgroundLoop.fitWidthProperty().bind(root.widthProperty());

        backgroundLoop.toBack();

        Font.loadFont(getClass().getResourceAsStream("/sample/OWL/bignoodletoo.ttf"), 14);

        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
