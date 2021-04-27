import java.util.Random;
import java.util.Scanner;

public class QuestionGasDensity {


    public static void main(String [] args){



        // Random number generating

        Random generator = new Random();
        Scanner keyboard = new Scanner(System.in);
        double sum = 0;
        double clientAnswer ;
        double answer;


        double Temperature = (generator.nextDouble()*350)+273;
        double Pressure = (generator.nextDouble()*120)+30;
        double MolarMass = (generator.nextDouble()*150)+15;



        double roundTemperature= (double) Math.round(Temperature*100)/100;
        Temperature = roundTemperature;

        double roundPressure= (double) Math.round(Pressure*100)/100;
        Pressure = roundPressure;

        double roundMolarMass= (double) Math.round(MolarMass*100)/100;
        MolarMass = roundMolarMass;

        System.out.println("Determine the gas density of a gas at " + Temperature + "K at a pressure of " + Pressure + "atm and with a molar mass of " + MolarMass + "g/mol?");
        clientAnswer = new Scanner(System.in).nextDouble();


        answer=(MolarMass * Pressure)/(8.31 * Temperature);
        double roundanswer= (double) Math.round(answer*100)/100;
        answer = roundanswer;
        if(clientAnswer == answer){
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
                                System.out.println("First you need to identify the variable you are looking for which is the Gas Density");

                                System.out.println("Then you will need to identify the values of the variables you are given");
                                System.out.println("P="+ Pressure + "atm");
                                System.out.println("M="+ MolarMass + "g/mol");
                                System.out.println("T="+ Temperature + "K");
                                System.out.println("R=8.31JK−1⋅mol−1");
                                System.out.println();
                                System.out.println("Now you need to replace the variables inside the formula and round it to 2 decimal places");
                                System.out.println(MolarMass + "*" + Pressure + "/8.31*" + Temperature);
                                System.out.println("This will give you the answer which is " + answer + "Kg/m3");
                                break;

                            case "A":
                                System.out.println("The answer is " + answer + "K");
                        }

                    }

                    break;

                case "G":
                    System.out.println("I will guide you towards finding the answer");
                    System.out.println();
                    System.out.println("First you need to identify the variable you are looking for which is the Gas Density");

                    System.out.println("Then you will need to identify the values of the variables you are given");
                    System.out.println("P="+ Pressure + "atm");
                    System.out.println("M="+ MolarMass + "g/mol");
                    System.out.println("T="+ Temperature + "K");
                    System.out.println("R=8.31JK−1⋅mol−1");
                    System.out.println();
                    System.out.println("Now you need to replace the variables inside the formula and round it to 2 decimal places");
                    System.out.println(MolarMass + "*" + Pressure + "/8.31*" + Temperature);
                    System.out.println("This will give you the answer which is " + answer + "Kg/m3");

                    break;

                case "A":
                    System.out.println("The answer is " + answer + "Kg/m3");
            }

        }

    }

}










