package Star_Pattern1;

class Five_Star_Problem {
    static void pattern1(int N) {
        // this first look is for the row
        for (int i = 0; i < N; i++) {
            // this inner loop is for the colum
            for (int j = 0; j < N; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int N = 10;
        pattern1(N);
    }
}
