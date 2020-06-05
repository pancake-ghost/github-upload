public class BooleanExpr {
    public static void main(String[] args){
        boolean B1 = Boolean.parseBoolean(args[0]);
        boolean B2 = Boolean.parseBoolean(args[1]);
        boolean a = B1;
        boolean b = B2;
        boolean phi = (!(a && b ) && (a || b )) || ((a && b) || !(a || b));
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("phi: " + phi);
    }
}
