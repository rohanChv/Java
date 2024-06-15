import static com.java.MyFirstPackage.JavaPackage.*;

public class PackageDemo {
    public static void main(String[] args) {
        int[] array=new int[20];
        printStatement();
        printStatementWithName("Champaklal Jayantilal Gada");
        for(int i=0;i<array.length;i++){
            array[i]=i+1;
        }
        printArray(array,array.length);
    }
}
