/*
Name: Atul Chandra Nath
Roll: 12070103
Batch: 22nd
 */
public class DFA {

    //Executed at the begin of execution
    //Showing Program name
    //with input symbols
    static {
        System.out.println("Program name: A DFA that start with a and end with b");
        System.out.println("Input Symbol: a, b");
    }

    //Main Method
    public static void main(String[] args) throws InvalidInputException {
        //declare Charcter array, used for checking valid input symbols
        char[] Symbol = {'a', 'b'};

        // Creating object op of DFAOperation
        DFAOperation op = new DFAOperation();

        //taking input from user
        op.takeInput();

        // checking the given String is correct or Not
        boolean correct = op.isCorrectInput(Symbol);

        // If input contains any invalid symbol
        //JVM will throw an User Defined Exception name as InvalidInputException
        if (!correct) {
            throw new InvalidInputException("Please Try to Enter Correct Input As Given");

        }

        boolean accepted = op.isAccepted();

        if (accepted) {
            System.out.println("You Input String is accepted");
        } else {
            System.out.println("Sorry, You Input String can not be accepted");
        }

    }
}
