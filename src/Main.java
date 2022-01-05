import java.util.Scanner;

public class Main {
    private static  Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Nhập n:");
        int number = scanner.nextInt();
        System.out.printf("Tất cả các số nguyên tố nhỏ hơn %d là: \n",number);
        if (number >= 2){
            System.out.println(2);
        }
        for (int i = 3; i < number; i+=2){
            if (checkPrime(i)){
                System.out.println("" + i);
            }
        }
    }

    public static boolean checkPrime(int number) {
        if (number == 1) {
            return false;
        } else if (number == 2) {
            return true;
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }

    }
}
