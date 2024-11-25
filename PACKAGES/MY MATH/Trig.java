// Trig.java
package MyMath;

public class Trig {
    private double angleInDegrees;

    public Trig(double angleInDegrees) {
        this.angleInDegrees = angleInDegrees;
    }

    // Convert angle to radians
    private double toRadians() {
        return Math.toRadians(angleInDegrees);
    }

    // Method to get sine of the angle
    public double sine() {
        return Math.sin(toRadians());
    }

    // Method to get cosine of the angle
    public double cosine() {
        return Math.cos(toRadians());
    }

    // Method to get tangent of the angle
    public double tangent() {
        return Math.tan(toRadians());
    }

    // Method to get secant of the angle
    public double secant() {
        return 1 / Math.cos(toRadians());
    }

    // Method to get cosecant of the angle
    public double cosecant() {
        return 1 / Math.sin(toRadians());
    }

    // Method to get cotangent of the angle
    public double cotangent() {
        return 1 / Math.tan(toRadians());
    }
}
