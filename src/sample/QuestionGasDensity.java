package sample;

import java.util.Random;


public class QuestionGasDensity {


    public static void main(String [] args){


        // Random number generating

        Random generator = new Random();

        int Temperature = generator.nextInt(350) + 273;
        int Pressure = generator.nextInt(120) + 30;
        int MolarMass = generator.nextInt(150)+15;

        System.out.println("Determine the gas density of a gas at " + Temperature + "K at a pressure of " + Pressure + "atm and with a molar mass of " + MolarMass + "g/mol?");

        double answer=(MolarMass * Pressure)/(8.31 * Temperature);
        double roundanswer= (double) Math.round(answer*100)/100;
        answer = roundanswer;
        System.out.println(answer + "Kg/m3");


    }


}
