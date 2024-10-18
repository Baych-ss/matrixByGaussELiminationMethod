import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if(n == 2){
            matrix2x2(n);
        }
        else if(n == 3){
            matrix3x3(n);
        }
        else if(n == 4){
            matrix4x4(n);
        }

    }
    //matrix 2x2
    public static void matrix2x2(int n) {
        System.out.println("enter matrix 2x2 with answers");
        Scanner scan = new Scanner(System.in);
        int[][] a = new int[n][n + 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n + 1; j++) {
                a[i][j] = scan.nextInt();
            }
        }
        //determinant
        int determinant = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n + 1; j++) {
                determinant = ((a[0][0] * a[1][1]) - (a[0][1] * a[1][0]));
            }
        }
        //dx/d  dy/d
        int dx = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n + 1; j++) {
                dx = (a[0][2] * a[1][1]) - (a[1][2] * a[0][1]);
            }
        }
        int dy = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n + 1; j++) {
                dy = (a[0][0] * a[1][2]) - (a[0][2] * a[1][0]);
            }
        }
        System.out.println("x is :" + dx / determinant + "|||  y 2is:" + dy / determinant);
    }
    //matrix 3x3 ///////////////////////////////////////////

    public static void matrix3x3(int n) {
        System.out.println("enter matrix 3x3 with answers");
        Scanner scan = new Scanner(System.in);
        int[][] a = new int[n][n + 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n + 1; j++) {
                a[i][j] = scan.nextInt();
            }
        }
        int determinantA = 0;
        int determinantB = 0;
        int determinantC = 0;
        int determinant = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n + 1; j++) {
                determinantA = ((a[0][0]*(a[1][1] * a[2][2] - a[1][2] * a[2][1])));
                determinantB = ((a[0][1]*(a[1][0] * a[2][2] - a[1][2] * a[2][0])));
                determinantC = ((a[0][2]*(a[1][0] * a[2][1] - a[1][1] * a[2][0])));
            }
        }
        determinant = determinantA - determinantB + determinantC;
        //dx
        int dxA = 0;
        int dxB = 0;
        int dxC = 0;
        int dx = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n + 1; j++) {
                dxA = (a[0][3] * (a[1][1] * a[2][2] - a[1][2] * a[2][1]));
                dxB = (a[0][1] * (a[1][3] * a[2][2] - a[1][2] * a[2][3]));
                dxC = (a[0][2] * (a[1][3] * a[2][1] - a[1][1] * a[2][3]));
                dx = dxA - dxB + dxC;
            }
        }

        //dy////////////////////////
        int dyA = 0;
        int dyB = 0;
        int dyC = 0;
        int dy = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n + 1; j++) {
                dyA = (a[0][0] * ((a[1][3] * a[2][2] - (a[1][2] * a[2][3]))));
                dyB = (a[0][3] * ((a[1][0] * a[2][2] - (a[1][2] * a[2][0]))));
                dyC = (a[0][2] * ((a[1][0] * a[2][3] - (a[1][3] * a[2][0]))));
                dy = dyA - dyB + dyC;
            }
        }

        //dz//////////////////////////
        int dzA = 0;
        int dzB = 0;
        int dzC = 0;
        int dz = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n + 1; j++) {
                dzA = (a[0][0] * ((a[1][1] * a[2][3] - (a[1][3] * a[2][1]))));
                dzB = (a[0][1] * ((a[1][0] * a[2][3] - (a[1][3] * a[2][0]))));
                dzC = (a[0][3] * ((a[1][0] * a[2][1] - (a[1][1] * a[2][0]))));
                dz = dzA - dzB + dzC;
            }
        }
        //Result of x y z///////////////////////////////
        int x = 0;
        int y = 0;
        int z = 0;
        x = dx / determinant;
        y = dy / determinant;
        z = dz / determinant;
        System.out.println(x + " " + y + " " + z);
    }

    public static void matrix4x4(int n) {
        System.out.println("enter matrix 4x4 with answers");
        Scanner scan = new Scanner(System.in);
        int[][] a = new int[n][n + 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n + 1; j++) {
                a[i][j] = scan.nextInt();
            }
        }
        int determinantA = 0;
        int determinantA1 = 0;
        int determinantA2 = 0;

        int determinantB = 0;
        int determinantB1 = 0;
        int determinantB2 = 0;

        int determinantC = 0;
        int determinantC1 = 0;
        int determinantC2 = 0;

        int determinantD = 0;
        int determinantD1 = 0;
        int determinantD2 = 0;

        int determinantAA = 0;
        int determinantBB = 0;
        int determinantCC = 0;
        int determinantDD = 0;

        int determinant = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n + 1; j++) {
                determinantA = ((a[1][1] * (a[2][2] * a[3][3] - a[2][3] * a[3][2])));
                determinantA1 = ((a[1][2] * (a[2][1] * a[3][3] - a[2][3] * a[3][1])));
                determinantA2 = ((a[1][3] * (a[2][1] * a[3][2] - a[2][2] * a[3][1])));
                determinantAA = (a[0][0] * (determinantA - determinantA1 + determinantA2));
                // //////////////////////////////////////////////

                determinantB = ((a[1][0] * (a[2][2] * a[3][3] - a[2][3] * a[3][2])));
                determinantB1 = ((a[1][2] * (a[2][0] * a[3][3] - a[2][3] * a[3][0])));
                determinantB2 = ((a[1][3] * (a[2][0] * a[3][2] - a[2][2] * a[3][0])));
                determinantBB = (a[0][1] * (determinantB - determinantB1 + determinantB2));
                // ///////////////////////////////////////////////

                determinantC = ((a[1][0] * (a[2][1] * a[3][3] - a[2][3] * a[3][1])));
                determinantC1 = ((a[1][1] * (a[2][0] * a[3][3] - a[2][3] * a[3][0])));
                determinantC2 = ((a[1][3] * (a[2][0] * a[3][1] - a[2][1] * a[3][0])));
                determinantCC = (a[0][2] * (determinantC - determinantC1 + determinantC2));
                // //////////////////////////////////////////////

                determinantD = ((a[1][0] * (a[2][1] * a[3][2] - a[2][2] * a[3][1])));
                determinantD1 = ((a[1][1] * (a[2][0] * a[3][2] - a[2][2] * a[3][0])));
                determinantD2 = ((a[1][2] * (a[2][0] * a[3][1] - a[2][1] * a[3][0])));
                determinantDD = (a[0][3] * (determinantD - determinantD1 + determinantD2));
            }
        }
        determinant = determinantAA - determinantBB + determinantCC - determinantDD;
        //dx /////////////////////////////
        int dx = 0;
        int dx1 = 0;
        int dx2 = 0;
        int dx3 = 0;
        int dxx = 0;

        int dy = 0;
        int dy1 = 0;
        int dy2 = 0;
        int dy3 = 0;
        int dyy = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n + 1; j++) {
                dx1 = (a[1][1] * (a[2][2] * a[3][3] - a[2][3] * a[3][2]));
                dx2 = (a[1][2] * (a[2][1] * a[3][3] - a[2][3] * a[3][1]));
                dx3 = (a[1][3] * (a[2][1] * a[3][2] - a[2][2] * a[3][1]));
                dxx = a[0][4] * (dx1 - dx2 + dx3);
                dx = dxx / determinant;
                // /////////////////


            }
        }
        System.out.println(dx);
    }
}
/*
  1 0 4 -6 1
  2 5 0 3 1
  -1 2 3 5 1
  2 1 -2 3 1
 */

