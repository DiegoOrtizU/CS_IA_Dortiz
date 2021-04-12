package sample;

import java.util.Random;
import java.util.Scanner;

public class QuestionIdealGasLaw {


    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int sum = 0;


        // Random number generating

        Random generator = new Random();

        int Pressure = generator.nextInt(120) + 30;
        int Moles = generator.nextInt(25);
        int Volume = generator.nextInt(80)+15;

        System.out.println("At a pressure of " + Pressure +  "atm, " + Moles + " Moles of an unknown compound are submerged in " + Volume + "L of water, what is the temperature of the room?");

        double answer=(Pressure * Volume)/(Moles * 8.31);
        double roundanswer= (double) Math.round(answer*100)/100;
        answer = roundanswer;
        System.out.println(answer + "K");


        }


    }

