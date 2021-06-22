package sample;

import java.util.Random;
import java.util.Scanner;

public class QuestionIGL {
    Random generator = new Random();

    double Pressure = (generator.nextDouble() * 120) + 30;
    double roundPressure = (double) Math.round(Pressure * 100) / 100;


    double Moles = (generator.nextDouble() * 25);
    double roundMoles = (double) Math.round(Moles * 100) / 100;

    double Volume = (generator.nextDouble() * 80) + 15;
    double roundVolume = (double) Math.round(Volume * 100) / 100;


    String question = "At a pressure of " + Pressure + "atm, " + Moles + " Moles of an unknown compound are submerged in " + Volume + "L of water, what is the temperature of the room?";

    public double getIGLAnswer() {
        return IGLanswer;
    }
    double IGLanswer = (Pressure * Volume) / (Moles * 8.31); //the calculated number.
    double IGLstudentAnswer;



    boolean correct = false;

    public QuestionIGL() {
        Pressure = roundPressure;
        Moles = roundMoles;
        Volume = roundVolume;
    }

    public double getIGLStudentAnswer() {
        return IGLstudentAnswer;
    }

    public void setIGLStudentAnswer(double IGLstudentAnswer) {
        this.IGLstudentAnswer = IGLstudentAnswer;
        if(IGLstudentAnswer == IGLanswer){
            correct = true;
        }
    }

    public String getQuestionIGL() {
        return question;
    }

    public boolean isCorrect() {
        return correct;
    }

}






