import javax.swing.JOptionPane;

public class Scores extends IllegalArgumentException{
    private double[] Scores;
    
    public Scores(double[] scores) {
        this.Scores = scores;
    }
    public double giaTriTrungBinh(double[] Scores, int soLuongDiem) throws IllegalArgumentException {
        double sum = 0;
        for(int i = 0; i < soLuongDiem; i++) {
           Scores[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the scores "+ (i + 1)));
            if(Scores[i] < 0 || Scores[i] > 100) {
                throw new IllegalArgumentException("Ivalid " + Scores[i]);
            }
            sum += Scores[i];
        }
        return sum / soLuongDiem;
    }
}
