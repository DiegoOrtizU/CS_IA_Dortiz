package sample;

import java.util.Random;
import java.util.Scanner;

public class QuestionGD {
    Random generator = new Random();
    //Random generator for each value in the new question
    double Temperature = (generator.nextDouble()*350)+273;

    double roundTemperature= (double) Math.round(Temperature*100)/100;
    //Random generated value of Temperature and its parameters

    double Pressure = (generator.nextDouble()*120)+30;
    double roundPressure= (double) Math.round(Pressure*100)/100;
    //Random generated value of Pressure and its parameters

    double MolarMass = (generator.nextDouble()*150)+15;
    double roundMolarMass= (double) Math.round(MolarMass*100)/100;
    //Random generated value of MolarMass and its parameters

    String question = "Determine the gas density of a gas at " + Temperature + "K at a pressure of " + Pressure + "atm and with a molar mass of " + MolarMass + "g/mol?";
    //Wording of the question for the client to understand, as well it includes the newly generated values
    public double getAnswer() {
        return answer;
    }

    double answer = (MolarMass * Pressure)/(8.31 * Temperature); //the calculated number.
    double studentAnswer;
    //Formula for the programme to calculate the correct answer for each question.
    boolean correct = false;

    public QuestionGD() {
        Pressure = roundPressure;
        MolarMass= roundMolarMass;
        Temperature = roundTemperature;
        //Values inside the Gas Density questions
    }

    public double getStudentAnswer() {
        return studentAnswer;
    }

    public void setStudentAnswer(double studentAnswer) {
        this.studentAnswer = studentAnswer;
        if(studentAnswer == answer){
            correct = true;
        }
        //Detect if the clients answer is correct or wrong. Therefore if its is true or false.
    }

    public String getQuestionGD() {
        return question;
    }

    public boolean isCorrect() {
        return correct;
        //Get each question and return the correct answer.
    }

}

