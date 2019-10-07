import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import java.util.concurrent.TimeUnit;

public class Run extends Application {

    private static String PROGRAM_VERSION = "v0.0.1";
    private static int SCREEN_WIDTH = 1024;
    private static int SCREEN_HEIGHT = 768;

    private GraphicsContext gc;
    private long FPS = TimeUnit.SECONDS.toNanos(1 / 30);
    private long startTime = System.nanoTime();
    private long currentTime;

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("OOP Game Project " + PROGRAM_VERSION);
        primaryStage.setResizable(false);
        Group rootGroup = new Group();
        Scene rootScene = new Scene(rootGroup, SCREEN_WIDTH, SCREEN_HEIGHT, Color.BLACK);
        primaryStage.sizeToScene();
        Canvas canvas = new Canvas(SCREEN_WIDTH, SCREEN_HEIGHT);
        gc = canvas.getGraphicsContext2D();
        rootGroup.getChildren().add(canvas);
        primaryStage.setScene(rootScene);
        primaryStage.show();
        AnimationTimer animator = new AnimationTimer() {
            @Override
            public void handle(long arg0) {
                currentTime = System.nanoTime();
                if (FPS <= (currentTime - startTime)) {
                    update();
                    render();
                    startTime = currentTime;
                }
            }
        };
        animator.start();
    }

    public void update() {

    }

    public void render() {

    }

}
