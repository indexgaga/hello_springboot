package com.didispace.test;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;

public class ArcTest extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Arc arc = new Arc(200,200,100,40,0,60);
        arc.setFill(Color.WHITE);
        arc.setStroke(Color.BLACK);//设置画笔颜色
        arc.setStrokeWidth(2);//设置画笔宽度
        arc.setType(ArcType.ROUND);//此为弧或扇形开关，此时打开的是扇形


        Group g = new Group(arc);
//        HBox box = new HBox(arc);//也可以放在Group中

        Scene scene = new Scene(g);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Test");
        primaryStage.show();
    }
}
