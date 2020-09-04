import javax.swing.JOptionPane;
public class AulaPoo {
    
    public static void main(String[] args){
       int v1, v2, v3;
       v1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o 1 número"));
       v2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o 2 número"));
       v3 = Integer.parseInt(JOptionPane.showInputDialog("Informe o 3 número"));
       if((v1 <= v2) &&(v1 <= v3)){  
         if(v2 <= v3){
            JOptionPane.showMessageDialog(null,"Ordem crescente "+v1+" - "+v2+" - "+v3);
         } else{
            JOptionPane.showMessageDialog(null,"Ordem crescente "+v1+" - "+v3+" - "+v2);
         }
       }else if((v2 <= v1)&& (v2 <= v3)){
          if(v1 <= v3){
            JOptionPane.showMessageDialog(null,"Ordem crescente "+v2+" - "+v1+" - "+v3);  
          }else{
            JOptionPane.showMessageDialog(null,"Ordem crescente "+v2+" - "+v3+" - "+v1);  
          }
       }else if(v1 <= v3){
            JOptionPane.showMessageDialog(null,"Ordem crescente "+v3+" - "+v1+" - "+v2); 
       }else{
            JOptionPane.showMessageDialog(null,"Ordem crescente "+v3+" - "+v2+" - "+v1);
       }
    }
}