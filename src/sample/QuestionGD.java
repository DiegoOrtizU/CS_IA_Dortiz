package sample;

import java.util.Random;
import java.util.Scanner;

public class QuestionGD {
    Random generator = new Random();

    double Temperature = (generator.nextDouble()*350)+273;
    double roundTemperature= (double) Math.round(Temperature*100)/100;

    double Pressure = (generator.nextDouble()*120)+30;
    double roundPressure= (double) Math.round(Pressure*100)/100;

    double MolarMass = (generator.nextDouble()*150)+15;
    double roundMolarMass= (double) Math.round(MolarMass*100)/100;

    String question = "Determine the gas density of a gas at " + Temperature + "K at a pressure of " + Pressure + "atm and with a molar mass of " + MolarMass + "g/mol?";

    public double getAnswer() {
        return answer;
    }

    double answer = (MolarMass * Pressure)/(8.31 * Temperature); //the calculated number.
    double studentAnswer;

    boolean correct = false;

    public QuestionGD() {
        Pressure = roundPressure;
        MolarMass= roundMolarMass;
        Temperature = roundTemperature;
    }

    public double getStudentAnswer() {
        return studentAnswer;
    }

    public void setStudentAnswer(double studentAnswer) {
        this.studentAnswer = studentAnswer;
        if(studentAnswer == answer){
            correct = true;
        }
    }

    public String getQuestionGD() {
        return question;
    }

    public boolean isCorrect() {
        return correct;
    }

}

