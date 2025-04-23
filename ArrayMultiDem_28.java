public class ArrayMultiDem_28 {
    public static void main(String[] args){

        int [][]num=new int[2][3];

        num[0][0]=1;
        num[0][1]=2;
        num[0][2]=3;
        num[1][0]=4;
        num[1][1]=5;
        num[1][2]=6;

        for (int i=0;i<2;i++){
            for (int j=0;j<3;j++){
                System.out.print(num[i][j]);
            }
            System.out.println();
        }
    }
}
