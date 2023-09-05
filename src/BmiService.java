
public class BmiService {
    public int calculate(double height, int weight) {
        double result;
        int a1 = 2;
        result = weight / Math.pow(height, a1);
        return (int) result;
    }
}