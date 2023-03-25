import javax.swing.JOptionPane;

public class imcDaniela {
    public static void main(String[] args) {
        double pesoEnKg = Double.parseDouble(JOptionPane.showInputDialog("Escriba su peso en kilogramos"));

        double estaturaEnMetros =  Double.parseDouble(JOptionPane.showInputDialog("Escriba altura en Metros"));

        double imc = pesoEnKg / (Math.pow(estaturaEnMetros, 2));

        if (imc < 18.5){
            JOptionPane.showMessageDialog(null,"Su indice de masa corporal está bajo");
        }else if(imc >= 18.5 && imc <= 24.9){
            JOptionPane.showMessageDialog(null,"Su indice de masa corporal esta bien.");
        }else if(imc >= 25 && imc < 30){
            JOptionPane.showMessageDialog(null,"Usted tiene en sobrepeso");
        }else {
            JOptionPane.showMessageDialog(null,"su indice de masa corporal es demaciado alto");
        }

    }
}
