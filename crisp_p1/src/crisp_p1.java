import java.util.Scanner;
import java.security.SecureRandom;

public class crisp_p1 {

    /*public static int quiz(int difficulty, int mathType) {
        SecureRandom rand = new SecureRandom();
        int number1 = rand.nextInt(10);
        int number2 = rand.nextInt(10);

        System.out.printf("How much is %d times %d?\n", number1, number2);

        return number1 * number2;
    }*/

    public static int division(int difficulty) {
        SecureRandom rand = new SecureRandom();
        Scanner scnr = new Scanner(System.in);

        float answer, correctAnswer;
        int number1, number2, rightOrWrong = 0;

        if (difficulty == 1)
        {
            number1 = rand.nextInt(10);
            number2 = rand.nextInt(10);

            System.out.printf("How much is %d divided by %d up to 8 decimal places?\n", number1, number2);
            answer = scnr.nextFloat();

            correctAnswer = (float)number1 / (float)number2;
            //System.out.println(correctAnswer);

            if (Float.compare(correctAnswer, answer) == 0)
                rightOrWrong = 1;
        }
        else if (difficulty == 2)
        {
            number1 = rand.nextInt(100);
            number2 = rand.nextInt(100);

            System.out.printf("How much is %d divided by %d up to 8 decimal places?\n", number1, number2);
            answer = scnr.nextFloat();

            correctAnswer = (float)number1 / (float)number2;
            System.out.println(correctAnswer);


            if (Float.compare(correctAnswer, answer) == 0)
                rightOrWrong = 1;
        }
        else if (difficulty == 3)
        {
            number1 = rand.nextInt(1000);
            number2 = rand.nextInt(1000);

            System.out.printf("How much is %d divided by %d up to 8 decimal places?\n", number1, number2);
            answer = scnr.nextFloat();

            correctAnswer = (float)number1 / (float)number2;

            if (Float.compare(correctAnswer, answer) == 0)
                rightOrWrong = 1;
        }
        else if (difficulty == 4)
        {
            number1 = rand.nextInt(10000);
            number2 = rand.nextInt(10000);

            System.out.printf("How much is %d divided by %d up to 8 decimal places?\n", number1, number2);
            answer = scnr.nextFloat();

            correctAnswer = (float)number1 / (float)number2;

            if (Float.compare(correctAnswer, answer) == 0)
                rightOrWrong = 1;
        }
        return rightOrWrong;
    }

    public static int subtraction(int difficulty) {
        SecureRandom rand = new SecureRandom();
        Scanner scnr = new Scanner(System.in);

        float answer, correctAnswer;
        int number1, number2, rightOrWrong = 0;

        if (difficulty == 1)
        {
            number1 = rand.nextInt(10);
            number2 = rand.nextInt(10);

            System.out.printf("How much is %d minus %d?\n", number1, number2);
            answer = scnr.nextFloat();

            correctAnswer = (float)number1 - (float)number2;

            if (Float.compare(correctAnswer, answer) == 0)
                rightOrWrong = 1;
        }
        else if (difficulty == 2)
        {
            number1 = rand.nextInt(100);
            number2 = rand.nextInt(100);

            System.out.printf("How much is %d minus %d?\n", number1, number2);
            answer = scnr.nextFloat();

            correctAnswer = (float)number1 - (float)number2;

            if (Float.compare(correctAnswer, answer) == 0)
                rightOrWrong = 1;
        }
        else if (difficulty == 3)
        {
            number1 = rand.nextInt(1000);
            number2 = rand.nextInt(1000);

            System.out.printf("How much is %d minus %d?\n", number1, number2);
            answer = scnr.nextFloat();

            correctAnswer = (float)number1 - (float)number2;

            if (Float.compare(correctAnswer, answer) == 0)
                rightOrWrong = 1;
        }
        else if (difficulty == 4)
        {
            number1 = rand.nextInt(10000);
            number2 = rand.nextInt(10000);

            System.out.printf("How much is %d minus %d?\n", number1, number2);
            answer = scnr.nextFloat();

            correctAnswer = (float)number1 - (float)number2;

            if (Float.compare(correctAnswer, answer) == 0)
                rightOrWrong = 1;
        }
        return rightOrWrong;
    }


    public static int multiplication(int difficulty) {
        SecureRandom rand = new SecureRandom();
        Scanner scnr = new Scanner(System.in);

        float answer, correctAnswer;
        int number1, number2, rightOrWrong = 0;

        if (difficulty == 1)
        {
            number1 = rand.nextInt(10);
            number2 = rand.nextInt(10);

            System.out.printf("How much is %d times %d?\n", number1, number2);
            answer = scnr.nextFloat();

            correctAnswer = (float)number1 * (float)number2;

            if (Float.compare(correctAnswer, answer) == 0)
                rightOrWrong = 1;
        }
        else if (difficulty == 2)
        {
            number1 = rand.nextInt(100);
            number2 = rand.nextInt(100);

            System.out.printf("How much is %d times %d?\n", number1, number2);
            answer = scnr.nextFloat();

            correctAnswer = (float)number1 * (float)number2;

            if (Float.compare(correctAnswer, answer) == 0)
                rightOrWrong = 1;
        }
        else if (difficulty == 3)
        {
            number1 = rand.nextInt(1000);
            number2 = rand.nextInt(1000);

            System.out.printf("How much is %d times %d?\n", number1, number2);
            answer = scnr.nextFloat();

            correctAnswer = (float)number1 * (float)number2;

            if (Float.compare(correctAnswer, answer) == 0)
                rightOrWrong = 1;
        }
        else if (difficulty == 4)
        {
            number1 = rand.nextInt(10000);
            number2 = rand.nextInt(10000);

            System.out.printf("How much is %d times %d?\n", number1, number2);
            answer = scnr.nextFloat();

            correctAnswer = (float)number1 * (float)number2;

            if (Float.compare(correctAnswer, answer) == 0)
                rightOrWrong = 1;
        }
        return rightOrWrong;
    }


    public static int addition(int difficulty) {
        SecureRandom rand = new SecureRandom();
        Scanner scnr = new Scanner(System.in);

        float answer, correctAnswer;
        int number1, number2, rightOrWrong = 0;

        if (difficulty == 1)
        {
            number1 = rand.nextInt(10);
            number2 = rand.nextInt(10);

            System.out.printf("How much is %d plus %d?\n", number1, number2);
            answer = scnr.nextFloat();

            correctAnswer = (float)number1 + (float)number2;

            if (Float.compare(correctAnswer, answer) == 0)
                rightOrWrong = 1;
        }
        else if (difficulty == 2)
        {
            number1 = rand.nextInt(100);
            number2 = rand.nextInt(100);

            System.out.printf("How much is %d plus %d?\n", number1, number2);
            answer = scnr.nextFloat();

            correctAnswer = (float)number1 + (float)number2;

            if (Float.compare(correctAnswer, answer) == 0)
                rightOrWrong = 1;
        }
        else if (difficulty == 3)
        {
            number1 = rand.nextInt(1000);
            number2 = rand.nextInt(1000);

            System.out.printf("How much is %d plus %d?\n", number1, number2);
            answer = scnr.nextFloat();

            correctAnswer = (float)number1 + (float)number2;

            if (Float.compare(correctAnswer, answer) == 0)
                rightOrWrong = 1;
        }
        else if (difficulty == 4)
        {
            number1 = rand.nextInt(10000);
            number2 = rand.nextInt(10000);

            System.out.printf("How much is %d plus %d?\n", number1, number2);
            answer = scnr.nextFloat();

            correctAnswer = (float)number1 + (float)number2;

            if (Float.compare(correctAnswer, answer) == 0)
                rightOrWrong = 1;
        }
        return rightOrWrong;
    }

    public static int quizNavigator(int difficulty, int mathType) {
        int rightOrWrong = 0;

        if (mathType == 1)
            rightOrWrong = addition(difficulty);
        else if (mathType == 2)
            rightOrWrong = multiplication(difficulty);
        else if (mathType == 3)
            rightOrWrong = subtraction(difficulty);
        else if (mathType == 4)
            rightOrWrong = division(difficulty);

        return rightOrWrong;
    }

    public static int quizHelper(int difficulty, int mathType) {
        SecureRandom rand = new SecureRandom();

        int rightOrWrong, randomAnswer, right = 0, wrong = 0;

        // Gives a random response after receiving a right or wrong answer
        for (int i = 0; i < 9; i++) {

            // If mathType is 5, this randomly generates the type of math problem
            if (mathType == 5)
                rightOrWrong = quizNavigator(difficulty, rand.nextInt(4) + 1);
            else
                rightOrWrong = quizNavigator(difficulty, mathType);

            randomAnswer = rand.nextInt(4) + 1;

            if (rightOrWrong == 1) {
                switch (randomAnswer) {
                    case 1:
                        System.out.println("Very good!");
                        System.out.println();
                        break;
                    case 2:
                        System.out.println("Excellent!");
                        System.out.println();
                        break;
                    case 3:
                        System.out.println("Nice work!");
                        System.out.println();
                        break;
                    case 4:
                        System.out.println("Keep up the good work!");
                        System.out.println();
                        break;
                }
                right++;
            } else {
                switch (randomAnswer) {
                    case 1:
                        System.out.println("No. Please try again.");
                        System.out.println();
                        break;
                    case 2:
                        System.out.println("Wrong. Try once more.");
                        System.out.println();
                        break;
                    case 3:
                        System.out.println("Don't give up!");
                        System.out.println();
                        break;
                    case 4:
                        System.out.println("No. Keep trying.");
                        System.out.println();
                        break;
                }
                wrong++;
            }
        }
        return right;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int difficulty, mathType, right = 0, tryAgain;

        while (true) {
            // Finds out the difficulty of the problems
            System.out.println("Enter a level of difficulty from 1 (easiest) to 4 (hardest:");
            difficulty = scnr.nextInt();

            // Finds out what type of math to practice
            System.out.println("Please choose what type of math problem you would like to practice: ");
            System.out.println("1: addition");
            System.out.println("2: multiplication");
            System.out.println("3: subtraction");
            System.out.println("4: division");
            System.out.println("5: random mixture of options 1-4");

            mathType = scnr.nextInt();

            if (difficulty < 1 || difficulty > 4)
            {
                System.out.println("Please enter a number between 1 and 4...");
                continue;
            }
            else if (mathType < 1 || mathType > 5)
            {
                System.out.println("Please enter a number between 1 and 5...");
                continue;
            }
            else
                right = quizHelper(difficulty, mathType);

            System.out.println();
            System.out.printf("Correct: %d, Incorrect: %d\n", right, (10 - right));

            // Chooses the response based on the number of correct
            if (right > 7) {
                System.out.println("Congratulations, you are ready to go to the next level!");
                System.out.println();
            } else {
                System.out.println("Please ask your teacher for extra help.");
                System.out.println();
            }

            System.out.println("Would you like to continue? Please enter 1 for yes and 2 for no:");
            tryAgain = scnr.nextInt();
            System.out.println();

            if (tryAgain == 1)
                continue;
            else
                break;

        }
    }
}
