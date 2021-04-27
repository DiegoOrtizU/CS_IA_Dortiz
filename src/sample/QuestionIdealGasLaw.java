package sample;

import java.util.Random;
import java.util.Scanner;

public class QuestionIdealGasLaw {


    public static void main(String[] args) {


        // Random number generating

        Random generator = new Random();
        Scanner keyboard = new Scanner(System.in);
        double sum = 0;
        double clientAnswer;
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
        clientAnswer = new Scanner(System.in).nextDouble();


        answer = (Pressure * Volume) / (Moles * 8.31);
        double roundanswer = (double) Math.round(answer * 100) / 100;
        answer = roundanswer;
        if (clientAnswer == answer) {
            System.out.println("You are correct!");
        } else {
            java.util.Scanner sc = new java.util.Scanner(System.in);
            System.out.println("Looks like you haven't achieve the correct answer, how do you want to approach this question");
            System.out.println("H.- Hint");
            System.out.println("G.- Guide");
            System.out.println("A.- Answer");
            String Decision = sc.next();

            switch (Decision) {
                case "H":
                    System.out.println("Hint:");
                    System.out.println("Take in consideration that the answer needs to be rounded to 2 decimal places");
                    System.out.println("Now lets have a second look at the question");
                    System.out.println("Input the correct answer:");
                    clientAnswer = new Scanner(System.in).nextDouble();
                    if (clientAnswer == answer) {
                        System.out.println("You are correct!");
                    } else {
                        System.out.println("You have gotten the wrong answer");
                        System.out.println("Don't worry you can still approach the question different ways");
                        System.out.println("G.- Guide");
                        System.out.println("A.- Answer");
                        String HelpDecision = sc.next();

                        switch (HelpDecision) {
                            case "G":
                                System.out.println("I will guide you towards finding the answer");
                                System.out.println();
                                System.out.println("First you need to identify the variable you are looking for which is the Temperature");
                                System.out.println("Secondly you will need to rearrange the formula PV=nRT");
                                System.out.println("After rearranging it you will will end with the formula T=PV/nR");
                                System.out.println();
                                System.out.println("After rearranging the formula you will need to identify the values of the variables you are given");
                                System.out.println("P="+ Pressure + "atm");
                                System.out.println("n="+ Moles + "moles");
                                System.out.println("V="+ Volume + "L");
                                System.out.println("R=8.31JK−1⋅mol−1");
                                System.out.println();
                                System.out.println("Now you need to replace the variables inside the rearranged formula and round it to 2 decimal places");
                                System.out.println(+ Pressure + "*" + Volume + "/" + Moles + "*8.31");
                                System.out.println("This will give you the answer which is " + answer + "K");
                                break;

                            case "A":
                                System.out.println("The answer is " + answer + "K");
                        }

                    }

                        break;

                        case "G":
                            System.out.println("I will guide you towards finding the answer");
                            System.out.println();
                            System.out.println("First you need to identify the variable you are looking for which is the Temperature");
                            System.out.println("Secondly you will need to rearrange to formula PV=nRT");
                            System.out.println("After rearranging it you will will end with the formula T=PV/nR");
                            System.out.println();
                            System.out.println("After rearranging the formula you will need to identify the values of the variables you are given");
                            System.out.println("P="+ Pressure + "atm");
                            System.out.println("n="+ Moles + "moles");
                            System.out.println("V="+ Volume + "L");
                            System.out.println("R=8.31JK−1⋅mol−1");
                            System.out.println();
                            System.out.println("Now you need to replace the variables inside the rearranged formula and round it to 2 decimal places");
                            System.out.println(+ Pressure + "*" + Volume + "/" + Moles + "*8.31");
                            System.out.println("This will give you the answer which is " + answer + "K");

                            break;

                        case "A":
                            System.out.println("The answer is " + answer + "K");
                    }

        }

    }

}

















