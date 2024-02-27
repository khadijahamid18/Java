public class task5 {
    public static void main(String[] args) {
        // Define the starting and ending range
        int startRange = 0;
        int endRange = 1000; // You can adjust this range as per your requirement

        // Iterate through the range
        for (int i = startRange; i <= endRange; i++) {
            // Check if the number is an Armstrong number
            if (isArmstrong(i)) {
                System.out.println(i + " is an Armstrong number.");
            }
        }
    }

    // Method to check if a number is an Armstrong number
    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int sum = 0;

        // Calculate the sum of cubes of digits
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, 3);
            num /= 10;
        }

        // Check if the sum equals the original number
        return sum == originalNum;
    }
}
