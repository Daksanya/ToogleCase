import java.util.Scanner;

public class Tooglecase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] chars = str.toCharArray();
        String s="";

        for (int i = 0; i < chars.length; i++) {
            int x=chars[i];
            x=x^(1<<5);
           s=s+(char)x;

        }
        System.out.println(s);

    }
}
