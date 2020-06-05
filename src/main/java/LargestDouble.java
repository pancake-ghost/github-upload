public class LargestDouble {
    public static void main ( String[] args){
        double num1 = Double.parseDouble(args[0]);
        double num2 = Double.parseDouble(args[1]);
        double largest = Math.max(num1, num2);
        System.out.println(largest);
    }
}