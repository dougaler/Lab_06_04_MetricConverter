import java.util.Scanner;
public class MetricConverter {
    public static void main(String[] args) {
        double meters;
        double miles;
        double feet;
        double inches;
        String trash;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter how many meters you would like to convert");
        if(in.hasNextDouble()) {
            meters = in.nextDouble();
            in.nextLine();
            feet = meters*3.20808;
            inches = feet*12;
            miles = feet/5280;
            System.out.printf(meters + " meters is equal to %.2f feet%n",feet);
            System.out.printf(meters + " meters is equal to %.2f inches%n", inches);
            System.out.printf(meters + " meters is equal to %.5f miles%n", miles);

        }else{
            trash = in.nextLine();
            System.out.println("Invalid meters entered: "+trash);
        }


    }
}