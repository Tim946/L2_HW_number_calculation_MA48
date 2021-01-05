package ua.mainacad;

import ua.mainacad.service.NumberCalculation;

public class Application {
    public static void main(String[] args) {
        if(args.length<1){
            System.out.println("Args is empty!");
            return;
        }
        int number = Integer.valueOf(args[0]);
        int sum = NumberCalculation.byType(number);
        System.out.println("Sum by variable type changing is : " + sum);
        sum = NumberCalculation.byDivision(number);
        System.out.println("Sum by remainder of division is : " + sum);
    }
}
