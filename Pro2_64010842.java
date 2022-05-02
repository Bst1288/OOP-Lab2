import java.util.Scanner;

public class Pro2_64010842 {
    public static void main(String[] args){

        //user enter cissor (0), rock (1), paper (2):
        System.out.print("scissor (0), rock (1), paper (2): ");
        Scanner inputUser = new Scanner(System.in);
        int user = inputUser.nextInt();
        //comouter random
        int max = 2;
        int min = 0;
        int range = max - min + 1;
        int computer = (int)(Math.random()*range)+min;

        if(user >= 0 && user <=2)
        {
            System.out.print("The computer is ");
            if(computer == 0)
            System.out.print("cissor.");
            else if(computer == 1)
            System.out.print("rock.");
            else if(computer == 2)
            System.out.print("paper.");

            System.out.print(" You are ");
            if(user == 0)
            System.out.print("cissor");
            else if(user == 1)
            System.out.print("rock");
            else if(user == 2)
            System.out.print("paper");

        //result
            if(computer == user)
            System.out.print(" too. It is a draw");
            else
                {
                    if(user == 0 && computer == 2
                    || user == 1 && computer == 0
                    || user == 2 && computer == 1)
                    System.out.println(". You won");
                    else
                    System.out.println(". You lose");
                }
        }
        else
        {
            //user enter worng number
            System.out.println("Enter data beyond the specified range.");
        }  
    }
}
