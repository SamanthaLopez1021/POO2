package Juego;

import java.util.Random;
import java.util.Scanner;

public class Carisellazo implements Juego{
    private String Jugador;
    private int Opcion;
    private int Moneda;
    Scanner lectura=new Scanner(System.in);
    public void iniciar(){
        System.out.println("Ingrese su nombre para iniciar a jugar");
        Jugador=lectura.next();
    }
    public void jugar() {
        System.out.println(Jugador+"Elija una opcion para jugar \n1.Cara\n2.Sello");
        Opcion=lectura.nextInt();
        Random aleatorio =new Random();
        Moneda=aleatorio.nextInt(2)+1;

       
    }
    public void finalizar() {
        if (Opcion==1 && Moneda==1) {
            System.out.println("Cayo cara, Ganaste");
            
        }
        else if (Opcion==1 && Moneda==2) {
            System.out.println("Cayo sello, Perdiste");
        }
        else if(Opcion==2 && Moneda==2){
            System.out.println("Cayo sello, Ganaste");
        }
        else if (Opcion==2 && Moneda==1) {
            System.out.println("Cayo cara,Perdiste");
        }
        else {
            System.out.println("Opcion invalida");
        }
        
        
       
    }
}
