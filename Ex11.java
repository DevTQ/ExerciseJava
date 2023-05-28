import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str[] = new String[4];
        double sum[] = new double[4];
        File f = new File("SalesData.txt");
        try {
            // ép đường dẫn và chọn kiểu chữ tiếng việt
            BufferedReader bf = Files.newBufferedReader(f.toPath(), StandardCharsets.UTF_8);
            String line = null;
            int i = 0;
            while(true) {
            line = bf.readLine();
            if(line == null) {
                break;
            }else {
                //System.out.println(line);
            }
            str[i] = line;
            i++;
        }
        }catch(IOException e) {
            e.printStackTrace();
        }    
        for (String string : str) {
            System.out.println(string);
        }
        for(int i = 0; i < 4; i++) {
            double sum1 = 0.0;
            for(int j = 0; j < 7; j++) {
                String[] str1 = str[i].split(",");
                    sum1 += Double.parseDouble(str1[j]);
            }
            sum[i] = sum1;
        }
    while(true)
    {
        double Tong = 0.0;
        int luachon;
        System.out.print("1. The total sales for each week\n");
        System.out.print("2. The average daily sales for each week\n");
        System.out.print("3. The total sales for all of the weeks\n");
        System.out.print("4. The average weekly sales\n");
        System.out.print("5. The week number that had the highest amount of sales\n");
        System.out.print("6. The week number that had the lowest amount of sales\n");
        System.out.println("0. Exit the program");
        System.out.print("Nhập vào lựa chọn : ");
        luachon = sc.nextInt();
        switch (luachon) {
            case 1:
            for(int i = 0; i < 4; i++) {
                System.out.println("Tổng doanh số tuần thứ " + (i + 1) + " = "+ sum[i]);
            }
            break;
            case 2:
            for(int i = 0; i < 4; i++) {
                System.out.println("Trung bình doanh doanh số hàng ngày tuần thứ "+(i+1)+" = "+ (sum[i] / 7));
            }
            break;
            case 3:
            for(int i = 0; i < 4; i++) {
                Tong += sum[i];
            }
            System.out.println("Tổng doanh số các tuần = " + Tong);
            break;
            case 4:
            for(int i = 0; i < 4; i++) {
                Tong += sum[i];
                System.out.println("Trung bình doanh số các tuần = " + (Tong / 4));
            }
            break;
            case 5:
            int maxTuan = 0;
            double maxvalue = sum[0];
            for(int i = 0; i < 4; i++) {
                if(sum[i] > maxvalue) {
                    maxTuan = (i + 1);
                    break;
                }
            }
            System.out.println("Tuần có doanh số cao nhất là tuần thứ " + maxTuan);
            break;
            case 6:
            int minTuan = 0;
            double minValue = Double.MAX_VALUE;
            for(int i = 0; i < 4; i++) {
                if(sum[i] < minValue) {
                    minTuan = (i + 1);
                    break;
                }
            }
            System.out.println("Tuần có doanh số thấp nhất là tuần thứ " + minTuan);
            }
            sc.close();
        }
    }
}
