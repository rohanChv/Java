public class Array {
    public static void main(String[] args) {
        int[] singleDimensionalArray=new int[10];
        int[][] twoDimensionalArray=new int[5][5];

        int a=60;

        for(int i=0;i<10;i++){
            singleDimensionalArray[i]=i;
            System.out.println(singleDimensionalArray[i]);
        }
        System.out.println();

        for(int i=0;i<5;i++){
            for(int j=0;j<i+1;j++){
                twoDimensionalArray[i][j]=j;
            }
        }
        for(int i=0;i<5;i++){
            for(int j=0;j<i+1;j++){
                System.out.print(twoDimensionalArray[i][j]);
            }
            System.out.println();
            System.out.println();
        }
        //operator Just try
        System.out.println((a--+--a));
    }
}
