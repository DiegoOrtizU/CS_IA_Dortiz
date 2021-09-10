package sample;

import java.util.Random;
import java.util.Scanner;

public class QuestionIGL {
    Random generator = new Random();
//Random generator for each value in the new question

    double Pressure = (generator.nextDouble() * 120) + 30;
    double roundPressure = (double) Math.round(Pressure * 100) / 100;
//Random generated value of Pressure and its parameters

    double Moles = (generator.nextDouble() * 25);
    double roundMoles = (double) Math.round(Moles * 100) / 100;
    //Random generated value of Moles and its parameters

    double Volume = (generator.nextDouble() * 80) + 15;
    double roundVolume = (double) Math.round(Volume * 100) / 100;
//Random generated value of Volume and its parameters

    String question = "At a pressure of " + Pressure + "atm, " + Moles + " Moles of an unknown compound are submerged in " + Volume + "L of water, what is the temperature of the room?";
//Wording of the question for the client to understand, as well it includes the newly generated values.


    public double getIGLAnswer() {
        return IGLanswer;
    }
    double IGLanswer = (Pressure * Volume) / (Moles * 8.31); //the calculated number.
    double IGLstudentAnswer;
//Formula for the programme to calculate the correct answer for each question.


    boolean correct = false;

    public QuestionIGL() {
        Pressure = roundPressure;
        Moles = roundMoles;
        Volume = roundVolume;
        //Values inside the Ideal Gas Laws questions
    }

    public double getIGLStudentAnswer() {
        return IGLstudentAnswer;
    }

    public void setIGLStudentAnswer(double IGLstudentAnswer) {
        this.IGLstudentAnswer = IGLstudentAnswer;
        if(IGLstudentAnswer == IGLanswer){
            correct = true;
        }
        //Detect if the clients answer is correct or wrong. Therefore if its is true or false.
    }

    public String getQuestionIGL() {
        return question;
    }

    public boolean isCorrect() {
        return correct;
    }
//Get each question and return the correct answer.
}






