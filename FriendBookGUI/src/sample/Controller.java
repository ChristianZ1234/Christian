package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;


public class Controller {
    public ListView<Friend> showList;
    public TextField textName;
    public TextField textEmail;
    public TextField textSchool;
    public Label labelName;
    public Label labelSchool;
    public Label labelEmail;

    public void addFriend(ActionEvent actionEvent) {
        Friend temp = new Friend(textName.getText(), textEmail.getText(),textSchool.getText());
        showList.getItems().add(temp);
        textName.clear();
        textEmail.clear();
        textSchool.clear();

    }

    public void deleteFriend(ActionEvent actionEvent) {

        showList.getItems().remove(showList.getSelectionModel().getSelectedItem());
        labelName.setText("Name: ");
        labelEmail.setText("Email: ");
        labelSchool.setText("School: ");
    }
    public void setShowList(MouseEvent mouseEvent) {
        Friend temp;
        temp = showList.getSelectionModel().getSelectedItem();
        labelName.setText("Name:" + temp.getName());
        labelEmail.setText("Email: " + temp.getEmail());
        labelSchool.setText("School: " + temp.getSchool());
    }
}



