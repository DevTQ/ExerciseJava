import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhập vào 1 chuỗi : ");
    String s = sc.nextLine();
    String s1 = Quy_Cach(s);
    System.out.println("Chuỗi sau khi sửa đổi : " + s1);
    sc.close();
    }

    public static String Quy_Cach(String s) {
        StringBuilder sb = new StringBuilder(s);
        boolean flag = true;
        for(int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if(flag && Character.isLetter(ch)) {
                sb.setCharAt(i, Character.toUpperCase(ch));
                flag = false;
            }else if(ch == '.' || ch =='?' || ch == '!'){
                flag = true;
            }
        }
        return sb.toString();
    }


}