package ua.mainacad.service;

public class NumberCalculation {

    public static int byType(int number) {
        String arg = String.valueOf(number);
        int sum=0;
        for (int i=0; i < arg.length(); i++) {
            sum=sum + Character.getNumericValue(arg.charAt(i));
        }
        return sum;
    }

    public static int byDivision(int number) {
        int sum=0;
        int result=number;
        while (result!=0) {
            sum=sum+result%10;
            result=result/10;

        }
        return sum;
    }
}
