import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
public class Main {

    public static void main(String[] args) {
/*
       Task 1
        Queue<Integer> myQueue = new LinkedList<>();
        myQueue.add(17);
        myQueue.add(14);
        myQueue.add(9);

        int currValue;

        int minimumValue;

        minimumValue = myQueue.peek();

        while (myQueue.size() > 0) {
            currValue = myQueue.peek();
            myQueue.remove();

            if (minimumValue > currValue) {
                minimumValue = currValue;
            }
        }

        System.out.println(minimumValue);
        }
    }

Task 2
        Stack myStack = new Stack();

        Scanner in = new Scanner(System.in);

        String inputString = in.nextLine();

        String reverseString = "";

        Character tempHold;

        for (int i = 0; i < inputString.length(); ++i) {
            reverseString += inputString.charAt(inputString.length()-1-i);
        }

        Stack<Character> myStack1 = new Stack();

        Stack<Character> myStack2 = new Stack();

        for (int i = 0; i < inputString.length(); ++i) {
            myStack1.push(inputString.charAt(i));
            myStack2.push(reverseString.charAt(i));
        }

        int matchCount = 0;

        int stackSize = myStack1.size();

        while (myStack1.size() > 0) {
            if (myStack1.peek() == myStack2.peek() ) {
                matchCount++;
            }
            myStack1.pop();
            myStack2.pop();
        }

        if (matchCount == stackSize) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}
*/

/*
Task 3
        Scanner in = new Scanner(System.in);

        String inputString = in.nextLine();

        int openPar = 0;

        int closedPar = 0;

        for (int i = 0; i < inputString.length(); ++i) {
            if (inputString.charAt(i) == '(') {
                openPar++;
            }
            if (inputString.charAt(i) == ')') {
                closedPar++;
            }
        }

        if (openPar == closedPar) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
        */

    }
}

