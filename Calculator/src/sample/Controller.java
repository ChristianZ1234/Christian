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
    int button0;
    button0 = 0;
    }

    public void button1(ActionEvent actionEvent) { textField.setText(textField.getText() + "1");
    int button1;
    button1 = 1;
    }

    public void button2(ActionEvent actionEvent) { textField.setText(textField.getText() + "2");
    int button2;
    button2 = 2;
    }

    public void button3(ActionEvent actionEvent) { textField.setText(textField.getText() + "3");
    int button3;
    button3 = 3;
    }

    public void button4(ActionEvent actionEvent) { textField.setText(textField.getText() + "4");
    int button4 = 4;
    numbers.add(button4);
    }

    public void button5(ActionEvent actionEvent) { textField.setText(textField.getText() + "5");
    int button5;
    button5 = 5;
    }

    public void button6(ActionEvent actionEvent) { textField.setText(textField.getText() + "6");
    int button6;
    button6 = 6;
    }

    public void button7(ActionEvent actionEvent) { textField.setText(textField.getText() + "7");
    int button7;
    button7 = 7;
    }

    public void button8(ActionEvent actionEvent) { textField.setText(textField.getText() + "8");
    int button8;
    button8 = 8;
    }

    public void button9(ActionEvent actionEvent) { textField.setText(textField.getText() + "9");
    int button9;
    button9 = 9;
    }

    public void buttonAdd(ActionEvent actionEvent) { textField.setText(textField.getText() + "+");

    }

    public void buttonSubtract(ActionEvent actionEvent) { textField.setText(textField.getText() + "-");
    }

    public void buttonMultiply(ActionEvent actionEvent) { textField.setText(textField.getText() + "*");
    }

    public void buttonClear(ActionEvent actionEvent) {


    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        ArrayList<String> operators = new ArrayList<String>();
        numbers.add(4);
        operators.add("+");
        numbers.add(4);


        int calculations;
        calculations = numbers.get(0);
        for (int i = 1; i<numbers.size(); i++){
            if(operators.get(i-1).equals("+")){
                calculations += numbers.get (i);
            }
            System.out.println(calculations);

        }
    }

    public void buttonEqual(ActionEvent actionEvent) {
        String numbers = textField.getText();
        System.out.println(numbers);

    }

}
