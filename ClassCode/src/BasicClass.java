public class BasicClass {
    public static void main(String[] args) {
        Box firstBox=new Box();
        firstBox.depth=100;
        firstBox.height=20;
        firstBox.width=30;
        ReturnDemo ret1=new ReturnDemo();
        System.out.println(firstBox.depth* firstBox.height*firstBox.width);
        System.out.println(ret1.Return());
    }
}
