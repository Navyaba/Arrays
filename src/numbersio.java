import java.util.Scanner;

public class numbersio {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int size= scanner.nextInt();
        int numbers[]=new int[size];

        //input
        for(int i=0;i<size;i++){
            numbers[i]= scanner.nextInt();
        }

        //output
        for(int i=0;i<size;i++){
            System.out.println(numbers[i]);
        }
    }
}
