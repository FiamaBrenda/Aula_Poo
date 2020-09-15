/*

1) Um programa capaz de imprimir todos os números pares em um intervalo de números informado pelo usuário

 */
package basico;

import javax.swing.JOptionPane;

/**
  @author Fiama
 */
public class NewClass {
     public static void main(String[] args) {
        	
	try {
            int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número: "));
            int nume = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite outro número: "));
            
                if(nume>num){
                    int x = num;
                    num = nume;
                    nume = x;
                }

                    while(num > nume){
                        if(num%2 == 0){
                        JOptionPane.showMessageDialog(null,+num);
                        }
                        num--;
                    }
	 } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Ocorreu o seguinte erro na execução do programa:  " + e);
                 
         }
    }
}


