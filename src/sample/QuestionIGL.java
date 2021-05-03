package sample;

import java.util.Random;
import java.util.Scanner;

public class QuestionIGL {


    public static void main(String[] args) {


        // Random number generating

        Random generator = new Random();
        Scanner keyboard = new Scanner(System.in);
        double answer;


        double Pressure = (generator.nextDouble() * 120) + 30;
        double Moles = (generator.nextDouble() * 25);
        double Volume = (generator.nextDouble() * 80) + 15;

        double roundPressure = (double) Math.round(Pressure * 100) / 100;
        Pressure = roundPressure;

        double roundMoles = (double) Math.round(Moles * 100) / 100;
        Moles = roundMoles;

        double roundVolume = (double) Math.round(Volume * 100) / 100;
        Volume = roundVolume;

        System.out.println("At a pressure of " + Pressure + "atm, " + Moles + " Moles of an unknown compound are submerged in " + Volume + "L of water, what is the temperature of the room?");




    }

}






