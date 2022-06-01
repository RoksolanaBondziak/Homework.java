package homework;

public class M3Homework {
    public static void main(String[] args) {
        M3Homework homework = new M3Homework();
        homework.number(100);
        homework.summary(2, 6);
        homework.pyramid(5);

    }

    public void number(int k) {

        for (int i = 1; i >= 1 && i <= k; i++) {

            if (i % 2 == 0 && i % 3 == 0) {
                System.out.println("The number " + i + " is divisible by two and three");
            } else if (i % 2 == 0) {
                System.out.println("The number " + i + " is even");
            } else if (i % 3 == 0) {
                System.out.println("The number " + i + " is divisible by three");
            } else {
                System.out.println("The number " + i + " is odd");
            }
        }

    }


    public void summary(int a, int b) {
        int c = 0;
        for (int d = a; d <= b; d++) {
            c = c + d;
        }
        System.out.println(c);

    }

    public void pyramid(int rows) {
        for (int m = rows; m >= 1; m--) {
            for (int j = 1; j <= m; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
