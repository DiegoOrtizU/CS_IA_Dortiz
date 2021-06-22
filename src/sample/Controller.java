package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Controller {
    public TextArea GDstudentAnswersTextArea;
    public TextArea IGLstudentAnswersTextArea;
    @FXML  private TextField IGLStudentAnswerTextField;
    @FXML  private TextField GDStudentAnswerTextField;
    @FXML  private AnchorPane MAINPANEL;
@FXML  private AnchorPane IGLQUESTIONSPANEL;
@FXML  private AnchorPane GDQUESTIONSPANEL;
@FXML  private AnchorPane IGLINFORMATIONPANEL;
@FXML  private AnchorPane GDINFORMATIONPANEL;
@FXML  private Label IGLQUESTION;
@FXML  private Button IGLNEWQUESTIONBTN;
@FXML  private Label GDQUESTION;
@FXML  private Button GDNEWQUESTIONBTN;
    @FXML  private Label GDNEWQUESTION;
    @FXML  private Label IGLNEWQUESTION;
    @FXML  private Button IGLREGISTERANSWERBTN;

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
        //
        IGLQUESTION.setText(questionsIGL.get(questionsIGL.size()-1).getQuestionIGL());
        System.out.println(questionsIGL.get(questionsIGL.size() - 1).getIGLAnswer());
    }
    private StringBuilder IGLfieldContent = new StringBuilder("");

    public void IGLREGISTERANSWERBTN(ActionEvent actionEvent) {
        if (IGLStudentAnswerTextField.getText().isEmpty()) {
            //empty. please write something
            System.out.println("You forgot to write your answer.");
        } else {

            questionsIGL.get(questionsIGL.size() - 1).setIGLStudentAnswer(Double.parseDouble(IGLStudentAnswerTextField.getText()));
            IGLfieldContent.append("Your answer to question " + questionsIGL.size() + " was " + questionsIGL.get(questionsIGL.size() - 1).isCorrect() + "\n");
            IGLfieldContent.append("You said " + questionsIGL.get(questionsIGL.size() - 1).getIGLStudentAnswer() + " and the answer is " + questionsIGL.get(questionsIGL.size() - 1).getIGLAnswer() + "\n");
            IGLstudentAnswersTextArea.setText(IGLfieldContent.toString());
        }

    }





    public void GDREGISTERANSWERBTN(ActionEvent actionEvent) {
        //if this text bos is not empty... dfo this. else do nothing.

        if(GDStudentAnswerTextField.getText().isEmpty()){
            //empty. please write something
            System.out.println("You forgot to write your answer.");
        }else {

            questionsGD.get(questionsGD.size() - 1).setStudentAnswer(Double.parseDouble(GDStudentAnswerTextField.getText()));
            GDfieldContent.append("Your answer to question " + questionsGD.size() + " was " + questionsGD.get(questionsGD.size() - 1).isCorrect()+"\n");
            GDfieldContent.append("You said " + questionsGD.get(questionsGD.size() - 1).getStudentAnswer() + " and the answer is " + questionsGD.get(questionsGD.size() - 1).getAnswer()+"\n");
            GDstudentAnswersTextArea.setText(GDfieldContent.toString());

            //clear the answer box
            //if questionsGD size is less than 10 (9 questions) then
            //GDNEWQUESTION(); //make the next question
            //else
            //go to th next screen or display  the resultss bit.

        }

    }

    public void GDNEWQUESTION(ActionEvent actionEvent) {
        //if the student answer text box is not empty. save the answer and continue with the next question.
        //you also want to clear the text box when you save the answer.
        questionsGD.add(new QuestionGD());
        //
        GDQUESTION.setText(questionsGD.get(questionsGD.size()-1).getQuestionGD());
        System.out.println(questionsGD.get(questionsGD.size() - 1).getAnswer());
    }

    private StringBuilder GDfieldContent = new StringBuilder("");

    }


//Additions:
//complexity - how can you do something fancy to show the results., go through each question with a loop accessing the arraylist of objects.
//you could make a timer for the questions so that the user can see how long each question took. make an average of this on the results page.
//the results page cuild show that time for each question with the average under.