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


ArrayList<QuestionIGL> questionsIGL = new ArrayList<>();
ArrayList<QuestionGD> questionsGD = new ArrayList<>();

    public void QuestionsIGLNxtWndw(ActionEvent actionEvent) {
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

//if the student answer text box is not empty. save the answer and continue with the next question.
       //you also want to clear the text box when you save the answer.
        questionsIGL.add(new QuestionIGL());
        IGLQUESTION.setText(questionsIGL.get(questionsIGL.size()-1).getQuestionIGL());
    }

    public void IGLREGISTERANSWERBTN(ActionEvent actionEvent) {
      //if this text bos is not empty... dfo this. else do nothing.
        questionsIGL.get(questionsIGL.size()-1).setStudentAnswer(Double.parseDouble(studentAnswerTextField.getText()));
    }

    public void GDNEWQUESTION(){
        //if the student answer text box is not empty. save the answer and continue with the next question.
        //you also want to clear the text box when you save the answer.
        questionsGD.add(new QuestionGD());
        GDQUESTION.setText(questionsGD.get(questionsGD.size()-1).getQuestionGD());
    }
    public void GDREGISTERANSWERBTN(ActionEvent actionEvent) {
        //if this text bos is not empty... dfo this. else do nothing.
        questionsGD.get(questionsGD.size()-1).setStudentAnswer(Double.parseDouble(studentAnswerTextField.getText()));
    }

}
