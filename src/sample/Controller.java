package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class Controller {
@FXML  private AnchorPane MAINPANEL;
@FXML  private AnchorPane IGLQUESTIONSPANEL;
@FXML  private AnchorPane GDQUESTIONSPANEL;
@FXML  private AnchorPane IGLINFORMATIONPANEL;
@FXML  private AnchorPane GDINFORMATIONPANEL;
@FXML  private Label IGLQUESTION;
@FXML  private Button IGLNEWQUESTIONBTN;



    public void QUESTIONSIGLNXTWNDW(ActionEvent actionEvent) {
        MAINPANEL.setVisible(false);
        IGLQUESTIONSPANEL.setVisible(true);
    }


    public void INFORMATIONGDNXTWNDW(ActionEvent actionEvent) {
        MAINPANEL.setVisible(false);
        IGLINFORMATIONPANEL.setVisible(true);
    }

    public void INFORMATIONIGLNXTWNDW(ActionEvent actionEvent) {
        MAINPANEL.setVisible(false);
        GDINFORMATIONPANEL.setVisible(true);
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
        IGLQUESTION.setText("Hello");
    }

    public void IGLREGISTERANSWERBTN(ActionEvent actionEvent) {
    }
}
