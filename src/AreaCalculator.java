import java.util.Scanner;

class AreaCalculator {

   
    public double calculateArea(float radius) {
        return Math.PI * radius * radius;
    }

   
    public double calculateArea(float length, float breadth) {
        return length * breadth;
    }


    public double calculateArea(double base, double height) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AreaCalculator calculator = new AreaCalculator();

      
        float radius = sc.nextFloat();
        float length = sc.nextFloat();
        float breadth = sc.nextFloat();
        double base = sc.nextDouble();
        double height = sc.nextDouble();

       
        double circleArea = calculator.calculateArea(radius);
        double rectangleArea = calculator.calculateArea(length, breadth);
        double triangleArea = calculator.calculateArea(base, height);

        System.out.printf("%.2f\n", circleArea);
        System.out.printf("%.2f\n", rectangleArea);
        System.out.printf("%.2f\n", triangleArea);


        sc.close();
    }
}
