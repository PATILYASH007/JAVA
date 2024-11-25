// Stat.java
package MyMath;

public class Stat {

    // Method to get the minimum of two numbers
    public double min(double a, double b) {
        return Math.min(a, b);
    }

    // Method to get the maximum of two numbers
    public double max(double a, double b) {
        return Math.max(a, b);
    }

    // Method to count the number of elements (this could be expanded if you want to handle arrays or collections)
    public int count(double[] numbers) {
        return numbers.length;
    }

    // Method to sum the numbers
    public double sum(double[] numbers) {
        double total = 0;
        for (double num : numbers) {
            total += num;
        }
        return total;
    }

    // Method to calculate the average
    public double average(double[] numbers) {
        return sum(numbers) / count(numbers);
    }
}
