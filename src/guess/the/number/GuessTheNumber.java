package guess.the.number;

import javax.swing.JOptionPane;

public class GuessTheNumber {

    public static int Guess_fun(int number, int guess) {
        if (guess > number && guess - number >= 10) {
            return 1;
        } else if (guess < number && number - guess >= 10) {
            return 2;
        } else if (guess > number && guess - number < 10) {
            return 3;
        } else if (guess < number && number - guess < 10) {
            return 4;
        }

        return 0;
    }

    public static int get_score(int score, int level) {
        int s = 0;
        if (level == 0) {
            s = (int) ((30 - score) * 100) / 30;
        } else if (level == 1) {
            s = (int) ((20 - score) * 100) / 20;
        } else if (level == 2) {
            s = (int) ((10 - score) * 100) / 10;
        }
        return s;
    }

    public static int check_attempts(int attempts, int level) {
        if (level == 0 && attempts >= 30) {
            JOptionPane.showMessageDialog(null, "You have used up all your attempts", "game Over", 1);
            return 1;
        } else if (level == 1 && attempts >= 20) {
            JOptionPane.showMessageDialog(null, "You have used up all your attempts", "game Over", 1);
            return 1;

        } else if (level == 2 && attempts >= 10) {
            JOptionPane.showMessageDialog(null, "You have used up all your attempts", "game Over", 1);
            return 1;
        }
        return 0;
    }

}
