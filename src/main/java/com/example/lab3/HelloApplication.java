package com.example.lab3;


import java.util.Random;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;




public class HelloApplication extends Application {


    //declare 12 rectangle objects representing bars
    Rectangle bar, bar2, bar3, bar4, bar5, bar6;
    Rectangle bar7, bar8, bar9, bar10, bar11, bar12;


    //create random obj to use random func
    Random random = new Random();




    // bottom of the chart, used to place bars in uniform fashion
    int baseline = 500;




    @Override
    public void start(Stage stage) {


        //create pane(visual effects background)
        Pane root = new Pane();
        Scene scene = new Scene(root, 640, 640);


        // Create grid, each cell set to 10
        int gridSize = 500;
        int cells = 10;
        int cellSize = gridSize / cells;




        // create vertical lines
        for (int i = 0; i <= cells; i++) {
            Line line = new Line();


            line.setStartX(i * cellSize);
            line.setStartY(0);


            line.setEndX(i * cellSize);
            line.setEndY(gridSize);


            line.setStroke(Color.BLACK);


            root.getChildren().add(line);
        }


        // horizontal lines
        for (int i = 0; i <= cells; i++) {


            Line line = new Line();


            line.setStartX(0);
            line.setStartY(i * cellSize);


            line.setEndX(gridSize);
            line.setEndY(i * cellSize);


            line.setStroke(Color.LIGHTGRAY);


            root.getChildren().add(line);
        }


        //create button called redraw
        Button redraw = new Button();


        //set button name and set size
        redraw.setText("Redraw");
        redraw.setPrefSize(350, 40);


        //create anynomous function
        redraw.setOnAction(event -> {
            onRedraw();
        });


        //set coordinates for button
        redraw.setLayoutX(145);
        redraw.setLayoutY(580);


        //add button to pane
        root.getChildren().add(redraw);


        /********************************************/

        //declare height, set to random value up to 350
        int height = random.nextInt(350);


        //create 12 bars--each bar a new rectangle with width of 30, random height, random color
        //bar1
        bar = new Rectangle();
        bar.setWidth(30);
        bar.setHeight(height);
        bar.setFill(
                Color.color(
                        Math.random(),
                        Math.random(),
                        Math.random()
                )
        );


        //set postion of each bar, each spaced by 40 units
        bar.setLayoutX(20);
        bar.setLayoutY(baseline - height);
        root.getChildren().add(bar);



        //bar2
        height = random.nextInt(350);
        bar2 = new Rectangle();
        bar2.setWidth(30);
        bar2.setHeight(height);
        bar2.setFill(
                Color.color(
                        Math.random(),
                        Math.random(),
                        Math.random()
                )
        );


        bar2.setLayoutX(60);
        bar2.setLayoutY(baseline - height);
        root.getChildren().add(bar2);




        //bar3
        height = random.nextInt(350);
        bar3 = new Rectangle();
        bar3.setWidth(30);
        bar3.setHeight(height);
        bar3.setFill(
                Color.color(
                        Math.random(),
                        Math.random(),
                        Math.random()
                )
        );


        bar3.setLayoutX(100);
        bar3.setLayoutY(baseline - height);
        root.getChildren().add(bar3);




        //bar4
        height = random.nextInt(350);
        bar4 = new Rectangle();
        bar4.setWidth(30);
        bar4.setHeight(height);
        bar4.setFill(
                Color.color(
                        Math.random(),
                        Math.random(),
                        Math.random()
                )
        );
        bar4.setLayoutX(140);
        bar4.setLayoutY(baseline - height);
        root.getChildren().add(bar4);




        //bar5
        height = random.nextInt(350);
        bar5 = new Rectangle();
        bar5.setWidth(30);
        bar5.setHeight(height);
        bar5.setFill(
                Color.color(
                        Math.random(),
                        Math.random(),
                        Math.random()
                )
        );


        bar5.setLayoutX(180);
        bar5.setLayoutY(baseline - height);
        root.getChildren().add(bar5);




        //bar6
        height = random.nextInt(350);
        bar6 = new Rectangle();
        bar6.setWidth(30);
        bar6.setHeight(height);
        bar6.setFill(
                Color.color(
                        Math.random(),
                        Math.random(),
                        Math.random()
                )
        );


        bar6.setLayoutX(220);
        bar6.setLayoutY(baseline - height);
        root.getChildren().add(bar6);


        //bar7
        height = random.nextInt(350);
        bar7 = new Rectangle();
        bar7.setWidth(30);
        bar7.setHeight(height);
        bar7.setFill(
                Color.color(
                        Math.random(),
                        Math.random(),
                        Math.random()
                )
        );


        bar7.setLayoutX(260);
        bar7.setLayoutY(baseline - height);
        root.getChildren().add(bar7);




        //bar8
        height = random.nextInt(350);
        bar8 = new Rectangle();
        bar8.setWidth(30);
        bar8.setHeight(height);
        bar8.setFill(
                Color.color(
                        Math.random(),
                        Math.random(),
                        Math.random()
                )
        );


        bar8.setLayoutX(300);
        bar8.setLayoutY(baseline - height);
        root.getChildren().add(bar8);




        //bar9
        height = random.nextInt(350);
        bar9 = new Rectangle();
        bar9.setWidth(30);
        bar9.setHeight(height);
        bar9.setFill(
                Color.color(
                        Math.random(),
                        Math.random(),
                        Math.random()
                )
        );


        bar9.setLayoutX(340);
        bar9.setLayoutY(baseline - height);
        root.getChildren().add(bar9);




        //bar10
        height = random.nextInt(350);
        bar10 = new Rectangle();
        bar10.setWidth(30);
        bar10.setHeight(height);
        bar10.setFill(
                Color.color(
                        Math.random(),
                        Math.random(),
                        Math.random()
                )
        );


        bar10.setLayoutX(380);
        bar10.setLayoutY(baseline - height);
        root.getChildren().add(bar10);




        //bar11
        height = random.nextInt(350);
        bar11 = new Rectangle();
        bar11.setWidth(30);
        bar11.setHeight(height);
        bar11.setFill(
                Color.color(
                        Math.random(),
                        Math.random(),
                        Math.random()
                )
        );


        bar11.setLayoutX(420);
        bar11.setLayoutY(baseline - height);
        root.getChildren().add(bar11);




        //bar12
        height = random.nextInt(350);
        bar12 = new Rectangle();
        bar12.setWidth(30);
        bar12.setHeight(height);
        bar12.setFill(
                Color.color(
                        Math.random(),
                        Math.random(),
                        Math.random()
                )
        );


        bar12.setLayoutX(460);
        bar12.setLayoutY(baseline - height);
        root.getChildren().add(bar12);


        //create title
        stage.setTitle("Lab03: Bar Chart");
        stage.setScene(scene);
        stage.show();
    }


    //redraw function will randomize the height and color of each bar upon clicking "redraw" button
    void onRedraw() {


        //bar1
        int height = random.nextInt(350);
        bar.setHeight(height);
        bar.setLayoutY(baseline - height);
        bar.setFill(Color.color(
                Math.random(),
                Math.random(),
                Math.random()
        ));


        //bar2
        height = random.nextInt(350);
        bar2.setHeight(height);
        bar2.setLayoutY(baseline - height);
        bar2.setFill(Color.color(
                Math.random(),
                Math.random(),
                Math.random()
        ));


        //bar3
        height = random.nextInt(350);
        bar3.setHeight(height);
        bar3.setLayoutY(baseline - height);
        bar3.setFill(Color.color(
                Math.random(),
                Math.random(),
                Math.random()
        ));


        //bar4
        height = random.nextInt(350);
        bar4.setHeight(height);
        bar4.setLayoutY(baseline - height);
        bar4.setFill(Color.color(
                Math.random(),
                Math.random(),
                Math.random()
        ));


        //bar5
        height = random.nextInt(350);
        bar5.setHeight(height);
        bar5.setLayoutY(baseline - height);
        bar5.setFill(Color.color(
                Math.random(),
                Math.random(),
                Math.random()
        ));


        //bar6
        height = random.nextInt(350);
        bar6.setHeight(height);
        bar6.setLayoutY(baseline - height);
        bar6.setFill(Color.color(
                Math.random(),
                Math.random(),
                Math.random()
        ));


        //bar7
        height = random.nextInt(350);
        bar7.setHeight(height);
        bar7.setLayoutY(baseline - height);
        bar7.setFill(Color.color(
                Math.random(),
                Math.random(),
                Math.random()
        ));


        //bar8
        height = random.nextInt(350);
        bar8.setHeight(height);
        bar8.setLayoutY(baseline - height);
        bar8.setFill(Color.color(
                Math.random(),
                Math.random(),
                Math.random()
        ));


        //bar9
        height = random.nextInt(350);
        bar9.setHeight(height);
        bar9.setLayoutY(baseline - height);
        bar9.setFill(Color.color(
                Math.random(),
                Math.random(),
                Math.random()
        ));


        //bar10
        height = random.nextInt(350);
        bar10.setHeight(height);
        bar10.setLayoutY(baseline - height);
        bar10.setFill(Color.color(
                Math.random(),
                Math.random(),
                Math.random()
        ));


        //bar11
        height = random.nextInt(350);
        bar11.setHeight(height);
        bar11.setLayoutY(baseline - height);
        bar11.setFill(Color.color(
                Math.random(),
                Math.random(),
                Math.random()
        ));


        //bar12
        height = random.nextInt(350);
        bar12.setHeight(height);
        bar12.setLayoutY(baseline - height);
        bar12.setFill(Color.color(
                Math.random(),
                Math.random(),
                Math.random()
        ));
    }
}

