package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Controller {
    @FXML  private TextField studentAnswerTextField;
    @FXML  private AnchorPane MAINPANEL;
@FXML  private AnchorPane IGLQUESTIONSPANEL;
@FXML  private AnchorPane GDQUESTIONSPANEL;
@FXML  private AnchorPane IGLINFORMATIONPANEL;
@FXML  private AnchorPane GDINFORMATIONPANEL;
@FXML  private Label IGLQUESTION;
@FXML  private Button IGLNEWQUESTIONBTN;
@FXML  private Label GDQUESTION;
@FXML  private Button GDNEWQUESTIONBTN;


ArrayList<QuestionIGL> questions = new ArrayList<QuestionIGL>();

    public void QUESTIONSIGLNXTWNDW(ActionEvent actionEvent) {
        MAINPANEL.setVisible(false);
        IGLQUESTIONSPANEL.setVisible(true);

        //for(int i = 0;i<questions.size()-1;i++){
       //     System.out.println(questions.get(i).isCorrect());
       // }
    }


    public void INFORMATIONGDNXTWNDW(ActionEvent actionEvent) {
        MAINPANEL.setVisible(false);
        GDINFORMATIONPANEL.setVisible(true);
    }

    public void INFORMATIONIGLNXTWNDW(ActionEvent actionEvent) {
        MAINPANEL.setVisible(false);
        IGLINFORMATIONPANEL.setVisible(true);
    }

    public void QUESTIONSGDNXTWNDW(ActionEvent actionEvent) {
        MAINPANEL.setVisible(false);
        GDQUESTIONSPANEL.setVisible(true);
    }


    public void QIGLMAINWINDOWBTN(ActionEvent actionEvent) {
        MAINPANEL.setVisible(true);
        IGLQUESTIONSPANEL.setVisible(false);
    }


    public void QGDMAINWINDOWBTN(ActionEvent actionEvent) {
        MAINPANEL.setVisible(true);
        GDQUESTIONSPANEL.setVisible(false);
    }

    public void INFIGLMAINWINDOWBTN(ActionEvent actionEvent) {
        MAINPANEL.setVisible(true);
        IGLINFORMATIONPANEL.setVisible(false);
    }

    public void INFGDMAINWINDOWBTN(ActionEvent actionEvent) {
        MAINPANEL.setVisible(true);
        GDINFORMATIONPANEL.setVisible(false);
    }



    public void IGLNEWQUESTION(){

//if the student answer text box is not empty. save the answer and continue with the next questoin.
       //you also want to clear the text box when you save the answer.
        questions.add(new QuestionIGL());
        IGLQUESTION.setText(questions.get(questions.size()-1).getQuestion());

    }




    public void IGLREGISTERANSWERBTN(ActionEvent actionEvent) {
      //if this text bos is not empty... dfo this. else do nothing.
        questions.get(questions.size()-1).setStudentAnswer(Double.parseDouble(studentAnswerTextField.getText()));
    }


    public void GDNEWQUESTION(){
        Random generator = new Random();
        Scanner keyboard = new Scanner(System.in);
        double answer;


        double Temperature = (generator.nextDouble()*350)+273;
        double Pressure = (generator.nextDouble()*120)+30;
        double MolarMass = (generator.nextDouble()*150)+15;



        double roundTemperature= (double) Math.round(Temperature*100)/100;
        Temperature = roundTemperature;

        double roundPressure= (double) Math.round(Pressure*100)/100;
        Pressure = roundPressure;

        double roundMolarMass= (double) Math.round(MolarMass*100)/100;
        MolarMass = roundMolarMass;

        GDQUESTION.setText("Determine the gas density of a gas at " + Temperature + "K at a pressure of " + Pressure + "atm and with a molar mass of " + MolarMass + "g/mol?");
    }
}
