import java.util.Arrays;

public class MathOperations {
    
    public static double calculateStandardDeviation(double[] array) {
        int n = array.length;
        double mean = calculateMean(array);
        double sumSquaredDiff = 0.0;
        for (double num : array) {
            sumSquaredDiff += Math.pow(num - mean, 2);
        }
        return Math.sqrt(sumSquaredDiff / n);
    }
    
    public static double calculateMean(double[] array) {
        double sum = 0.0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }
    
    public static double[] calculateCrossProduct(double[] vector1, double[] vector2) {
        double[] crossProduct = new double[3];
        crossProduct[0] = vector1[1] * vector2[2] - vector1[2] * vector2[1];
        crossProduct[1] = vector1[2] * vector2[0] - vector1[0] * vector2[2];
        crossProduct[2] = vector1[0] * vector2[1] - vector1[1] * vector2[0];
        return crossProduct;
    }
    
    public static void main(String[] args) {
        double[] array = {1.2, 2.3, 3.4, 4.5, 5.6}; // Example array for standard deviation calculation
        double[] vector1 = {1, 2, 3}; // Example vectors for cross product calculation
        double[] vector2 = {4, 5, 6};
        
        // Calculate standard deviation
        double standardDeviation = calculateStandardDeviation(array);
        System.out.println("Standard Deviation: " + standardDeviation);
        
        // Calculate cross product
        double[] crossProduct = calculateCrossProduct(vector1, vector2);
        System.out.println("Cross Product: " + Arrays.toString(crossProduct));
    }
}
