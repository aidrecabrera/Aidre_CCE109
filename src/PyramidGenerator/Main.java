package PyramidGenerator;

public class Main {
    public static void main(String[] args) {
        Library Algorithm = new Library();
        Algorithm.number = 10;
        Algorithm.leftTriangle();
        Algorithm.middlePillar();
        Algorithm.invertedLeftTriangle();
    }
}

class Library {
    int number;
    void leftTriangle() {
        for(int i = 1; i <= this.number; ++i) {
            for(int j = 1; j <= this.number; ++j) {
                if (j <= i) {
                    System.out.print(" " + "*" + " ");
                }
            }
            System.out.println();
        }
    }
    void middlePillar() {
        for(int i = 1; i <= this.number+1; ++i) {
            for(int j = 1; j <= this.number+1; ++j) {
                if (j == i) {
                    System.out.print(" " + "*" + " ");
                }
            }
        }
        System.out.println();
    }
    void invertedLeftTriangle() {
        for (int i = 0; i <= this.number; ++i) {
            for (int j = this.number-i; j >= 1; --j) {
                System.out.print(" " + "*" + " ");
            }
            System.out.println();
        }
    }
}
