package Juego;

import java.util.Random;
import java.util.Scanner;

public class Ppt implements Juego {
    private String NomJug;
    private int Opc;
    private int OpcM;
    Scanner lectura=new Scanner(System.in);
    public void iniciar(){
        System.out.println("Ingrese su nombre para iniciar a jugar");
        NomJug=lectura.next();
    }

   
    public void jugar() {
        System.out.println(NomJug+"Elija una opcion para jugar \n1.Piedra\n2.Papel\n3.Tijera");
        Opc=lectura.nextInt();
        Random aleatorio =new Random();
        OpcM=aleatorio.nextInt(3)+1;

       
    }

   
    public void finalizar() {
        if (Opc==1 && OpcM==2) {
            System.out.println("Usted eligio Piedra,la eleccion de la maquina fue Papel\nLa maquina ha ganado");
            
        }
        else if (Opc==1 && Opc==1) {
            System.out.println("Usted eligio Piedra,la eleccion de la maquina fue Piedra\nEmpate");
        }
        else if(Opc==1 && OpcM==3){
            System.out.println("Usted eligio Piedra,la eleccion de la maquina fue Tijera\nUsted ha ganado");
        }
        else if (Opc==2 && Opc==1) {
            System.out.println("Usted eligio Papel,la eleccion de la maquina fue Piedra\nUsted ha ganado");
        }
        else if(Opc==2 && OpcM==2){
            System.out.println("Usted eligio Papel,la eleccion de la maquina fue Papel\nEmpate");
        }
        else if (Opc==2 && Opc==3) {
            System.out.println("Usted eligio Papel,la eleccion de la maquina fue Tijera\nLa maquina ha ganado");
        }
        else if(Opc==3 && OpcM==1){
            System.out.println("Usted eligio Tijeta,la eleccion de la maquina fue Piedra\nLa maquina ha ganado");
        }
        else if (Opc==3 && Opc==2) {
            System.out.println("Usted eligio Tijera,la eleccion de la maquina fue Papel\nUsted ha ganado");
        }
        else if(Opc==3 && OpcM==3){
            System.out.println("Usted eligio Tijera,la eleccion de la maquina fue Tijera\nEmpate");
        }
        else {
            System.out.println("Opcion invalida");
        }
        
       
    }
    
}
