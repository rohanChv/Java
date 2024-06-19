public class JoinDemo {
    public static void main(String[] args) {
       try{
           Counter firstObject=new Counter();
           Counter secondObject=new Counter();

           Thread firstThread =new Thread(firstObject,"firstThread");
           Thread secondThread=new Thread(secondObject,"secondThread");
           firstThread.start();
           firstThread.join();
           secondThread.start();
           secondThread.join();
           System.out.println("Program has ended");
       }catch (Exception e){
           e.printStackTrace();
       }
    }
}
