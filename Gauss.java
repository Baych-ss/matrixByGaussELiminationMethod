import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter amount of variables from 2 - 5");
        int amountOfVariables = scan.nextInt();
        // 2 by 2;
        if(amountOfVariables == 2) Matrix2by2(amountOfVariables);
    }
    public static void Matrix2by2(int amountOfVariables) {
        Scanner scan = new Scanner(System.in);
        int[][] matrix2x2 = new int[amountOfVariables][amountOfVariables + 1];
        if (amountOfVariables == 2) {
            System.out.println("enter 2x2 matrix with answr");
            for (int i = 0; i < amountOfVariables; i++) {
                for (int j = 0; j < amountOfVariables + 1; j++) {
                    int input = scan.nextInt();
                    matrix2x2[i][j] = input;
                }
            }
            int c = 1;
            int k = 0;
            for (int i = 0; i < amountOfVariables; i++) {
                for (int j = 0; j < amountOfVariables + 1; j++) {
                    if(matrix2x2[0][0] < matrix2x2[1][0]){
                        if((matrix2x2[0][0] % 2 == 0) && (matrix2x2[1][0] % 2 == 0)){
                            while(matrix2x2[0][0] < matrix2x2[1][0]){
                                matrix2x2[0][0]++;

                                k++;
                            }
                        }
                        else if((matrix2x2[0][0] % 2 != 0) && (matrix2x2[1][0] % 2 == 0)){
                            while(matrix2x2[0][0] < matrix2x2[1][0]) {
                                matrix2x2[0][0]++;

                                c++;
                            }
                        }
                        else if((matrix2x2[0][0] % 2 == 0) && (matrix2x2[1][0] % 2 != 0)){
                            while(matrix2x2[0][0] < matrix2x2[1][0]){
                                matrix2x2[0][0]++;

                                k++;
                            }
                        }
                        else if((matrix2x2[0][0] % 2 != 0) && (matrix2x2[1][0] % 2 != 0)){
                            while(matrix2x2[0][0] < matrix2x2[1][0]){
                                matrix2x2[0][0]++;

                                c++;
                            }
                        }
                    }
                }
            }
            System.out.println(c);
        }
    }
}