package exercise2;

import javax.swing.*;
import java.util.Random;

public class Lotto {
    private int[] numbers = new int[3];
    private Random random = new Random();

    public Lotto() {
        generateNumbers();
    }

    private void generateNumbers() {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(9) + 1; 
        }
    }

    public int[] getNumbers() {
        return numbers;
    }

    public int getSum() {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static void main(String[] args) {
        int userNumber = 0; 
        boolean validInput = false;
        while (!validInput) {
            try {
                userNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter a number between 3 and 27:"));
                if (userNumber >= 3 && userNumber <= 27) {
                    validInput = true;
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter a number between 3 and 27.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a number.");
            }
        }
        
        boolean userWon = false;
    
        for (int i = 0; i < 5; i++) {
            Lotto lotto = new Lotto();
            int sum = lotto.getSum();
    
            JOptionPane.showMessageDialog(null, "Lotto numbers: " + lotto.getNumbers()[0] + ", " + lotto.getNumbers()[1] + ", " + lotto.getNumbers()[2] + "\nSum: " + sum);
    
            if (userNumber == sum) {
                JOptionPane.showMessageDialog(null, "You won!");
                userWon = true;
                break;
            }
        }
    
        if (!userWon) {
            JOptionPane.showMessageDialog(null, "Computer wins. Better luck next time!");
        }
    }
}    