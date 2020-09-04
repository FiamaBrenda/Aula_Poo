import java.util.Scanner;
public class POO{
    public static void main (string[]args){
        Scanner input = new Scanner(System.in);
        float vol, alt, raio;
        System.out.println(" Informe o valor do raio da lata de Oléo:");
        raio = input.nextFloat();
        System.out.println(" Informe a altura da lata de óleo:");
        alt = input.nextFloat();
        vol = (float)3.14159*raio*raio*alt;
        System.out.println(vol + "é o valor do volume da lata de óleo.");
    }
}
