public class Box {
    double height,width,depth;
}
class BoxDemo{
    public static void main(String[] args) {
        Box box1=new Box();
        System.out.println("Constructor test : \n width:"+box1.width+"\n height:"+box1.height+"\n depth:"+box1.depth);
        //after constructor test
        box1.width=100;
        box1.height=20;
        box1.depth=10;
        System.out.println("Volume is ="+(box1.width*box1.height*box1.depth));
    }
}
