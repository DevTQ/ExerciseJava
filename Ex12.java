public class Ex12 {
    public static int WordCount(String str) {
        if(str == null || str.isEmpty()) {
            return 0;
        }
            String[] str2 = new String[100];
            str2 = str.split("\\s+");
            return str2.length;
    }

    public static String arrayToString(char[] data) {
        String str = String.copyValueOf(data);
        return str;
    }

    public static char mostFrequent(String str) {
        int counter[] = new int[256];
        for(int i = 0; i < str.length(); i++) {
            counter[str.charAt(i)]++;
        }
        int res = 0;
        char kt = '\0';
        for(int i = 0; i < 256; i++) {
            if(counter[i] >= res) {
                res = counter[i];
                kt = (char)(i);
        }
    }
    return kt;
}

    public static String replaceSubstring(String str1, String str2, String str3) {
        if(str1.contains(str2) == true) {
            String str4;
            str4 = str1.replace(str2, str3);
            str1 = str4;
        }
        return str1;
    }
    public static void main(String[] args) {
        String str = "the dog jumped over the fence";
        System.out.println("Số lượng từ có trong chuỗi là : " + WordCount(str));
        char ch[] = {'N', 'i', 'n', 'h', 'B', 'i', 'n','h'};
        System.out.println("Mảng kí tự sau khi chuyển thành chuỗi : " + arrayToString(ch));
        String str1 = "the dog jumped over the fence";
        String str2 = "the";
        String str3 = "that";
        System.out.println("Chuỗi sau khi thay thế : " + replaceSubstring(str1, str2, str3));
        System.out.println("kí tự xuất hiện thường xuyên nhất trong chuỗi là kí tự " + mostFrequent(str));
    }
}
