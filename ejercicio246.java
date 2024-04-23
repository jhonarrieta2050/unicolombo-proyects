import java.util.Scanner;

public class ejercicio246 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, nums[];

        System.out.print("Digite un número: ");
        n = scanner.nextInt();

        nums = new int[n];
        nums[0] = 10;
        
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[(i - 1)] + 11;
        }

        for (int num : nums) {
            System.out.println(num);
        }
        
    }
}