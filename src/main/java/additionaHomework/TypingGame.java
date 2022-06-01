package additionaHomework;

public class TypingGame {
    public static void main(String[] args) {
        TypingGame typingGame = new TypingGame();
//        String[] userTyped = {"it", "is", "find"};
//        String[] correct = {"it", "is", "fine"};
//        typingGame.arrays(userTyped, correct);

//        typingGame.swapped("Donald Trump");
        //typingGame.trueFalse("loop");

        int[] arr = typingGame.scores("AAB");
        for (int res: arr) {
            System.out.println(res);
        }
    }

    public int arrays(String[] userTyped, String[] correct) {
        int res = 1;
        if (userTyped.length == correct.length) {
            for (int i = 0; i < userTyped.length; i++) {
//                for (int j = 0; j < correct.length; j++) {
                if (userTyped[i].equals(correct[i])) {
                    res = 1;
//                        System.out.println(res);
                } else {
                    res = -1;
//                        System.out.println(res);
                }
//                }
            }
        }
        System.out.println(res);
        return res;

    }

    public void swapped(String str) {
        String[] strNew = str.split(" ");
        String res = strNew[1] + " " + strNew[0];
        System.out.println(res);
    }

    public boolean trueFalse(String word) {

        for (int i = 1; i < word.length(); i++) {
            if ((i - 1) == i) {
                return true;
            }
        }
        return false;
    }

    public int[] scores(String letter) {
        int a = 0;
        int b = 0;
        int c = 0;

        for (int i = 0; i < letter.length(); i++) {
            if (letter.charAt(i) == 'A') {
                a++;

            } else if (letter.charAt(i) == 'B') {
                b++;
            } else {
                c++;
            }
        }int[] scores = {a,b,c};

        return scores;
    }
}
