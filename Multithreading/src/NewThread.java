public class NewThread implements Runnable{
    Thread t;
    NewThread(String name){
        t=new Thread(this,name);
        System.out.println("Thread "+name +" is initialized");
    }
    public void run(){
      for(int i=0;i<5;i++){
          System.out.println(i+" [ From :"+Thread.currentThread().getName()+"]");
      }
    }
}
