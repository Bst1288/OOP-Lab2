import java.util.Scanner;

public class Pro4_64010842 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //user input cities
        System.out.print("Enter the first city: ");
        String city_1st = input.nextLine();
        System.out.print("Enter the second city: ");
        String city_2nd = input.nextLine();
        System.out.print("Enter the third city: ");
        String city_3rd = input.nextLine();
        String keep;

        if (city_1st.compareToIgnoreCase(city_2nd) > 0) {
            keep = city_2nd;
            city_2nd = city_1st;
            city_1st = keep;
           }

           if (city_2nd.compareToIgnoreCase(city_3rd) > 0) {
            keep = city_3rd;
            city_3rd = city_2nd;
            city_2nd = keep;
           }

           if (city_1st.compareToIgnoreCase(city_2nd) > 0) {
            keep = city_2nd;
            city_2nd = city_1st;
            city_1st = keep;
           }
           System.out.printf("The three cities in alphabetical order are %s %s %s", city_1st, city_2nd, city_3rd);
    }
}
