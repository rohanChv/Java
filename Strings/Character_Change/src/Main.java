import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the String");
        Scanner sc=new Scanner(System.in);
        String inputString=sc.nextLine();
        char[] inputChar=inputString.toCharArray();
        System.out.println("Enter the Char to Capitalize/REduce");
        String character=sc.next();
        char inputCharacter=character.charAt(0);
        for(int i=0;i<inputChar.length;i++){
            if(inputChar[i]==inputCharacter){
                if(inputCharacter>='a'&&inputCharacter<='z'){
                    char d=inputCharacter;
                    d-=32;
                    inputChar[i]=d;
                    continue;
                }
                if(inputCharacter>='A'&&inputCharacter<='Z'){
                    char d=inputCharacter;
                    d+=32;
                    inputChar[i]=d;
                }
            }
        }
        System.out.println(String.valueOf(inputChar));
    }
}