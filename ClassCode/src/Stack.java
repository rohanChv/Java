public class Stack {
    int tos=-1;
    int[] stack= new int[10];
    Stack(){
        int tos=-1;
    }
    int pop(){
        return stack[tos--];
    }
    void push(int a){
        tos++;
        if(tos>9){
            System.out.println("OverFlow");
        }
        else{
            stack[tos]=a;
        }
    }
}
