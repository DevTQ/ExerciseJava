import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[100];
        String s1 = new String();
        System.out.print("Nhập vào chuỗi số : ");
        s1 = sc.nextLine();
        String [] s2 = new String[100];
        s2 = s1.split(",");
        for(int i = 0; i < s2.length; i++) {
            a[i] = Integer.parseInt(s2[i]);
        }
        int sum = 0;
        for(int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.print("Tổng của tất cả các số : " + sum);
        sc.close();
    }
}
