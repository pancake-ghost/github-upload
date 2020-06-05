public class QuadraticSolver {

    public static void main(String[] args){
        float A = Float.parseFloat(args[0]);
        float B = Float.parseFloat(args[1]);
        float C = Float.parseFloat(args[2]);

        if (realcheck(A,B,C) == true) {
            float solution1 = solution1(A,B,C);
            float solution2 = solution2(A,B,C);
            System.out.println(solution1);
            System.out.println(solution2);
        } else {
            System.out.println("There are no real solution into thi quadratic");
        }

    }

    public static boolean realcheck(float A, float B,float C){
        float descriminant = (B*B-4*A*C);

        if (descriminant>=0) {
            return true;
        } else{
            return false;
        }
    }

    public static float solution1(float A, float B, float C){
        float x1 = (float)((-B + Math.sqrt(B*B-4*A*C))/(2*A));
        return x1;
    }

    public static float solution2(float A, float B, float C){
        float x2 = (float)((-B-Math.sqrt(B*B-4*A*C))/(2*A));
        return x2;
    }

}

