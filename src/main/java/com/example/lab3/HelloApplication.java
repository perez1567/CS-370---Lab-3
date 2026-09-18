package com.example.lab3;

import java.util.Random;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    //declare 12 rectangle objects(bars)
    Rectangle bar, bar2, bar3, bar4, bar5, bar6;
    Rectangle bar7, bar8, bar9, bar10, bar11, bar12;

    @Override
    public void start(Stage stage) {

        Random random_ = new Random();

        //creating chart space
        Pane root = new Pane();
        Scene scene = new Scene(root, 640, 640);

        //create button w/ name & set size
        Button random = new Button();
        random.setText("Redraw");
        random.setPrefSize(350, 40);

        //create anonymous function
        random.setOnAction(event -> {
            onRedraw();
        });

        //set button coordinates
        random.setLayoutX(145);
        random.setLayoutY(580);
        root.getChildren().add(random);

        //set title
        stage.setTitle("Lab03: Bar Chart");
        stage.setScene(scene);
        stage.show();

        //create separate chart bars
        //Each with width of 30 w/ random heights and colors
        //each bar spaced out by 40 units on x axis

        int height1 = random_.nextInt(350);
        bar = new Rectangle();
        bar.setWidth(30);
        bar.setHeight(height1);
        bar.setFill(Color.color(Math.random(), Math.random(), Math.random()));
        bar.setLayoutX(20);
        bar.setLayoutY(500 - height1);
        root.getChildren().add(bar);

        int height2 = random_.nextInt(350);
        bar2 = new Rectangle();
        bar2.setWidth(30);
        bar2.setHeight(height2);
        bar2.setFill(Color.color(Math.random(), Math.random(), Math.random()));
        bar2.setLayoutX(60);
        bar2.setLayoutY(500 - height2);
        root.getChildren().add(bar2);

        int height3 = random_.nextInt(350);
        bar3 = new Rectangle();
        bar3.setWidth(30);
        bar3.setHeight(height3);
        bar3.setFill(Color.color(Math.random(), Math.random(), Math.random()));
        bar3.setLayoutX(100);
        bar3.setLayoutY(500 - height3);
        root.getChildren().add(bar3);

        int height4 = random_.nextInt(350);
        bar4 = new Rectangle();
        bar4.setWidth(30);
        bar4.setHeight(height4);
        bar4.setFill(Color.color(Math.random(), Math.random(), Math.random()));
        bar4.setLayoutX(140);
        bar4.setLayoutY(500 - height4);
        root.getChildren().add(bar4);

        int height5 = random_.nextInt(350);
        bar5 = new Rectangle();
        bar5.setWidth(30);
        bar5.setHeight(height5);
        bar5.setFill(Color.color(Math.random(), Math.random(), Math.random()));
        bar5.setLayoutX(180);
        bar5.setLayoutY(500 - height5);
        root.getChildren().add(bar5);

        int height6 = random_.nextInt(350);
        bar6 = new Rectangle();
        bar6.setWidth(30);
        bar6.setHeight(height6);
        bar6.setFill(Color.color(Math.random(), Math.random(), Math.random()));
        bar6.setLayoutX(220);
        bar6.setLayoutY(500 - height6);
        root.getChildren().add(bar6);

        int height7 = random_.nextInt(350);
        bar7 = new Rectangle();
        bar7.setWidth(30);
        bar7.setHeight(height7);
        bar7.setFill(Color.color(Math.random(), Math.random(), Math.random()));
        bar7.setLayoutX(260);
        bar7.setLayoutY(500 - height7);
        root.getChildren().add(bar7);

        int height8 = random_.nextInt(350);
        bar8 = new Rectangle();
        bar8.setWidth(30);
        bar8.setHeight(height8);
        bar8.setFill(Color.color(Math.random(), Math.random(), Math.random()));
        bar8.setLayoutX(300);
        bar8.setLayoutY(500 - height8);
        root.getChildren().add(bar8);

        int height9 = random_.nextInt(350);
        bar9 = new Rectangle();
        bar9.setWidth(30);
        bar9.setHeight(height9);
        bar9.setFill(Color.color(Math.random(), Math.random(), Math.random()));
        bar9.setLayoutX(340);
        bar9.setLayoutY(500 - height9);
        root.getChildren().add(bar9);

        int height10 = random_.nextInt(350);
        bar10 = new Rectangle();
        bar10.setWidth(30);
        bar10.setHeight(height10);
        bar10.setFill(Color.color(Math.random(), Math.random(), Math.random()));
        bar10.setLayoutX(380);
        bar10.setLayoutY(500 - height10);
        root.getChildren().add(bar10);

        int height11 = random_.nextInt(350);
        bar11 = new Rectangle();
        bar11.setWidth(30);
        bar11.setHeight(height11);
        bar11.setFill(Color.color(Math.random(), Math.random(), Math.random()));
        bar11.setLayoutX(420);
        bar11.setLayoutY(500 - height11);
        root.getChildren().add(bar11);

        int height12 = random_.nextInt(350);
        bar12 = new Rectangle();
        bar12.setWidth(30);
        bar12.setHeight(height12);
        bar12.setFill(Color.color(Math.random(), Math.random(), Math.random()));
        bar12.setLayoutX(460);
        bar12.setLayoutY(500 - height12);
        root.getChildren().add(bar12);
    }

    //create random object for generating random numbers in redraw func
    Random random = new Random();

    void onRedraw() {

        //randomize bar heights(value up to 350) & colors

        int height1 = random.nextInt(350);
        bar.setFill(Color.color(Math.random(), Math.random(), Math.random()));
        bar.setHeight(height1);
        bar.setLayoutY(500 - height1);

        int height2 = random.nextInt(350);
        bar2.setFill(Color.color(Math.random(), Math.random(), Math.random()));
        bar2.setHeight(height2);
        bar2.setLayoutY(500 - height2);

        int height3 = random.nextInt(350);
        bar3.setFill(Color.color(Math.random(), Math.random(), Math.random()));
        bar3.setHeight(height3);
        bar3.setLayoutY(500 - height3);

        int height4 = random.nextInt(350);
        bar4.setFill(Color.color(Math.random(), Math.random(), Math.random()));
        bar4.setHeight(height4);
        bar4.setLayoutY(500 - height4);

        int height5 = random.nextInt(350);
        bar5.setFill(Color.color(Math.random(), Math.random(), Math.random()));
        bar5.setHeight(height5);
        bar5.setLayoutY(500 - height5);

        int height6 = random.nextInt(350);
        bar6.setFill(Color.color(Math.random(), Math.random(), Math.random()));
        bar6.setHeight(height6);
        bar6.setLayoutY(500 - height6);

        int height7 = random.nextInt(350);
        bar7.setFill(Color.color(Math.random(), Math.random(), Math.random()));
        bar7.setHeight(height7);
        bar7.setLayoutY(500 - height7);

        int height8 = random.nextInt(350);
        bar8.setFill(Color.color(Math.random(), Math.random(), Math.random()));
        bar8.setHeight(height8);
        bar8.setLayoutY(500 - height8);

        int height9 = random.nextInt(350);
        bar9.setFill(Color.color(Math.random(), Math.random(), Math.random()));
        bar9.setHeight(height9);
        bar9.setLayoutY(500 - height9);

        int height10 = random.nextInt(350);
        bar10.setFill(Color.color(Math.random(), Math.random(), Math.random()));
        bar10.setHeight(height10);
        bar10.setLayoutY(500 - height10);

        int height11 = random.nextInt(350);
        bar11.setFill(Color.color(Math.random(), Math.random(), Math.random()));
        bar11.setHeight(height11);
        bar11.setLayoutY(500 - height11);

        int height12 = random.nextInt(350);
        bar12.setFill(Color.color(Math.random(), Math.random(), Math.random()));
        bar12.setHeight(height12);
        bar12.setLayoutY(500 - height12);
    }
}