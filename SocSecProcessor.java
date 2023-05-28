import javax.swing.JOptionPane;

public class SocSecProcessor {
    public static void main(String[] args) {
        String Name;
        String soSecNum;
        while (true) {
            Name = JOptionPane.showInputDialog(null,"Enter the Name : ");
            soSecNum = JOptionPane.showInputDialog(null, "Enter social security number");
            try {
                if (isValid(soSecNum))
                    JOptionPane.showMessageDialog(null, String.format("%s %s is valid.", Name, soSecNum));
            } catch (SocSecException s) {
                JOptionPane.showMessageDialog(null,s.getMessage());
            }
            String luaChon = JOptionPane.showInputDialog(null, "Do you want to continue? (Y/N) ");
            if (luaChon.equalsIgnoreCase("N")) {
                break;
            }
        }
        
    }

    public static boolean isValid(String ssn) throws SocSecException {
        if (ssn.length() != 11) {
            throw new SocSecException("wrong number of characters.");
        }
        for (int i = 0; i < ssn.length(); i++) {
            char c = ssn.charAt(i);
            if (i == 3 || i == 6) {
                if (c != '-') {
                    throw new SocSecException("dashes at wrong positions.");
                }
            } else {
                if (!Character.isDigit(c)) {
                    throw new SocSecException("contains a character that is not a digit.");
                }
            }
        }
    return true;
    }
}
