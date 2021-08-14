import java.util.Scanner;

public class pascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number Of Row : ");
        int row = scanner.nextInt();
        int space = row;
        int number =1 ;
        for(int i=0 ; i<row ; i++){
            for(int s=1 ; s<=space ; s++){
                System.out.print(" ");
            }
            number = 1;
            for(int j=0 ; j<=i ; j++){
                System.out.print(number+" ");
                number = number*(i-j)/(j+1);
            }
            space--;
            System.out.println();
        }
    }
}