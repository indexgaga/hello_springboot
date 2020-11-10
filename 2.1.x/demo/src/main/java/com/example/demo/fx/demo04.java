package com.example.demo.fx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class demo04 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        //RAU
        Arc RAU = new Arc(150,150,100,100,0,126); 						//35% red
        RAU.setFill(Color.RED);
        RAU.setType(ArcType.ROUND);
        Text RAUText = new Text(160,120,"Rent and Utilities");    		//文字显示



        //Transportation
        Arc Transportation = new Arc(150,150,100,100,126,54);				//15% green
        Transportation.setFill(Color.GREEN);
        Transportation.setType(ArcType.ROUND);
        Text TransportationText = new Text(25,100,"Transportation");    		//文字显示

        //Food
        Arc Food = new Arc(150,150,100,100,180,54);						//15% sky blue
        Food.setFill(Color.SKYBLUE);
        Food.setType(ArcType.ROUND);
        Text FoodText = new Text(50,180,"Food");    		//文字显示

        //Education
        Arc Education = new Arc(150,150,100,100,234,90);					//25% blue
        Education.setFill(Color.BLUE);
        Education.setType(ArcType.ROUND);
        Text EducationText = new Text(150,230,"Education");    		//文字显示

        //Miscellaneous
        Arc Miscellaneous = new Arc(150,150,100,100,324,36);				//10% pink
        Miscellaneous.setFill(Color.PINK);
        Miscellaneous.setType(ArcType.ROUND);
        Text MiscellaneousText = new Text(200,180,"Miscellaneous");    		//文字显示


        Group root = new Group(RAU, Transportation,Food, Education,Miscellaneous,
                RAUText,TransportationText,FoodText,EducationText,MiscellaneousText);
        Scene scene = new Scene(root, 500, 350);
        primaryStage.setTitle("PieChat");
        primaryStage.setScene(scene);
        primaryStage.show();


    }
}
