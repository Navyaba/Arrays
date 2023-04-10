import java.util.Scanner;

public class failorpass {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number of subjects");
        int size= scanner.nextInt();

        int numbers[]=new int[size];
        System.out.println("Enter the percentage scored");
        int marks= scanner.nextInt();

            if(marks<50){
                System.out.println("Student is fail");
            } else if (marks<85) {
                System.out.println("Student is Pass");
            }
            else{
                System.out.println("Student is pass with distinction");
            }
        }
    }

