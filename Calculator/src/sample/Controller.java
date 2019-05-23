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
    public Button btnEqual;
    public Label textField;
    public boolean clear=true;


    public void button0(ActionEvent actionEvent) { textField.setText(textField.getText() + "0");
        int button0 = 0;
        numbers.add(0);


    }

    public void button1(ActionEvent actionEvent) { textField.setText(textField.getText() + "1");
        int button1 = 1;
        numbers.add(1);
    }

    public void button2(ActionEvent actionEvent) { textField.setText(textField.getText() + "2");
        int button2 = 2;
        numbers.add(2);
    }

    public void button3(ActionEvent actionEvent) { textField.setText(textField.getText() + "3");
        int button3 = 3;
        numbers.add(3);
    }

    public void button4(ActionEvent actionEvent) { textField.setText(textField.getText() + "4");
        int button4 = 4;
        numbers.add(4);
    }

    public void button5(ActionEvent actionEvent) { textField.setText(textField.getText() + "5");
        int button5 = 5;
        numbers.add(5);
    }

    public void button6(ActionEvent actionEvent) { textField.setText(textField.getText() + "6");
        int button6 = 6;
        numbers.add(6);
    }

    public void button7(ActionEvent actionEvent) { textField.setText(textField.getText() + "7");
        int button7 = 7;
        numbers.add(7);
    }

    public void button8(ActionEvent actionEvent) { textField.setText(textField.getText() + "8");
        int button8 = 8;
        numbers.add(8);
    }

    public void button9(ActionEvent actionEvent) { textField.setText(textField.getText() + "9");
        int button9 = 9;
        numbers.add(9);
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
        clear=false;

    }

    public static void main(String[] args) {





    }

    public void buttonEqual(ActionEvent actionEvent) {

        int calculations;
        calculations = numbers.get(0);
        System.out.println(calculations); //first number in calculations array

        for (int i = 1; i<numbers.size(); i++){

            //plus
            if(operators.get(i-1).equals("+")){
                calculations += numbers.get(i);
            }
            //subtract
            if(operators.get(i-1).equals("-")){
                calculations -= numbers.get(i);
            }
            //multiply
            if(operators.get(i-1).equals("*")){
                calculations *= numbers.get(i);
            }
            //clear
            if(clear==false){
                calculations=0;
            }



        }
        textField.setText(new Integer(calculations).toString());
        System.out.println(calculations);

    }

}
