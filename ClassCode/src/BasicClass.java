public class BasicClass {
    public static void main(String[] args) {
        Box firstBox=new Box();
        firstBox.depth=100;
        firstBox.height=20;
        firstBox.width=30;

        System.out.println(firstBox.depth* firstBox.height*firstBox.width);
    }
}
