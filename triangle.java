public class triangle {
    public static void main(String[] args) {
        // Hardcoded side length of the equilateral triangle
        double side = 6.0;

        // Formula: (sqrt(3) / 4) * side^2
        double area = (Math.sqrt(3) / 4) * Math.pow(side, 2);

        // Display results
        System.out.println("Side length of equilateral triangle: " + side);
        System.out.printf("Area of the equilateral triangle: %.4f\n", area);
    }
}