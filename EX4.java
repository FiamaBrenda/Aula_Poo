
/**
 *Criar um programa que permita a entrada de um número inteiro e retorne o seu dobro,
 *através de um método.
 * @author Fiama
 */
import javax.swing.JOptionPane;
public class metodo {
    public static int dobro(int d)
    {
        int r=d*2;
        return r;
    }
    public static void main(String[] args){
    
        int a, b;
        try{
            String d=JOptionPane.showInputDialog(null,"Digite um número: ");
            a=Integer.parseInt(d);
            b=dobro(a);
            JOptionPane.showMessageDialog(null, "O dobro é "+b);
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Ocorreu o seguinte erro na execução do programa: \n " + e);
        }
    }
    
}