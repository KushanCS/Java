import java.util.Scanner;
public class Array {
    public static void main(String args[]){
        int fiveIntegers[] = new int[5];

        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<5; i++){
            System.out.print("Enter " + (i+1) + " number: ");
            fiveIntegers[i] = sc.nextInt();
        }
        int largestNumber = 0;

        //find the largest number
        for(int i = 0; i < 5; i++){
            if(largestNumber < fiveIntegers[i]){
                largestNumber = fiveIntegers[i];
            }
        }

        //calculate the sum
        int sum = 0;
        for(int i = 0; i < 5; i++){
            sum = sum + fiveIntegers[i];
        }

        System.out.println("Largest value: " + largestNumber);
        System.out.println("Sum of elements: " + sum);
    }
}
