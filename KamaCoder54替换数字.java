import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.next();
        String result=solution(s);
        System.out.println(result);
    }

    public static String solution(String s)
    {
        StringBuilder builder=new StringBuilder(s);
        for(int i=0;i<builder.length();i++)
        {
            char temp=builder.charAt(i);
            if(Character.isDigit(temp))
            {
                builder.replace(i,i+1,"number");
                i+=5;
            }
        }
        return builder.toString();
    }
}