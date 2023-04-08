import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        double grade_1 = 0;
        double grade_2 = 0;
        double grade_3 = 0;
        double grade_4 = 0;
        boolean validInput = false;

        JOptionPane.showMessageDialog(null, "Informe suas notas bimestrais");
        while (!validInput) {
            String input_1 = JOptionPane.showInputDialog(null, "1º nota");
            String input_2 = JOptionPane.showInputDialog(null, "2º nota");
            String input_3 = JOptionPane.showInputDialog(null, "3º nota");
            String input_4 = JOptionPane.showInputDialog(null, "4º nota");
            try {
                grade_1 = Double.parseDouble(input_1);
                grade_2 = Double.parseDouble(input_2);
                grade_3 = Double.parseDouble(input_3);
                grade_4 = Double.parseDouble(input_4);
                validInput = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida!");
            }
        }
        double gradePointAverage = (grade_1 + grade_2 + grade_3 + grade_4) / 4;
        JOptionPane.showMessageDialog(null, "Boletim "
        + "\n1ª nota: " + grade_1
        + "\n2ª nota: " + grade_2
        + "\n3ª nota: " + grade_3
        + "\n4ª nota: " + grade_4
        + "\n————————"
        + "\nMédia: " + gradePointAverage);
    }
}