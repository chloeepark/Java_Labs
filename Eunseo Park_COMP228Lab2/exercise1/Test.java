package exercise1;

import javax.swing.*;
import java.util.Random;

public class Test {
    private final String[] questions = {
            "Which keyword is used to create a new instance of a class in Java?",
            "Which of the following is a primitive data type in Java?",
            "Which company developed Java?",
            "What is the extension of Java bytecode files?",
            "Which of the following is not a Java feature?"
    };
    
    private final String[][] options = {
            {"this", "new", "instanceof", "super"},
            {"String", "Integer", "Boolean", "int"},
            {"Sun Microsystems", "Oracle", "Microsoft", "Google"},
            {".class", ".java", ".exe", ".jar"},
            {"Object-oriented", "Platform independent", "Use of pointers", "Robust"}
    };
    
    private final int[] correctAnswers = {1, 3, 0, 0, 2};
    private int correctCount = 0;
    private int incorrectCount = 0;
    
    private final Random random = new Random();
    
    public void startTest() {
        for (int i = 0; i < questions.length; i++) {
            inputAnswer(i);
        }
        showResult();
    }
    
    private void inputAnswer(int questionIndex) {
        String question = questions[questionIndex];
        String[] choices = options[questionIndex];
        String answer = (String) JOptionPane.showInputDialog(
                null,
                question,
                "Quiz",
                JOptionPane.QUESTION_MESSAGE,
                null,
                choices,
                choices[0]
        );
        checkAnswer(questionIndex, answer);
    }
    
    private void checkAnswer(int questionIndex, String answer) {
        int correctAnswerIndex = correctAnswers[questionIndex];
        String correctAnswer = options[questionIndex][correctAnswerIndex];
        
        if (answer.equals(correctAnswer)) {
            correctCount++;
            generateMessage(true);
        } else {
            incorrectCount++;
            generateMessage(false, correctAnswer);
        }
    }
    
    private void generateMessage(boolean isCorrect) {
        String[] correctMessages = {"Excellent!", "Good!", "Keep up the good work!", "Nice work!"};
        String message = correctMessages[random.nextInt(correctMessages.length)];
        JOptionPane.showMessageDialog(null, message);
    }
    
    private void generateMessage(boolean isCorrect, String correctAnswer) {
        String[] incorrectMessages = {
                "No. Please try again",
                "Wrong. Try once more",
                "Don't give up!",
                "No. Keep trying.."
        };
        String message = incorrectMessages[random.nextInt(incorrectMessages.length)] + " The correct answer is: " + correctAnswer;
        JOptionPane.showMessageDialog(null, message);
    }
    
    private void showResult() {
        int totalQuestions = correctCount + incorrectCount;
        double percentage = (correctCount * 100.0) / totalQuestions;
        String resultMessage = String.format(
                "Test Completed!\nCorrect Answers: %d\nIncorrect Answers: %d\nPercentage: %.2f%%",
                correctCount,
                incorrectCount,
                percentage
        );
        JOptionPane.showMessageDialog(null, resultMessage);
    }
    
    public static void main(String[] args) {
        Test test = new Test();
        test.startTest();
    }
}
