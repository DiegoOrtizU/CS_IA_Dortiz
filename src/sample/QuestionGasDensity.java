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
        }
        else{
            System.out.println(" Sorry, the correct answer is : " + answer + "Kg/m3");
        }


    }
}










