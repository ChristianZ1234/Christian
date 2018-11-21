import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static int[] addValue(int[] array, int num) {
        int[] temp = new int[array.length+1];
        for(int i = 0; i <array.length;i++){
            temp[i] = array[i];
        }
        temp[array.length] = num;
        System.out.println(Arrays.toString(temp));
        return temp;
    }
    public static void main(String[] args) {
        int[] intarray = new int[5];
        for (int i = 0; i < intarray.length; i++) {
            intarray[i] = i + 1;
        }
        System.out.println(Arrays.toString(intarray));
        addValue(intarray, 6);
        poppedValue(intarray);
        insertValue(intarray);

    }
    public static int[] poppedValue(int[] array) {
        int[] temp = new int[array.length-1];
        for(int i = 0; i <temp.length;i++){
            temp[i] = array[i];
        }
        System.out.println(Arrays.toString(temp));
        return temp;
    }
    public static int[] insertValue(int[] array) {
        int[] temp = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            temp[i] = array[i];
        }
        temp[array.length - 0] = 8;
        System.out.println(Arrays.toString(temp));
        return temp;
    }



}
