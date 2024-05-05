import java. util. Scanner;

public class GradeCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter number of Subjects: ");
        int no_of_sub = sc.nextInt();
        int marks_scored = 0;
        for(int i = 1;i <= no_of_sub;i++){
            System.out.print("Enter Mark Scored in subject "+i+" :");
            int mark = sc.nextInt();
            marks_scored+=mark;
        }
        float mark_percent = (float)marks_scored / no_of_sub;
        char grade;
        sc.close();
        if(mark_percent >= 90){
            grade = 'O';
        }
        else if(mark_percent >= 80){
            grade = 'A';
        }
        else if(mark_percent >= 70){
            grade = 'B';
        }
        else if(mark_percent >= 60){
            grade = 'C';
        }
        else if(mark_percent >= 50){
            grade = 'D';
        }
        else{
            grade = 'E';
        }
        System.out.println();
        System.out.println("Total Marks Scored: "+marks_scored);
        System.out.println("Average Percentage: "+mark_percent);
        System.out.println("Grade: "+grade);
        return;
    }
}
