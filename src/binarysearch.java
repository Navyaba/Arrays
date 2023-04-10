import java.util.Scanner;

public class binarysearch {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int size= scanner.nextInt();
        int numbers[]=new int[size];
        System.out.println("Enter the numbers");
        //input
        for(int i=0;i<size;i++){

            numbers[i]= scanner.nextInt();
        }
        System.out.println("Enter the number to find x");
int x= scanner.nextInt();;

for(int i=0;i< numbers.length;i++){
    if(numbers[i]==x){
        System.out.println("x found at: "+ i);
    }

}
    }
}
