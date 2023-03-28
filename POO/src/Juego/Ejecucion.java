package Juego;

import java.util.Scanner;

public class Ejecucion {
    public static void main(String[] args) {
        int O;
        Scanner lectura= new Scanner(System.in);
        System.out.println("que juego desea jugar \n1.Carisellazo \n2.Pierdra,Papel o Tijera");
        O=lectura.nextInt();
        if (O==1) {
            Carisellazo juego1 =new Carisellazo();
            juego1.iniciar();
            juego1.jugar();
            juego1.finalizar();
        }
        else if (O==2) {
            Ppt juego2= new Ppt();
            juego2.iniciar();
            juego2.jugar();
            juego2.finalizar();
            
        }
       lectura.close();
    }
    
}
