package Examinations;

public class lec2Exam {
    public static void main(String[] args) {
        int x = 5;
        int firstQ = (5 * ++x) - (-2);
        System.out.println(firstQ);

        int a1 = 10, b = 8;
        int secondQ = ++a1-b;
        System.out.println(secondQ);

        int k = 5, j = 9;
        int thirdQ =  k += k++ - ++j + k;
        System.out.println(thirdQ);

        int a2 = 7;
        System.out.println(a2);

        int x1 = 4;
        int fifthQ;
        x1 += (x1++) - ++x1 + x1;
        fifthQ = x1;
        System.out.println(fifthQ);

        int y = 10;
        int sixthQ = ++y * (y++ + 5);
        System.out.println(sixthQ);

    }
}
