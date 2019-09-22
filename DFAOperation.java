
import java.util.Arrays;
import java.util.Scanner;

class DFAOperation {

    private static Scanner in;
    private String inputString;

    public DFAOperation() {
        in = new Scanner(System.in);
    }

    public void takeInput() {
        System.out.print("Please Enter an input: ");
        inputString = in.next();
    }

    public boolean isCorrectInput(char[] sym) {
        for (int i = 0; i < inputString.length(); i++) {
            if (Arrays.binarySearch(sym, inputString.charAt(i)) < 0) {
                return false;
            }
        }
        return true;
    }

    public boolean isAccepted() {
        int state = 0;
        if (inputString.length() < 0 || inputString.charAt(0) == 'b') {
            return false;
        }
        for (int i = 0; i < inputString.length(); i++) {
            if (state == 0 && inputString.charAt(i) == 'b') {
                state = 1;
            } else if (state == 1 && inputString.charAt(i) == 'a') {
                state = 0;
            } else if (state == 1 && inputString.charAt(i) == 'a') {
                state = 0;
            } else if (state == 0 && inputString.charAt(i) == 'a') {
                state = 0;
            }
        }
        return state == 1;
    }
}
