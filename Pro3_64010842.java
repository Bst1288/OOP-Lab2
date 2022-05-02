import java.util.Scanner;

public class Pro3_64010842 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //user enter year/month/day
        System.out.print("Enter year [e.g.,2002]: ");
        int year = input.nextInt();
        System.out.print("Enter month [1-12]: ");
        int month = input.nextInt();
        System.out.print("Enter day [1-31]: ");
        int date = input.nextInt();

        if(month >= 1 && month <= 12 && date >= 1 && date <= 31 && year >= 1){
            //Check if it January or Februaryare
            if(month == 1){
                month = 13;
                year--;
            }

           else if(month == 2){
                month = 14;
                year--;
            }

            int q = date;
            int m = month;
            int j = year/100;
            int k = year%100;
            int h = ( q + ( ( 26*(m + 1) ) / 10) + k + (k/4) +(j/4) + (5*j) ) % 7;

            //result
            if(h == 0)
            System.out.print("the day of the week Saturday.");
            if(h == 1)
            System.out.print("the day of the week Sunday.");
            if(h == 2)
            System.out.print("the day of the week Monday.");
            if(h == 3)
            System.out.print("the day of the week Tuesday.");
            if(h == 4)
            System.out.print("the day of the week Wednesday.");
            if(h == 5)
            System.out.print("the day of the week Thursday.");
            if(h == 6)
            System.out.print("the day of the week Friday.");
        }
        //user enter worng input
        else
            System.out.print("The input is invalid, please try again.");
    }
}
