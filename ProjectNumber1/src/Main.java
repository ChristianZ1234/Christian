import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    //Code your solution to problem number one here
    static int problemOne(String s){
        int answer = 0;
        ArrayList characters = new ArrayList();
        for (int i = 0; i<s.length();){
            char x = s.charAt(i);
            characters.add(x);
            if(characters.get(i).equals('a') || characters.get(i).equals('e') || characters.get(i).equals('i') || characters.get(i).equals('o') || characters.get(i).equals('u')) {
                answer++;
            }
            i++;
        }
        return answer;
    }
    //Code you problem number two here
    static int problemTwo(String s){
        int answer = 0;
        ArrayList characters = new ArrayList();
        for (int i = 0; i<s.length();){
            char x = s.charAt(i);
            characters.add(x);
            i++;
        }
        for(int i = 0; i<= (s.length() - 3 );){
            if((characters.get(i).equals('b')) && (characters.get(i + 1).equals('o')) && (characters.get(i + 2).equals('b'))){
                answer++;
            }
            i++;
        }
        return answer;
    }
    //Code your solution to problem number 3 here
    static String problemThree(String s){
        String substrings = "abcdabc";
        ArrayList numbers = new ArrayList();
        for(int i = 0; i<=s.length();i++){
            char x = s.charAt(i);
            numbers.add(x);
            System.out.println('a' < 'b');
        
        }





        return s;
    }
    public static void main(String[] args) {
        /*
        Set s to a string and run your method using s as the parameter
        Run your method in a println statement to determine what the output was
        Once you think you have it working try running the tests.
        The tests will put your method through several different Strings to test
        all possible cases.  If you have 100% success then there is no bugs in your methods.
         */
        String s = "string";

    }
}
