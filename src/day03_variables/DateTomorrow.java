package day03_variables;

public class DateTomorrow {
    public static void main(String[] args) {
      // int month, day, year;// made 3 variables, all of them are int type
        String months = "January";
        int month =3;
        boolean isSleepy = true;
        byte num4 = -128;
        short num5 = 32000;
        double num = 21344.212321;
        float num2 = 498951.487F;// our default is double for the decimal numbers
        long num3 = 7464552L;// our default is int for the whole number
       int day = 13;
        int year = 2022;

        // alternative declaration and assignment: int month=6, day =13, year 2022;
        System.out.println("" + month + day + year);

        day = 14;
        System.out.println("Tomorrow's Date:"+month+"\\"+day+"\\"+year);
    }
}
