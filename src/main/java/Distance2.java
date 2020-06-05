public class Distance2 {
    public static void main ( String[] nums) {
        int num1 = Integer.parseInt(nums[0]);
        int num2 = Integer.parseInt(nums[1]);
        int distance = Math.abs(num1 - num2);
        System.out.println(distance);
    }
}
