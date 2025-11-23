package sample;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

import java.time.format.DateTimeFormatter;

public class ContractGUI extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Group root = new Group();
        Pane panedark = new Pane();

        panedark.setStyle("-fx-background-color:#ffffff");
        panedark.setPrefSize(700, 900);


        Label sponsor = new Label("Sponsor");
        sponsor.setFont(Font.font("calibri",FontWeight.NORMAL,26));
        sponsor.setTextFill(Color.web("#3b3b3b"));
        sponsor.setTranslateX(300);
        sponsor.setTranslateY(50);

        TextField name = new TextField();
        name.setPromptText("Name");
        name.setStyle("-fx-background-color: transparent;"+
                "-fx-background-radius: 30 30 30 30;-fx-border-color: #3b3b3b;;;"+
                "-fx-border-radius: 30 30 30 30;"+"-fx-text-fill:#000000;"+"-fx-prompt-text-fill:#3b3b3b;;");
        name.setPrefWidth(300);
        name.setTranslateX(50);
        name.setTranslateY(100);
        name.setFocusTraversable(false);

        TextField civil_ID = new TextField();
        civil_ID.setPromptText("Civil ID");
        civil_ID.setStyle("-fx-background-color: transparent;"+
                "-fx-background-radius: 30 30 30 30;-fx-border-color: #3b3b3b;;;"+
                "-fx-border-radius: 30 30 30 30;"+"-fx-text-fill:#000000;"+"-fx-prompt-text-fill:#3b3b3b;;");
        civil_ID.setPrefWidth(300);
        civil_ID.setTranslateX(360);
        civil_ID.setTranslateY(100);
        civil_ID.setFocusTraversable(false);

        TextField Residence = new TextField();
        Residence.setPromptText("Type of Residence");
        Residence.setStyle("-fx-background-color: transparent;"+
                "-fx-background-radius: 30 30 30 30;-fx-border-color: #3b3b3b;;;"+
                "-fx-border-radius: 30 30 30 30;"+"-fx-text-fill:#000000;"+"-fx-prompt-text-fill:#3b3b3b;;");
        Residence.setPrefWidth(150);
        Residence.setTranslateX(50);
        Residence.setTranslateY(150);
        Residence.setFocusTraversable(false);

        TextField familyNum = new TextField();
        familyNum.setPromptText("Family Members");
        familyNum.setStyle("-fx-background-color: transparent;"+
                "-fx-background-radius: 30 30 30 30;-fx-border-color: #3b3b3b;;;"+
                "-fx-border-radius: 30 30 30 30;"+"-fx-text-fill:#000000;"+"-fx-prompt-text-fill:#3b3b3b;;");
        familyNum.setPrefWidth(140);
        familyNum.setTranslateX(210);
        familyNum.setTranslateY(150);
        familyNum.setFocusTraversable(false);

        TextField position = new TextField();
        position.setPromptText("Position");
        position.setStyle("-fx-background-color: transparent;"+
                "-fx-background-radius: 30 30 30 30;-fx-border-color: #3b3b3b;;;"+
                "-fx-border-radius: 30 30 30 30;"+"-fx-text-fill:#000000;"+"-fx-prompt-text-fill:#3b3b3b;;");
        position.setPrefWidth(300);
        position.setTranslateX(360);
        position.setTranslateY(150);
        position.setFocusTraversable(false);


        TextField address = new TextField();
        address.setPromptText("Home Adress");
        address.setStyle("-fx-background-color: transparent;"+
                "-fx-background-radius: 30 30 30 30;-fx-border-color: #3b3b3b;;;"+
                "-fx-border-radius: 30 30 30 30;"+"-fx-text-fill:#000000;"+"-fx-prompt-text-fill:#3b3b3b;;");
        address.setPrefWidth(610);

        address.setTranslateX(50);
        address.setTranslateY(200);
        address.setFocusTraversable(false);

        ///
        TextField phoneNo = new TextField();
        phoneNo.setPromptText("Phone number");
        phoneNo.setStyle("-fx-background-color: transparent;"+
                "-fx-background-radius: 30 30 30 30;-fx-border-color: #3b3b3b;;;"+
                "-fx-border-radius: 30 30 30 30;"+"-fx-text-fill:#000000;"+"-fx-prompt-text-fill:#3b3b3b;;");
        phoneNo.setPrefWidth(300);

        phoneNo.setTranslateX(50);
        phoneNo.setTranslateY(250);
        phoneNo.setFocusTraversable(false);

        Label worker = new Label("Domestic Worker");
        worker.setFont(Font.font("calibri",FontWeight.NORMAL,26));
        worker.setTextFill(Color.web("#3b3b3b"));
        worker.setTranslateX(245);
        worker.setTranslateY(300);

        TextField workerName = new TextField();
        workerName.setPromptText("Name");
        workerName.setStyle("-fx-background-color: transparent;"+
                "-fx-background-radius: 30 30 30 30;-fx-border-color: #3b3b3b;;;"+
                "-fx-border-radius: 30 30 30 30;"+"-fx-text-fill:#000000;"+"-fx-prompt-text-fill:#3b3b3b;;");
        workerName.setPrefWidth(300);
        workerName.setTranslateX(50);
        workerName.setTranslateY(350);
        workerName.setFocusTraversable(false);

        DatePicker workerDOB = new DatePicker();
        workerDOB.setPromptText("Date of Birth");
        workerDOB.setPrefWidth(300);
        workerDOB.setTranslateX(360);
        workerDOB.setTranslateY(400);
        workerDOB.setFocusTraversable(false);



        TextField passNo = new TextField();
        passNo.setPromptText("Passport No.");
        passNo.setStyle("-fx-background-color: transparent;"+
                "-fx-background-radius: 30 30 30 30;-fx-border-color: #3b3b3b;"+
                "-fx-border-radius: 30 30 30 30;"+"-fx-text-fill:#000000;"+"-fx-prompt-text-fill:#3b3b3b;;");
        passNo.setPrefWidth(300);
        passNo.setTranslateX(50);
        passNo.setTranslateY(400);
        passNo.setFocusTraversable(false);

        Button dnbtn = new Button("Done");
        dnbtn.setStyle("-fx-background-color: transparent;" +
                "-fx-background-radius: 30 30 30 30;" +
                "-fx-border-color: #3b3b3b;" +
                "-fx-border-radius: 30 30 30 30");
        dnbtn.setTextFill(Color.web("#3b3b3b"));
        dnbtn.setTranslateX(270);
        dnbtn.setTranslateY(480);
        dnbtn.setPrefWidth(150);
        dnbtn.setPrefHeight(40);



        panedark.getChildren().addAll(name,civil_ID,sponsor,Residence,familyNum,position,address,phoneNo,worker,workerName,workerDOB,passNo,dnbtn);

        root.getChildren().addAll(panedark);
        primaryStage.setScene(new Scene(root, 700, 550));
        primaryStage.setTitle("Demo");
        primaryStage.show();

        dnbtn.setOnMouseClicked(mouseEvent -> {
            Contract contract=new Contract();
            contract.createContract( name.getText(),  civil_ID.getText(),  familyNum.getText(),  Residence.getText(),  position.getText(),  address.getText(),  phoneNo.getText(),  workerName.getText(),  workerDOB.getValue().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")),  passNo.getText());
        });
        dnbtn.setOnMouseEntered(mouseEvent -> {
            dnbtn.setStyle("-fx-background-color: #3b3b3b;-fx-background-radius: 30 30 30 30;-fx-border-color: transparent;-fx-border-radius: 30 30 30 30");
            dnbtn.setTextFill(Color.web("#ffffff"));
        });
        dnbtn.setOnMouseExited(mouseEvent -> {
            dnbtn.setStyle("-fx-background-color: transparent;" +
                    "-fx-background-radius: 30 30 30 30;" +
                    "-fx-border-color: #3b3b3b;" +
                    "-fx-border-radius: 30 30 30 30");
            dnbtn.setTextFill(Color.web("#3b3b3b"));
        });
    }
}
