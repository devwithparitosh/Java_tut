import java.util.Scanner;

public class MatrixSumNotSquare {
     public static void main(String[] args){
          Scanner sc=new Scanner(System.in);

          System.out.println("Enter the Size of matrics rows :");
          int rowSize=sc.nextInt();
          System.out.println("X");
          int colSize=sc.nextInt();

          int [][]matrix1=new int[rowSize][colSize];
          int [][]matrix2=new int[rowSize][colSize];
          int [][]sumMatrix=new int[rowSize][colSize];

          System.out.println("Enter the First Matrix :");
          for (int i=0;i<rowSize;i++){
               for (int j=0;j<colSize;j++){
                    matrix1[i][j]=sc.nextInt();
               }
               System.out.println();
          }

          System.out.println("Enter the Second Matrix :");
          for (int i=0;i<rowSize;i++){
               for (int j=0;j<colSize;j++){
                    matrix2[i][j]=sc.nextInt();

               }
               System.out.println();
          }
          sc.close();

          System.out.println("Sum of Two matrix is :");
          for (int i=0;i<rowSize;i++){
               for (int j=0;j<colSize;j++){
                    sumMatrix[i][j]=matrix1[i][j] + matrix2[i][j];
                    System.out.print(sumMatrix[i][j]+" ");
               }
               System.out.println(" ");
          }

     }
}
