import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// Task 1. Max random number with max digit
        int a = 0;
        int maxNumber = 0;
        while (a<100)
        a = new java.util.Random().nextInt(999);

        String s = Integer.toString(a);
        int [] digitArray = new int [s.length()];

        for (int i = 0; i<s.length(); i++)
        {
            digitArray [i] = Integer.parseInt(String.valueOf(s.charAt(i)));
            System.out.println(digitArray[i]);
        }

        for (int number
                : digitArray) {
            if (number>maxNumber)
            maxNumber=number;
        }
        System.out.println("The random number is "+a);
        System.out.println("Max digit from this number is "+maxNumber);
    }
}
