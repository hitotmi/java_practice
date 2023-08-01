public class Main3 {
    public static void main(String[] args) {
        boolean[] isPrime = new boolean[101];
        for (int i = 0; i < isPrime.length; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i <= 100; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= 100; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        for (int i = 2; i <= 100; i++) {
            if (isPrime[i]) {
                System.out.println(i);
            }
        }

    }
}