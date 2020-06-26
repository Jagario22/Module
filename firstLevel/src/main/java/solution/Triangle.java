package solution;

public class Triangle {
    public static Double calcSquare(int[] A, int[] B,int[] C)
    {
        int determ;
        determ = (A[0] - C[0]) * (B[1] - C[1]) - (B[0] - C[0]) * (A[1] - C[1]);
        return Math.abs(1./2 * determ);
    }
}
