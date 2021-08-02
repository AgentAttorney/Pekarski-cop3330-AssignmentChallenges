package ucf.assignments;

public class Ex9Ops {
    public static int multiplyCircle(String length) {
        double radius = Double.parseDouble(length) / 2.0;
        double radius_squared = radius * radius;
        double area = Math.PI * radius_squared;
        return (int) Math.ceil(area / 350.0);
    }

    public static int multiplySquare(String length) {
        double area = Math.pow(Double.parseDouble(length),2);
        return (int) Math.ceil(area / 350.0);
    }

    public static int multiplyRectangle(String length, String width) {
        double area = Double.parseDouble(length) * Double.parseDouble(width);
        return (int) Math.ceil(area / 350.0);
    }
}
