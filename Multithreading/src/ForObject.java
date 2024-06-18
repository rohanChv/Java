public class ForObject {
    public void loop(){
        for(int i=0;i<1000;i++){
            System.out.print(i*123+" ["+Thread.currentThread().getName()+"],");
        }
    }
}
