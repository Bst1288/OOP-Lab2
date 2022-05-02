import java.util.Scanner;

public class Pro1_64010842 {
    public static void main(String[] args){
        System.out.print("Enter today's day: ");
        Scanner inputDay = new Scanner(System.in);
        int day = inputDay.nextInt();

        System.out.print("Enter the number of days elapsed since today: ");
        int dayElapsed = inputDay.nextInt();

        //Calculate to find future day
        int newDay = (day + dayElapsed) % 7;

        String today;
        String futureDay;
//----------------------------------------------------------//
        if(day>=0 && day<=7 && dayElapsed>0){
            System.out.print("Today is ");

            if(day == 0)
                System.out.print("Sunday");
            else if(day == 1)
                System.out.print("Monday");
            else if(day == 2)
                System.out.print("Tuesday");
            else if(day == 3)
                System.out.print("Wednesday");
            else if(day == 4)
                System.out.print("Thursday");
            else if(day == 5)
                System.out.print("Friday");
            else if(day == 3)
                System.out.print("Saturday");
//----------------------------------------------------------//
            System.out.print(" and the future day is ");

            if(newDay == 0)
                System.out.print("Sunday");
            else if(newDay == 1)
                System.out.print("Monday");
            else if(newDay == 2)
                System.out.print("Tuesday");
            else if(newDay == 3)
                System.out.print("Wednesday");
            else if(newDay == 4)
                System.out.print("Thursday");
            else if(newDay == 5)
                System.out.print("Friday");
            else if(newDay == 3)
                System.out.print("Saturday");
        }
        else{
            //user enter worng number
            System.out.print("You entered a number outside the specified range.");
        }
    }
}