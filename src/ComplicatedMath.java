public class ComplicatedMath {

    public static int pow(int a, int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= a;
        }
    }

}
