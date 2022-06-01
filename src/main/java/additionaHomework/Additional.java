package additionaHomework;

public class Additional {
    public static void main(String[] args) {
        Additional add = new Additional();
        add.equalSlices(8, 3, 3);
        add.answerCell(true, true, true);
        add.love6(3, 10);
        add.maxInt(4, 7, 7);
        add.nearHundred(7);
        add.lastDigit(26, 125);
    }

    public void nearHundred(int n) {
        boolean num = true;
        if (n >= 10 && n <= 100) {
            System.out.println(num);
        } else {
            System.out.println("False");
        }
    }

    public void lastDigit(int a, int b) {
        boolean k = true;
        int int1 = a % 10;
        int int2 = b % 10;

        if (int1 == int2) {
            System.out.println(k);
        } else {
            System.out.println("False");
        }
    }

    public void maxInt(int a, int b, int c) {
        if (a >= b && a >= c) {
            System.out.println(a);
        } else if (b >= a && b >= c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }


    public void love6(int a, int b) {
        boolean num = true;
        if (a == 7 || b == 7 || a + b == 7) {
            System.out.println(num);
        } else if (a - b == 6 || b - a == 6) {
            System.out.println(num);
        } else {
            System.out.println("false");
        }
    }

    public void answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (isMorning && !isMom) {
            System.out.println(false);
        } else if (isAsleep) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
    }

    public void equalSlices(int a, int b, int c) {
        double d = b * c;
        if (d <= a) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
