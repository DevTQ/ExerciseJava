import java.util.Scanner;
public class demoEx4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = new String();
        System.out.print("Nhập vào chuỗi : ");
        s = sc.nextLine();
        Ex4 e = new Ex4(s);
        while (true) {
            char luachon;
            System.out.print("a. Count the number of vowels in the string\n");
            System.out.print("b. Count the number of consonants in the string\n");
            System.out.print("c. Count both the vowels and consonants in the string\n");
            System.out.print("d. Enter another string\n");
            System.out.print("e. Exit the program\n");
            System.out.print("Nhập vào lựa chọn : ");
            luachon = sc.nextLine().charAt(0);
            if(luachon == 'a') {
                System.out.println("Số lượng nguyên âm có trong chuỗi : " + e.Vowels(s));
            }else if(luachon == 'b') {
                System.out.println("Số lượng phụ âm có trong chuỗi là : " + e.Consonants(s));
            }else if(luachon == 'c') {
                System.out.println("Số lượng nguyên âm : "+ e.Vowels(s));
                System.out.println("Số lượng phụ âm : " + e.Consonants(s));
            }else if(luachon == 'd') {
                System.out.println("Nhập vào 1 chuỗi mới : ");
                s = sc.nextLine();
                e = new Ex4(s);
            }else if(luachon == 'e') {
                    break;
            }else {
                System.out.println("Bạn chỉ nhập từ (a-e)! hãy nhập lại.");
            }
        }
        sc.close();
    }
}
