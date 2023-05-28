import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arrName = {"Harrison, Rose", "James, Jean", "Smith, William", "Smith, Brad"};
        String[] arrPhone = {"555-2234", "555-9098", "555-1785", "555-9224"};

        for(int i = 0; i < arrName.length; i++) {
            System.out.println(arrName[i] + " : " + arrPhone[i]);
        }

        // tìm kiếm
        System.out.print("Nhập 1 vài kí tự đầu tiên để tìm kiếm : ");
        String s = sc.next();

        for(int i = 0; i < arrName.length; i++) {
            // hàm tìm kiếm chuỗi con có trong chuỗi mẹ hay không
            if(arrName[i].contains(s)) {
                System.out.println(arrName[i] +": "+ arrPhone[i]);
            }
        }
        sc.close();
    }
}
