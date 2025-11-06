import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        System.out.println("The length of the first string is " +str1.length());
        System.out.println("The length of the second string is " +str2.length());
        if(str1.length() == str2.length()){
            System.out.println("The length of the two strings are the same");
        }else{
            System.out.println("The length of the two strings is not the same");
        }
        if(str1.equals(str2)){
            System.out.println("Two strings are equal");
        }else{
            System.out.println("Two strings are not equal");
        }
    }
}
