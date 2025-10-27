import java.util.Scanner;

public class Strings1 {

    public static String letterGradeToNumber(String s) {
        String result;
        switch (s.toUpperCase()) {
            case "A":
                result = "4";
                break;
            case "B":
                result = "3";
                break;
            case "C":
                result = "2";
                break;
            case "D":
                result = "1";
                break;
            case "F":
                result = "0";
                break;
            default:
                result = "invalid grade";
                break;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a letter grade: ");
        String input = sc.nextLine();
        System.out.println(letterGradeToNumber(input));
    }
}
