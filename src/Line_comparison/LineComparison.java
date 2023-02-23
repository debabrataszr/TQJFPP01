package Line_comparison;

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");

        // co-ordinates of point 1
        double x1 = 10;
        double y1 = 10;

        // co-ordinates of point 2
        double x2 = 20;
        double y2 = 20;


        double length1 = Math.sqrt((Math.pow((x2-x1), 2)) + Math.pow((y2-y1), 2));
        System.out.println("Length of Line 1 : " + length1);

    }
}