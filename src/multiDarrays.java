import java.util.Scanner;

public class multiDarrays {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int rows= scanner.nextInt();
        int colm= scanner.nextInt();
        int[][] numbers=new int[rows][colm];
        //input
        for(int i=0;i<rows;i++){
            for(int j=0;j<colm;j++){
                numbers[i][j] = scanner.nextInt();
            }
        }

        //output
        for(int i=0;i<rows;i++){
            for(int j=0;j<colm;j++){
                System.out.print(numbers[i][j]+ " ");
            }
        }
        //System.out.println();
    }
}
