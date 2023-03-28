package FigurasGeometricas;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int O,Opc,i=1;
        Scanner lectura=new Scanner(System.in);
        while (i>0) {
        System.out.println("¿A que figura geometrica desea calcularle el area? \n1.Rectangulo \n2.Triangulo \n3.Circulo");
        Opc=lectura.nextInt();
    
        if (Opc==1) {
            float base;
            float altura;
            System.out.println("Ingrese la base del rectangulo");
            base=lectura.nextFloat();
            System.out.println("Ingrese la altura del rectangulo");
            altura=lectura.nextFloat();
            
            Rectangulo R =new Rectangulo(base, altura);
            R.calcularArea();
            
        }
        else if (Opc==2) {
            float base;
            float altura;
            System.out.println("Ingrese la base del triangulo");
            base=lectura.nextFloat();
            System.out.println("Ingrese la altura del triangulo");
            altura=lectura.nextFloat();
            
            Triangulo T =new Triangulo(base, altura);
            T.calcularArea();
        }
        else if (Opc==3) {
            float radio;
            System.out.println("Ingrese el radio del circulo");
            radio=lectura.nextFloat();
            Circulo C = new Circulo(radio);
            C.calcularArea();
        }
        else{
            System.out.println("Opcion invalida");
        }

        System.out.println("Desea volver a repetir el programa? \n1.Si \n2.No");
        O=lectura.nextInt();
        if (O==1) {
            i++;
            
        }
        else{
            System.out.println("Gracias por utilizar el programa");
            i=0;
        }

    }
    lectura.close();
    
}
}
