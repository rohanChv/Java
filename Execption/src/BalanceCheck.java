public class BalanceCheck {
    public static void main(String[] args) throws InsufficientBalanceException{
        int balance=0;
        try{
            if(balance<=0){
                throw new InsufficientBalanceException();
            }
        }catch (Exception e){
            System.out.println("error is : "+e);
        }
    }
}
