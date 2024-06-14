package Number_Pattern3;

public class NumberPattern3 {
    static void numberPattern(int N) {
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int num = 5;
        numberPattern(num);
    }
}
