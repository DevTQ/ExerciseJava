import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.print("nhập vào tên tệp : ");
        s = sc.nextLine();
        sc.close();
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(s) )) {
            String line;
            // đọc đến khi nào trong tệp còn lại null
            while((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                count += words.length;
            }
        }catch(IOException e) {
            System.out.println("Không thể đọc tệp");
            e.printStackTrace();
            return;
        }
        System.out.println("Số lượng từ trong tệp : " + count);
    }
}
