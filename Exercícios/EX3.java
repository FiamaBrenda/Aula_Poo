
/*
1) Um programa capaz de imprimir todos os números pares em um intervalo de números informado pelo usuário; */

import  java.util.Scanner ;
public class par {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = input.nextInt();

        while(num > 0){
            if(num%2 == 0){
            System.out.println(num);
            }
            num--;
        }

    }
}
