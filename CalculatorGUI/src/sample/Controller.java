package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Controller {
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    ArrayList<String> operators = new ArrayList<String>();
    public TextField textField;
    public Button btnEqual;

    public boolean clear=true;


    public void button0(ActionEvent actionEvent) { textField.setText(textField.getText() + "0");
        int button0 = 0;

    }

    public void button1(ActionEvent actionEvent) { textField.setText(textField.getText() + "1");
        int button1 = 1;
    }

    public void button2(ActionEvent actionEvent) { textField.setText(textField.getText() + "2");
        int button2 = 2;

    }

    public void button3(ActionEvent actionEvent) { textField.setText(textField.getText() + "3");
        int button3 = 3;

    }

    public void button4(ActionEvent actionEvent) { textField.setText(textField.getText() + "4");
        int button4 = 4;

    }

    public void button5(ActionEvent actionEvent) { textField.setText(textField.getText() + "5");
        int button5 = 5;
    }

    public void button6(ActionEvent actionEvent) { textField.setText(textField.getText() + "6");
        int button6 = 6;

    }

    public void button7(ActionEvent actionEvent) { textField.setText(textField.getText() + "7");
        int button7 = 7;

    }

    public void button8(ActionEvent actionEvent) { textField.setText(textField.getText() + "8");
        int button8 = 8;

    }

    public void button9(ActionEvent actionEvent) { textField.setText(textField.getText() + "9");
        int button9 = 9;

    }

    public void buttonAdd(ActionEvent actionEvent) { textField.setText(textField.getText() + "+");
        operators.add("+");
    }

    public void buttonSubtract(ActionEvent actionEvent) { textField.setText(textField.getText() + "-");
        operators.add("-");
    }

    public void buttonMultiply(ActionEvent actionEvent) { textField.setText(textField.getText() + "*");
        operators.add("*");
    }

    public void buttonClear(ActionEvent actionEvent) {
        textField.setText("");
        numbers.clear();
        operators.clear();
        clear = false;

    }

    public void buttonEqual(ActionEvent actionEvent) {
        String temp = "";
        for (int i = 0; i<textField.getLength(); i++){
            if (Character.isDigit(textField.getText().charAt(i))){
                temp += textField.getText().charAt(i);
            }else{
                numbers.add(Integer.parseInt(temp));
                temp = "";
            }
        }
        numbers.add(Integer.parseInt(temp));

        int calculations = numbers.get(0);

        for (int i = 0; i<operators.size(); i++){
            //plus
            if(operators.get(i).equals("+")){
                calculations += numbers.get(i+1);
            }
            //subtract
            if(operators.get(i).equals("-")){
                calculations -= numbers.get(i+1);
            }
            //multiply
            if(operators.get(i).equals("*")){
                calculations *= numbers.get(i+1);
            }
            //clear
            if(clear==false){ }
            textField.setText(String.valueOf(calculations));
        }
    }
}
