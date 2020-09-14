
/*
1) Um programa capaz de imprimir todos os números pares em um intervalo de números informado pelo usuário; */

import javax.swing.JOptionPane;
        
public class par {
    
    public static void main(String[] args) {
        	
	try {
            int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número: "));
            while(num > 0){
                if(num%2 == 0){
                System.out.println(num);
                }
                num--;
            }
	 } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Ocorreu o seguinte erro na execução do programa:  " + e);
                 
         }
    }
}
