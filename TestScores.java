import javax.swing.JOptionPane;

public class TestScores {
    public static void main(String[] args) {
        int soLuongDiem = Integer.parseInt(JOptionPane.showInputDialog("enter the number of points"));
        double[] Scores = new double[soLuongDiem];
        Scores ts = new Scores(Scores);
        try {
            JOptionPane.showMessageDialog(null, ts.giaTriTrungBinh(Scores, soLuongDiem));
    }catch(IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    
}
