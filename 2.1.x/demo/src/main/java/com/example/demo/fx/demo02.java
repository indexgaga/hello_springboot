package com.example.demo.fx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class demo02 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Rectangle rect1 = new Rectangle(50,50,250,60);
        rect1.setFill(Color.RED);

        Rectangle rect3 = new Rectangle(60,70,125,20);
        rect3.setFill(Color.BLACK);

        Ellipse ellipse = new Ellipse(200,90,100,30);
        ellipse.setFill(Color.YELLOW);

        Ellipse ellipse2 = new Ellipse(250,200,80,30);
        ellipse2.setFill(Color.GREEN);


        Group group = new Group(rect1,rect3,ellipse,ellipse2);
        Scene scene = new Scene(group);

        primaryStage.setScene(scene);
        primaryStage.setWidth(500);
        primaryStage.setHeight(500);
        primaryStage.show();
    }
}
