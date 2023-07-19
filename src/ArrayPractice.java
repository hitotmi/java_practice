public class ArrayPractice {
    public static void main(String[] args) {
        int[] nums = { 1, 5, 8 };
        System.out.println("1から9の数字を入力してください。");
        int input = new java.util.Scanner(System.in).nextInt();
        boolean found = false;

        for (int i = 0; i < nums.length; i++) {
            if (input == nums[i]) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("あたり");
        } else {
            System.out.println("はずれ");
        }
        // for (int n : nums) {
        //     if (n == input) {
        //         System.out.println("あたり");
        //     }
        // }
    }
}
