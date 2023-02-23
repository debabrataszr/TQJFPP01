package Line_comparison;

import java.util.Objects;

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");
        LineComparison lc = new LineComparison();
        lc.compareTwoLines();

    }

    void compareTwoLines() {
        // co-ordinates of point 1
        double x1 = 10;
        double y1 = 10;

        // co-ordinates of point 2
        double x2 = 20;
        double y2 = 20;

        // co-ordinates of point 3
        double x3 = 30;
        double y3 = 30;

        // co-ordinates of point 4
        double x4 = 40;
        double y4 = 40g;

        double length1 = Math.sqrt((Math.pow((x2 - x1), 2)) + Math.pow((y2 - y1), 2));
        // FORMULA : Length of a Line = sqrt( (x2 - x1) ^ 2 + (y2- y1) ^ 2)

        double length2 = Math.sqrt((Math.pow((x4 - x3), 2)) + Math.pow((y4 - y3), 2));
        // FORMULA : Length of a Line = sqrt( (x2 - x1) ^ 2 + (y2- y1) ^ 2)

        System.out.println("Length of Line 1 : " + length1);
        System.out.println("Length of Line 2 : " + length2);

        boolean result = Objects.equals(length1, length2);
        System.out.println("BOTH LINES ARE EQUAL " + result);
    }
}

