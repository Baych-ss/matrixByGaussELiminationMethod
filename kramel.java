import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the size of matrix: ");
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

        determinantA = ((a[1][1] * (a[2][2] * a[3][3] - a[2][3] * a[3][2])));
        determinantA1 = ((a[1][2] * (a[2][1] * a[3][3] - a[2][3] * a[3][1])));
        determinantA2 = ((a[1][3] * (a[2][1] * a[3][2] - a[2][2] * a[3][1])));

        // //////////////////////////////////////////////
        determinantB = ((a[1][0] * (a[2][2] * a[3][3] - a[2][3] * a[3][2])));
        determinantB1 = ((a[1][2] * (a[2][0] * a[3][3] - a[2][3] * a[3][0])));
        determinantB2 = ((a[1][3] * (a[2][0] * a[3][2] - a[2][2] * a[3][0])));

        // ///////////////////////////////////////////////
        determinantC = ((a[1][0] * (a[2][1] * a[3][3] - a[2][3] * a[3][1])));
        determinantC1 = ((a[1][1] * (a[2][0] * a[3][3] - a[2][3] * a[3][0])));
        determinantC2 = ((a[1][3] * (a[2][0] * a[3][1] - a[2][1] * a[3][0])));

        // //////////////////////////////////////////////
        determinantD = ((a[1][0] * (a[2][1] * a[3][2] - a[2][2] * a[3][1])));
        determinantD1 = ((a[1][1] * (a[2][0] * a[3][2] - a[2][2] * a[3][0])));
        determinantD2 = ((a[1][2] * (a[2][0] * a[3][1] - a[2][1] * a[3][0])));


        determinantAA = (a[0][0] * (determinantA - determinantA1 + determinantA2));
        determinantBB = (a[0][1] * (determinantB - determinantB1 + determinantB2));
        determinantCC = (a[0][2] * (determinantC - determinantC1 + determinantC2));
        determinantDD = (a[0][3] * (determinantD - determinantD1 + determinantD2));

        determinant = determinantAA - determinantBB + determinantCC - determinantDD;
        //dx /////////////////////////////
        int dx = 0;

        int dx1 = 0;
        int dx2 = 0;
        int dx3 = 0;
        int dxx = 0;

        int dx11 = 0;
        int dx12 = 0;
        int dx13 = 0;
        int dxx1 = 0;

        int dx21 = 0;
        int dx22 = 0;
        int dx23 = 0;
        int dxx2 = 0;

        int dx31 = 0;
        int dx32 = 0;
        int dx33 = 0;
        int dxx3 = 0;


        int dy = 0;

        int dy1 = 0;
        int dy2 = 0;
        int dy3 = 0;
        int dyy = 0;

        int dy11 = 0;
        int dy12 = 0;
        int dy13 = 0;
        int dyy1 = 0;

        int dy21 = 0;
        int dy22 = 0;
        int dy23 = 0;
        int dyy2 = 0;

        int dy31 = 0;
        int dy32 = 0;
        int dy33 = 0;
        int dyy3 = 0;

        int dz = 0;

        int dz1 = 0;
        int dz2 = 0;
        int dz3 = 0;
        int dzz = 0;

        int dz11 = 0;
        int dz12 = 0;
        int dz13 = 0;
        int dzz1 = 0;

        int dz21 = 0;
        int dz22 = 0;
        int dz23 = 0;
        int dzz2 = 0;

        int dz31 = 0;
        int dz32 = 0;
        int dz33 = 0;
        int dzz3 = 0;


        int dw = 0;

        int dw1 = 0;
        int dw2 = 0;
        int dw3 = 0;
        int dww = 0;

        int dw11 = 0;
        int dw12 = 0;
        int dw13 = 0;
        int dww1 = 0;

        int dw21 = 0;
        int dw22 = 0;
        int dw23 = 0;
        int dww2 = 0;

        int dw31 = 0;
        int dw32 = 0;
        int dw33 = 0;
        int dww3 = 0;


        {
            dx1 = (a[1][1] * (a[2][2] * a[3][3] - a[2][3] * a[3][2]));
            dx2 = (a[1][2] * (a[2][1] * a[3][3] - a[2][3] * a[3][1]));
            dx3 = (a[1][3] * (a[2][1] * a[3][2] - a[2][2] * a[3][1]));
            // /////////////////
            dx11 = (a[1][4] * (a[2][2] * a[3][3] - a[2][3] * a[3][2]));
            dx12 = (a[1][2] * (a[2][4] * a[3][3] - a[2][3] * a[3][4]));
            dx13 = (a[1][3] * (a[2][4] * a[3][2] - a[2][2] * a[3][4]));
            // /////////////////
            dx21 = (a[1][4] * (a[2][1] * a[3][3] - a[2][3] * a[3][1]));
            dx22 = (a[1][1] * (a[2][4] * a[3][3] - a[2][3] * a[3][4]));
            dx23 = (a[1][3] * (a[2][4] * a[3][1] - a[2][1] * a[3][4]));
            // /////////////////
            dx31 = (a[1][4] * (a[2][1] * a[3][2] - a[2][2] * a[3][1]));
            dx32 = (a[1][1] * (a[2][4] * a[3][2] - a[2][2] * a[3][4]));
            dx33 = (a[1][2] * (a[2][4] * a[3][1] - a[2][1] * a[3][4]));
            // /////////////////
        }
        // DY
        {
            dy1 = (a[1][4] * (a[2][2] * a[3][3] - a[2][3] * a[3][2]));
            dy2 = (a[1][2] * (a[2][4] * a[3][3] - a[2][3] * a[3][4]));
            dy3 = (a[1][3] * (a[2][4] * a[3][2] - a[2][2] * a[3][4]));
            // /////////////////

            dy11 = (a[1][0] * (a[2][2] * a[3][3] - a[2][3] * a[3][2]));
            dy12 = (a[1][2] * (a[2][0] * a[3][3] - a[2][3] * a[3][0]));
            dy13 = (a[1][3] * (a[2][0] * a[3][2] - a[2][2] * a[3][0]));
            //  ////////////////

            dy21 = (a[1][0] * (a[2][4] * a[3][3] - a[2][3] * a[3][4]));
            dy22 = (a[1][4] * (a[2][0] * a[3][3] - a[2][3] * a[3][0]));
            dy23 = (a[1][3] * (a[2][0] * a[3][4] - a[2][4] * a[3][0]));
            // /////////////////

            dy31 = (a[1][0] * (a[2][4] * a[3][2] - a[2][2] * a[3][4]));
            dy32 = (a[1][4] * (a[2][0] * a[3][2] - a[2][2] * a[3][0]));
            dy33 = (a[1][2] * (a[2][0] * a[3][4] - a[2][4] * a[3][0]));
        }
        // DZ //////////////////////////////////
        {
            dz1 = (a[1][1] * (a[2][4] * a[3][3] - a[2][3] * a[3][4]));
            dz2 = (a[1][4] * (a[2][1] * a[3][3] - a[2][3] * a[3][1]));
            dz3 = (a[1][3] * (a[2][1] * a[3][4] - a[2][4] * a[3][1]));

            dz11 = (a[1][0] * (a[2][4] * a[3][3] - a[2][3] * a[3][4]));
            dz12 = (a[1][4] * (a[2][0] * a[3][3] - a[2][3] * a[3][0]));
            dz13 = (a[1][3] * (a[2][0] * a[3][4] - a[2][4] * a[3][0]));

            dz21 = (a[1][0] * (a[2][1] * a[3][3] - a[2][3] * a[3][1]));
            dz22 = (a[1][1] * (a[2][0] * a[3][3] - a[2][3] * a[3][0]));
            dz23 = (a[1][3] * (a[2][0] * a[3][1] - a[2][1] * a[3][0]));

            dz31 = (a[1][0] * (a[2][1] * a[3][4] - a[2][4] * a[3][1]));
            dz32 = (a[1][1] * (a[2][0] * a[3][4] - a[2][4] * a[3][0]));
            dz33 = (a[1][4] * (a[2][0] * a[3][1] - a[2][1] * a[3][0]));
        }
        // DW ////////////////////////////////////////////////
        {
            dw1 = (a[1][1] * (a[2][2] * a[3][4] - a[2][4] * a[3][2]));
            dw2 = (a[1][2] * (a[2][1] * a[3][4] - a[2][4] * a[3][1]));
            dw3 = (a[1][4] * (a[2][1] * a[3][2] - a[2][2] * a[3][1]));

            dw11 = (a[1][0] * (a[2][2] * a[3][4] - a[2][4] * a[3][2]));
            dw12 = (a[1][2] * (a[2][0] * a[3][4] - a[2][4] * a[3][0]));
            dw13 = (a[1][4] * (a[2][0] * a[3][2] - a[2][2] * a[3][0]));

            dw21 = (a[1][0] * (a[2][1] * a[3][4] - a[2][4] * a[3][1]));
            dw22 = (a[1][1] * (a[2][0] * a[3][4] - a[2][4] * a[3][0]));
            dw23 = (a[1][4] * (a[2][0] * a[3][1] - a[2][1] * a[3][0]));

            dw31 = (a[1][0] * (a[2][1] * a[3][2] - a[2][2] * a[3][1]));
            dw32 = (a[1][1] * (a[2][0] * a[3][2] - a[2][2] * a[3][0]));
            dw33 = (a[1][2] * (a[2][0] * a[3][1] - a[2][1] * a[3][0]));
        }



        dxx = a[0][4] * (dx1 - dx2 + dx3);
        dxx1 = a[0][1] * (dx11 - dx12 + dx13);
        dxx2 = a[0][2] * (dx21 - dx22 + dx23);
        dxx3 = a[0][3] * (dx31 - dx32 + dx33);
        dx = dxx - dxx1 + dxx2 - dxx3;

        dyy = a[0][0] * (dy1 - dy2 + dy3);
        dyy1 = a[0][4] * (dy11 - dy12 + dy13);
        dyy2 = a[0][2] * (dy21 - dy22 + dy23);
        dyy3 = a[0][3] * (dy31 - dy32 + dy33);
        dy = dyy - dyy1 + dyy2 - dyy3;

        dzz = a[0][0] * (dz1 - dz2 + dz3);
        dzz1 = a[0][1] * (dz11 - dz12 + dz13);
        dzz2 = a[0][4] * (dz21 - dz22 + dz23);
        dzz3 = a[0][3] * (dz31 - dz32 + dz33);
        dz = dzz - dzz1 + dzz2 - dzz3;

        dww = a[0][0] * (dw1 - dw2 + dw3);
        dww1 = a[0][1] * (dw11 - dw12 + dw13);
        dww2 = a[0][2] * (dw21 - dw22 + dw23);
        dww3 = a[0][4] * (dw31 - dw32 + dw33);
        dw = dww - dww1 + dww2 - dww3;

        System.out.println("determinant of matrix is: " + determinant);
        System.out.println("dx is: " + dx);
        System.out.println("dy is: " + dy);
        System.out.println("dz is: " + dz);
        System.out.println("dw is: " + dw);

        System.out.println("dx/d is: " + dx / determinant);
        System.out.println("dy/d is: " + dy / determinant);
        System.out.println("dz/d is: " + dz / determinant);
        System.out.println("dw/d is: " + dw / determinant);
    }
}
/*
  1 0 4 -6 1
  2 5 0 3 1
  -1 2 3 5 1
  2 1 -2 3 1

  -2 0 3 0 13
0 1 0 -3 0
2 3 -2 0 0
0 0 -3 2 -15


7 6	10 11 11
11 20 2 19 19
8 17 3 7 7
16 3 4 10 10

2 3 11 5 2
1 1 5 2 1
2 1 3 2 -3
1 1 3 4 -3
 */