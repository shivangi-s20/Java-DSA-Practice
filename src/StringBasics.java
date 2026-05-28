import java.util.Scanner;

public class StringBasics {
    //Practice question of string
    static int getVowelCount(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'A' || ch == 'I' || ch == 'E' || ch == 'O' || ch == 'U') {
                count++;
            }
        }
        return count;
    }
        public static void main(String[] args){
            String str = "SHIVANGI";
            System.out.println(getVowelCount(str));
//    static void printString(String str) {
//        char[] arr = str.toCharArray();
//        int len = arr.length;
//        return len;
//    }

//        public static void main(String[] args) {
//        String str = "SHIVI";
//        printString(str);
//    static void printString(String str) {
//        int n = str.length();
//        for (int i = 0; i < n; i++) {
//            System.out.println(str.charAt(i));
//        }
//    }
//
//    public static void main(String[] args) {
//        String str = "SHIVI";
//        printString(str);

//    public static void main(String[] args) {
//        String name = "Shivangi";
//        char[] crr = name.toCharArray();
//        for(char cr : crr){
//            System.out.println("Value of char : "+cr);
//        }
//        String firstName = "Shivangi";
//        String LastName = new String("Srivastava");
//        System.out.println(firstName + " "+ LastName );
//        System.out.println(firstName.length());
//        System.out.println(LastName.charAt(4));
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Provide the string content: ");
//        String str = sc.nextLine();
//        System.out.println("Value of nextLine: " + str);
//        System.out.println("Provide the string content: ");
//        String str2 = sc.next();
//        System.out.println("Value of nextLine: " + str2);
    }
}

