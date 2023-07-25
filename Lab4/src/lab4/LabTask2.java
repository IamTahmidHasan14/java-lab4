package lab4;
import java.util.Scanner;

public class LabTask2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();      
        int myR = 0, myC = 0, pR = 0, pC = 0;
        for(int i = 0; i < n; i++) {
            String row = input.nextLine();          
            int mIndex = row.indexOf("m");
            int pIndex = row.indexOf("p");           
            if(mIndex >= 0) {
                myR = i;
                myC = mIndex;
            }            
            if(pIndex >= 0) {
                pR = i;
                pC = pIndex;
            }
        }        
        int UpDownMoves = Math.abs(myR - pR);
        String upDownMoveType = myR > pR ? "UP" : "DOWN";       
        for(int i = 0; i < UpDownMoves; i++) {
            System.out.println(upDownMoveType);
        }       
        int LeftRightMoves = Math.abs(myC - pC);
        String leftRightMoveType = myC > pC ? "LEFT" : "RIGHT";        
        for(int i = 0; i < LeftRightMoves; i++) {
            System.out.println(leftRightMoveType);
        }
    }
}
