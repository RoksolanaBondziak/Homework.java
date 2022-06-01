package additionaHomework;

public class Additional2 {
    public static void main(String[] args) {
        Additional2 additional2 = new Additional2();
//        additional2.addChars("dog");
//        additional2.startAndEnd("fob");
//        System.out.println(additional2.bigThere("vibf"));
//        additional2.stringTimes("Hi", 3);
        System.out.println(additional2.isPlural("changes"));

    }

    public String addChars(String str) {
        String result = null;

        if (str == null || str.isBlank() || str.isEmpty()) {
            System.out.println("Error. String is null or empty");
        } else {
            result = str.charAt(str.length() - 1) + str + str.charAt(str.length() - 1);
            System.out.println(result);

        }

        return result;
    }

    public String startAndEnd(String word) {
        String changedWord = "";
        if (word.startsWith("f") && word.endsWith("b")) {
            changedWord = "FizzBuzz";

        } else if (word.startsWith("f")) {
            changedWord = "Fizz";
        } else if (word.endsWith("b")) {
            changedWord = "Buzz";
        }
        System.out.println(changedWord);
        return changedWord;
    }

    public boolean bigThere(String bib) {
        int len = bib.length();

        for (int i = 0; i < len - 2; i++) {

            if (bib.charAt(i) == 'b' && bib.charAt(i + 2) == 'b') {
                return true;
            }
        }

        return false;
    }

    public String stringTimes(String str, int num) {
        String res = "";
        for (int i = 0; i < num; i++) {
            res = res + str;
        }
        System.out.println(res);
        return res;
    }

    public boolean isPlural(String singleOrPlural) {
        boolean sin = false;
        int l = singleOrPlural.length() - 1;

        if (singleOrPlural.charAt(l) == 's') {
            sin = true;
        }
        return sin;
    }
}

