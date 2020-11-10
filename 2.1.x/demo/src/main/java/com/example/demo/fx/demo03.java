package com.example.demo.fx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class demo03 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Text hello = new Text(2,2,"周凯伟");

        // 雪人底
        Ellipse base = new Ellipse(130, 210, 80, 80);
        base.setFill(Color.WHITE);

        // 雪人中
        Ellipse middle = new Ellipse(130, 130, 50, 40);
        middle.setFill(Color.WHITE);

        // 雪人头
        Circle head = new Circle(130, 70, 30);
        head.setFill(Color.WHITE);

        // 雪人眼睛
        Circle rightEye = new Circle(120, 60, 5);
        Circle leftEye = new Circle(140, 60, 5);

        //雪人嘴 直的
        //Line mouth = new Line(70, 80, 90, 80);

        //雪人嘴 弯的
        Arc mouth = new Arc(130,80,10,10,0,180);
        mouth.setFill(Color.TRANSPARENT);
        mouth.setStroke(Color.BLACK);
        mouth.setType(ArcType.OPEN);

        // 雪人胳膊
        Line leftArm = new Line(160, 130, 210, 130);
        Line rightArm = new Line(110, 130, 50, 100);
        leftArm.setStrokeWidth(3);
        rightArm.setStrokeWidth(3);

        // 雪人纽扣
        Circle topButton = new Circle(130, 120, 6);
        Circle bottomButton = new Circle(130, 140, 6);
        topButton.setFill(Color.RED);
        bottomButton.setFill(Color.RED);

        // 帽子
        Rectangle stovepipe = new Rectangle(110, 0, 40, 50);
        Rectangle brim = new Rectangle(100, 45, 60, 5);
        Group hat = new Group(stovepipe, brim);
        hat.setTranslateX(10);
        hat.setRotate(15);

        // 组装雪人
        Group snowman = new Group(hello,base, middle, head, leftEye, rightEye, mouth,
                topButton, bottomButton, leftArm, rightArm, hat);
        snowman.setTranslateX(170);
        snowman.setTranslateY(50);

        // 太阳
        Circle sun = new Circle(450, 50, 30);
        sun.setFill(Color.GOLD);

        Rectangle ground = new Rectangle(0, 250, 500, 100);
        ground.setFill(Color.STEELBLUE);

        // 展示屏幕
        Group root = new Group(ground, sun, snowman);
        Scene scene = new Scene(root, 500, 350, Color.LIGHTBLUE);
        primaryStage.setTitle("雪人");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

}
