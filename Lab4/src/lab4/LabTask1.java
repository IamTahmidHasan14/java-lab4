package lab4;
import java.util.Arrays;
import java.util.Scanner;

public class LabTask1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        int m=input.nextInt();

        int[] elements = new int[m];
        for(int i =0; i<elements.length; ++i){
            elements[i]=input.nextInt();
        }
        Arrays.sort(elements);
        int min=999;
        for(int i=0; i<=m-n; i++){
            min = Math.min(min,elements[i+n-1] - elements[i]);
        }
        System.out.println(min);
    }   
}
