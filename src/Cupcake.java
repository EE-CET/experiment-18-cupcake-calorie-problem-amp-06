import java.util.Scanner;

class Cupcake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] num = new int[n];

        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (num[i] < num[j]) {
                    int temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += num[i] * (int)Math.pow(2, i);
        }

        System.out.println(sum);
    }
}
