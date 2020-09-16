/*
 * Criar um programa que receba 4 notas e calcule a média aritmética, através de um método.
 * 
 * @author Fiama
 */
import javax.swing.JOptionPane;
public class medAritimetica {
    float nota1, nota2, nota3,nota4;
    public static float media(float nota1, float nota2, float nota3, float nota4)
    {
        float nfinal=(nota1+nota2+nota3+nota4)/4;
        return nfinal;
    }
    public static void main(String[] args){
    
        float a, b, c, d, med;
        try{
            String nota1=JOptionPane.showInputDialog(null,"Digite a nota 1: ");
            String nota2=JOptionPane.showInputDialog(null,"Digite a nota 2: ");
            String nota3=JOptionPane.showInputDialog(null,"Digite a nota 3: ");
            String nota4=JOptionPane.showInputDialog(null,"Digite a nota 4: ");
            a=Integer.parseInt(nota1);
            b=Integer.parseInt(nota2);
            c=Integer.parseInt(nota3);
            d=Integer.parseInt(nota3);
            med=media(a,b,c,d);
            JOptionPane.showMessageDialog(null, "A média é "+med);
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Ocorreu o seguinte erro na execução do programa: \n " + e);
        }
    }
}
