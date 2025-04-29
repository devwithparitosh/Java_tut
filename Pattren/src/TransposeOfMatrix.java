//Q:-Write a Java program to input a 3x3 matrix of integers, calculate its transpose, and replace all even numbers with -1 in the transposed matrix.

import java.util.Scanner;

public class TransposeOfMatrix {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int [][]matrix=new int[3][3];
        int [][]transpose=new int[3][3];

        System.out.println("Enter the matrix :");
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                transpose[j][i]=matrix[i][j];

                if (transpose[j][i] %2==0){
                    transpose[j][i]= -1;
                }
            }
        }

        System.out.println("transpose and Modified matrix");
        for(int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(transpose[j][i]+"\t");
            }
            System.out.println();
        }

        sc.close();
    }
}
