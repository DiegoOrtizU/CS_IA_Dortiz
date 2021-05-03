package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.util.Random;
import java.util.Scanner;

public class Controller {
@FXML  private AnchorPane MAINPANEL;
@FXML  private AnchorPane IGLQUESTIONSPANEL;
@FXML  private AnchorPane GDQUESTIONSPANEL;
@FXML  private AnchorPane IGLINFORMATIONPANEL;
@FXML  private AnchorPane GDINFORMATIONPANEL;
@FXML  private Label IGLQUESTION;
@FXML  private Button IGLNEWQUESTIONBTN;
@FXML  private Label GDQUESTION;
@FXML  private Button GDNEWQUESTIONBTN;



    public void QUESTIONSIGLNXTWNDW(ActionEvent actionEvent) {
        MAINPANEL.setVisible(false);
        IGLQUESTIONSPANEL.setVisible(true);
    }


    public void INFORMATIONGDNXTWNDW(ActionEvent actionEvent) {
        MAINPANEL.setVisible(false);
        GDINFORMATIONPANEL.setVisible(true);
    }

    public void INFORMATIONIGLNXTWNDW(ActionEvent actionEvent) {
        MAINPANEL.setVisible(false);
        IGLINFORMATIONPANEL.setVisible(true);
    }

    public void QUESTIONSGDNXTWNDW(ActionEvent actionEvent) {
        MAINPANEL.setVisible(false);
        GDQUESTIONSPANEL.setVisible(true);
    }


    public void QIGLMAINWINDOWBTN(ActionEvent actionEvent) {
        MAINPANEL.setVisible(true);
        IGLQUESTIONSPANEL.setVisible(false);
    }


    public void QGDMAINWINDOWBTN(ActionEvent actionEvent) {
        MAINPANEL.setVisible(true);
        GDQUESTIONSPANEL.setVisible(false);
    }

    public void INFIGLMAINWINDOWBTN(ActionEvent actionEvent) {
        MAINPANEL.setVisible(true);
        IGLINFORMATIONPANEL.setVisible(false);
    }

    public void INFGDMAINWINDOWBTN(ActionEvent actionEvent) {
        MAINPANEL.setVisible(true);
        GDINFORMATIONPANEL.setVisible(false);
    }



    public void IGLNEWQUESTION(){
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

        IGLQUESTION.setText("At a pressure of " + Pressure + "atm, " + Moles + " Moles of an unknown compound are submerged in " + Volume + "L of water, what is the temperature of the room?");

    }




    public void IGLREGISTERANSWERBTN(ActionEvent actionEvent) {
    }

    public void GDNEWQUESTION(){
        Random generator = new Random();
        Scanner keyboard = new Scanner(System.in);
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

        GDQUESTION.setText("Determine the gas density of a gas at " + Temperature + "K at a pressure of " + Pressure + "atm and with a molar mass of " + MolarMass + "g/mol?");
    }
}
