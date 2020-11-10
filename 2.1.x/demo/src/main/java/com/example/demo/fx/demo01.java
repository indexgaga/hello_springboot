package com.example.demo.fx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class demo01 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Rectangle rect1 = new Rectangle(50,50,250,60);
        rect1.setStroke(Color.RED);
        rect1.setFill(Color.TRANSPARENT);

        Rectangle rect2 = new Rectangle(70,60,250,60);
        rect2.setStroke(Color.YELLOW);
        rect2.setFill(Color.TRANSPARENT);

        Rectangle rect3 = new Rectangle(60,70,125,20);
        rect3.setStroke(Color.BLACK);
        rect3.setFill(Color.TRANSPARENT);

        Rectangle rect4 = new Rectangle(150,200,250,60);
        rect4.setStroke(Color.GREEN);
        rect4.setFill(Color.TRANSPARENT);



        Group group = new Group(rect1,rect2,rect3,rect4);
        Scene scene = new Scene(group);

        primaryStage.setScene(scene);
        primaryStage.setWidth(500);
        primaryStage.setHeight(500);
        primaryStage.show();
    }
}
