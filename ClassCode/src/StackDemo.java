public class StackDemo{
    public static void main(String[] args) {
        Stack s1=new Stack();
        for (int i=0;i<9;i++){
            s1.push(i);
        }
        for (int i=0;i<9;i++){
            System.out.println(s1.pop());
        }
    }
}
