package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Controller {
    ArrayList<Number> numbers = new ArrayList<Number>();
    public Button btnEqual;
    public Label textField;


    public void button0(ActionEvent actionEvent) { textField.setText(textField.getText() + "0");
    }

    public void button1(ActionEvent actionEvent) { textField.setText(textField.getText() + "1");
    }

    public void button2(ActionEvent actionEvent) { textField.setText(textField.getText() + "2");
    }

    public void button3(ActionEvent actionEvent) { textField.setText(textField.getText() + "3");
    }

    public void button4(ActionEvent actionEvent) { textField.setText(textField.getText() + "4");
    }

    public void button5(ActionEvent actionEvent) { textField.setText(textField.getText() + "5");
    }

    public void button6(ActionEvent actionEvent) { textField.setText(textField.getText() + "6");
    }

    public void button7(ActionEvent actionEvent) { textField.setText(textField.getText() + "7");
    }

    public void button8(ActionEvent actionEvent) { textField.setText(textField.getText() + "8");
    }

    public void button9(ActionEvent actionEvent) { textField.setText(textField.getText() + "9");
    }

    public void buttonAdd(ActionEvent actionEvent) { textField.setText(textField.getText() + "+");
    int num = Integer(textAdd.getText)
    }

    public void buttonSubtract(ActionEvent actionEvent) { textField.setText(textField.getText() + "-");
    }

    public void buttonMultiply(ActionEvent actionEvent) { textField.setText(textField.getText() + "*");
    }

    public void buttonClear(ActionEvent actionEvent) {


    }

    public void buttonEqual(ActionEvent actionEvent) {
        String numbers = textField.getText();
        System.out.println(numbers);
    }
}
