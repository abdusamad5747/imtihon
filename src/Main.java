import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        masala2();
        masala3();

    }

    public static void masala3() {
        String str = "";
        Scanner scan = new Scanner(System.in);
        String result = "";
        str = scan.nextLine();
        String a[] = {"a", "b", "c", "d", "e", "f", "h", "i", "l", "n", "o", "r", "s", "u"};
        String b[] = {"t", "c", "d", "o", "p", "y", "e", "f", "a", "k", "l", "s", "t", "f"};
        String c[] = new String[str.length()];
        for (int i = 0; i < str.length(); i++) {
            String c1 = String.valueOf(str.charAt(i));
            for (int n = 0; n < a.length; n++) {
                if (a[n].equals(c1)) {
                    result += b[n];
                }
            }
        }
        System.out.println(result);
    }

    public static void masala2() {
        int num = 29;
        int result = 1;
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();
        for (int i = 2; i <= num; i++) {
            boolean prime = isPrime(i);
            if (prime)
                result = result * i;
        }
        int s = 0;

        boolean bool = true;
        while (result > 0) {
            if (result % 10 == 0)
                s++;
            result /= 10;
        }
        System.out.println(s);
    }

    public static boolean isPrime(int a) {
        boolean flag = false;
        for (int i = 2; i <= a / 2; ++i) {
            if (a % i == 0) {
                flag = true;
                break;
            }
        }

        return !flag;
    }

}

