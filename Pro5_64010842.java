import java.util.Scanner;

public class Pro5_64010842 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        //user enter number
        System.out.print("Enter the number of lines: ");
        int num = input.nextInt();

        if(num > 0 && num < 16){
            for(int row = 1; row <= num; row++){
                //print 2 space in each row
                for(int col = 1; col <= (num-row); col++){
                    System.out.print("  ");
                }
                // numbers with space in each row (lift)
                for (int col = row; col >= 1; col--){
                    System.out.print(col + " ");
                }
                // numbers with space in each row (right)
                for(int col = 2; col <=row; col++){
                    System.out.print(col + " ");
                }
                System.out.println();
            }
        }
        //user enter worng number
        else
        System.out.print("The number is wrong, please try again.");
    }
}
