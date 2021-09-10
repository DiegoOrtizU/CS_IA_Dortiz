package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.util.ArrayList;

public class Controller {
    public TextArea GDstudentAnswersTextArea;
    public TextArea IGLstudentAnswersTextArea;
    @FXML  private TextField IGLStudentAnswerTextField;
    @FXML  private TextField GDStudentAnswerTextField;
    @FXML  private AnchorPane mainpanel;
@FXML  private AnchorPane IdealGasLawQuestionsPanel;
@FXML  private AnchorPane GasDensityQuestionsPanel;
@FXML  private AnchorPane IdealGasLawInformationPanel;
@FXML  private AnchorPane GasDensityInformationPanel;
@FXML  private Label IdealGasLawQuestion;
@FXML  private Label GasDensityQuestion;


ArrayList<QuestionIGL> questionsIGL = new ArrayList<>();
ArrayList<QuestionGD> questionsGD = new ArrayList<>();

    public void questionsIdealGasLawNextWindow(ActionEvent actionEvent) {
        mainpanel.setVisible(false);
        IdealGasLawQuestionsPanel.setVisible(true);
//This button changes the visibility of both panels,
// therefore the Main Panel visibility is false and the IdealGasLawQuestionsPanel as true

    }


    public void informationGasDensityNextWindow(ActionEvent actionEvent) {
        mainpanel.setVisible(false);
        GasDensityInformationPanel.setVisible(true);
//This button changes the visibility of both panels,
// therefore the Main Panel visibility is false and the GasDensityInformationPanel as true
    }

    public void informationIdealGasLawNextWindow(ActionEvent actionEvent) {
        mainpanel.setVisible(false);
        IdealGasLawInformationPanel.setVisible(true);
//This button changes the visibility of both panels,
// therefore the Main Panel visibility is false and the IdealGasLawInformationPanel as true
    }

    public void questionsGasDensityNextWindow(ActionEvent actionEvent) {
        mainpanel.setVisible(false);
        GasDensityQuestionsPanel.setVisible(true);
//This button changes the visibility of both panels,
// therefore the Main Panel visibility is false and the GasDensityQuestionsPanel as true
    }


    public void questionsIdealGasLawMainWindowButton(ActionEvent actionEvent) {
        mainpanel.setVisible(true);
        IdealGasLawQuestionsPanel.setVisible(false);
//This button changes the visibility of both panels,
// therefore the Main Panel visibility is true  and the IdealGawLawQuestionsPanel as false
    }


    public void questionsGasDensityMainWindowButton(ActionEvent actionEvent) {
        mainpanel.setVisible(true);
        GasDensityQuestionsPanel.setVisible(false);
//This button changes the visibility of both panels,
// therefore the Main Panel visibility is true  and the GasDensityQuestionsPanel as false
    }

    public void informationIdealGasLawMainWindowButton(ActionEvent actionEvent) {
        mainpanel.setVisible(true);
        IdealGasLawInformationPanel.setVisible(false);
//This button changes the visibility of both panels,
// therefore the Main Panel visibility is true  and the IdealGasLawInformationPanel as false
    }

    public void informationGasDensityMainWindowButton(ActionEvent actionEvent) {
        mainpanel.setVisible(true);
        GasDensityInformationPanel.setVisible(false);
//This button changes the visibility of both panels,
// therefore the Main Panel visibility is true  and the GasDensityInformationPanel as false
    }



    public void IdealGasLawNewQuestion(){

//if the student answer text box is not empty. save the answer and continue with the next question.
       //you also want to clear the text box when you save the answer.
        questionsIGL.add(new QuestionIGL());
        //
        IdealGasLawQuestion.setText(questionsIGL.get(questionsIGL.size()-1).getQuestionIGL());
        System.out.println(questionsIGL.get(questionsIGL.size() - 1).getIGLAnswer());
        //By pressing a button new question of the selected topic is generated
    }
    private StringBuilder IGLfieldContent = new StringBuilder("");

    public void IdealGasLawRegisterAnswerButton(ActionEvent actionEvent) {
        if (IGLStudentAnswerTextField.getText().isEmpty()) {
            //If its empty (There is no answer), it displays "You forgot your answer"
            System.out.println("You forgot to write your answer.");
        } else {

            questionsIGL.get(questionsIGL.size() - 1).setIGLStudentAnswer(Double.parseDouble(IGLStudentAnswerTextField.getText()));
            IGLfieldContent.append("Your answer to question " + questionsIGL.size() + " was " + questionsIGL.get(questionsIGL.size() - 1).isCorrect() + "\n");
            IGLfieldContent.append("You said " + questionsIGL.get(questionsIGL.size() - 1).getIGLStudentAnswer() + " and the answer is " + questionsIGL.get(questionsIGL.size() - 1).getIGLAnswer() + "\n");
            IGLstudentAnswersTextArea.setText(IGLfieldContent.toString());
            //I use a field content in order to store my clients answer.
            //Therefore each questions answer is displayed, as well as my clients answer and if it a wrong or right answer.
        }

    }





    public void GasDensityRegisterAnswerButton(ActionEvent actionEvent) {
        //if this text box is not empty therefore it won't register an answer, and the programme will remain the same until and answer is displayed.

        if(GDStudentAnswerTextField.getText().isEmpty()){
            //If its empty (There is no answer), it displays "You forgot your answer"
            System.out.println("You forgot to write your answer.");
        }else {

            questionsGD.get(questionsGD.size() - 1).setStudentAnswer(Double.parseDouble(GDStudentAnswerTextField.getText()));
            GDfieldContent.append("Your answer to question " + questionsGD.size() + " was " + questionsGD.get(questionsGD.size() - 1).isCorrect()+"\n");
            GDfieldContent.append("You said " + questionsGD.get(questionsGD.size() - 1).getStudentAnswer() + " and the answer is " + questionsGD.get(questionsGD.size() - 1).getAnswer()+"\n");
            GDstudentAnswersTextArea.setText(GDfieldContent.toString());

            //I use a field content in order to store my clients answer.
            //Therefore each questions answer is displayed, as well as my clients answer and if it

        }

    }

    public void GasDensityNewQuestion(ActionEvent actionEvent) {
        //if the student answer text box is not empty. save the answer and continue with the next question.
        //you also want to clear the text box when you save the answer.
        questionsGD.add(new QuestionGD());
        //
        GasDensityQuestion.setText(questionsGD.get(questionsGD.size()-1).getQuestionGD());
        System.out.println(questionsGD.get(questionsGD.size() - 1).getAnswer());
        //By pressing a button new question of the selected topic is generated
    }

    private StringBuilder GDfieldContent = new StringBuilder("");

    }


