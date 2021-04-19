package sample;

import java.util.Random;
import java.util.Scanner;

public class QuestionIdealGasLaw {


    public static void main(String [] args){



        // Random number generating

        Random generator = new Random();
        Scanner keyboard = new Scanner(System.in);
        double sum = 0;
        double clientAnswer ;
        double answer;


        double Pressure = (generator.nextDouble()*120)+30;

        int Pressure2 = generator.nextInt(120) + 30;
        int Moles = generator.nextInt(25);
        int Volume = generator.nextInt(80)+15;

        System.out.println("At a pressure of " + Pressure +  "atm, " + Moles + " Moles of an unknown compound are submerged in " + Volume + "L of water, what is the temperature of the room?");
        clientAnswer = new Scanner(System.in).nextDouble();


        answer=(Pressure * Volume)/(Moles * 8.31);
        double roundanswer= (double) Math.round(answer*100)/100;
        answer = roundanswer;
        if(clientAnswer == answer){
            System.out.println("You are correct!");
        }
        else{
            System.out.println(" Sorry, the correct answer is : " + answer + "K");
        }


    }
}









