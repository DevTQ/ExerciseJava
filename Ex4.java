public class Ex4 {
    public Ex4(String s) {
    }

    public int Vowels(String s) {
        int vcount = 0;
        s.toLowerCase();
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == 'u'|| ch == 'e' || ch == 'o' || ch == 'a' || ch == 'i') {
                vcount++;
            }
        }
        return vcount;
    }

    public int Consonants(String s) {
        int ccount = 0;;
        s = s.toLowerCase();
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if((ch >= 'a' && ch <= 'z') && (ch != 'u'&& ch != 'e' && ch != 'o' && ch != 'a' && ch != 'i')) {
                ccount++;
            }
        }
        return ccount;
    }
}