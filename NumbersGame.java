import java. util. Random;
import java. util. Scanner;
public class NumbersGame {
    public static void main(String[] args) 
    {
        System.out.println("\n\nWelcome to Numbers Game..\n");
        Scanner sc = new Scanner(System.in);
        Random randomNum = new Random();
        int n = 5; //Number of Attempts
        int newScore = 0;
        while(n > 0)
        {
            int generatedNum = randomNum.nextInt(101);
            System.out.print("Enter the number for match: ");
            int userNum = sc.nextInt();
            int score;
            if(userNum == generatedNum)
            {
                System.out.println("Generated Number: "+generatedNum);
                score = 50;
                newScore+=score;
                System.out.println("You Won..");
                System.out.printf("Score: %d\nYour Score: %d\n\n",score,newScore);
                
            }
            else if(userNum > generatedNum)
            {
                System.out.println("Generated Number: "+generatedNum);
                int dist = Math.abs(userNum - generatedNum);
                if(dist < 15)
                {
                    System.out.println("You enter too close..");
                    score = 25;
                    newScore+=score;
                    System.out.printf("Score: %d\nYour Score: %d\n\n",score,newScore);
                }
                else if(dist < 30)
                {
                    System.out.println("You enter close..");
                    score = 10;
                    newScore+=score;
                    System.out.printf("Score: %d\nYour Score: %d\n\n",score,newScore);
                }
                else if(dist >= 30)
                {
                    System.out.println("You enter too away..");
                    score = 5;
                    newScore+=score;
                    System.out.printf("Score: %d\nYour Score: %d\n\n",score,newScore);
                }
                
            }
            else if(userNum < generatedNum)
            {
                System.out.println("Generated Number: "+generatedNum);
                int dist = Math.abs(userNum - generatedNum);
                if(dist < 15)
                {
                    System.out.println("You enter too close..");
                    score = 25;
                    newScore+=score;
                    System.out.printf("Score: %d\nYour Score: %d\n\n",score,newScore);
                }
                else if(dist < 30)
                {
                    System.out.println("You enter long..");
                    score = 10;
                    newScore+=score;
                    System.out.printf("Score: %d\nYour Score: %d\n\n",score,newScore);
                }
                else if(dist >= 30)
                {
                    System.out.println("You enter too low..");
                    score = 5;
                    newScore+=score;
                    System.out.printf("Score: %d\nYour Score: %d\n\n",score,newScore);
                }
            }
            n--;
        }
        sc.close();
        System.out.println("Your Final Score:"+newScore);
        if(newScore >= 500)
        {
            System.out.println("You are the Master");
        }
        System.out.println("Thanks you for playing..");
    }
}