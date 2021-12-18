package Class_Object_example_Two;

import java.util.Scanner;

public class TestBMI {
    public static void main(String[] args) {
        Scanner ask=new Scanner(System.in);

        System.out.println("Enter your Name: ");
        String na = ask.nextLine();

        System.out.println("Enter your age: ");
        int ag=ask.nextInt();

        System.out.println("Enter your weight: ");
        double wei=ask.nextDouble();

        System.out.println("Enter your height: ");
        double hei=ask.nextDouble();

        BMIClass bm1=new BMIClass(na,ag,wei, hei);
        System.out.println("Person Details ");
        // System.out.println("Name: "+na+" Age: "+ag+" Weight: "+wei+ " Height: "+hei+ " ");
        System.out.println("Name : "+bm1.getName()+
                " Age :"+bm1.getAge()+
                " Weight : "+bm1.getWeight()+
                " Height: "+bm1.getHeight() );
        System.out.println(bm1.getBMI());
        System.out.println("BMI status "+bm1.getStatus());



    }
}
