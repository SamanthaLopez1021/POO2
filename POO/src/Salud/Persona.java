package Salud;
import java.util.Scanner;

//----------------- RETO 1------------------------------------------------
/*public class Persona {
    private String tipoDoc;
    private int documento;
    private String nombre;
    private double peso;
    private double estatura;
    private int edad;
    private String sexo;
    private Double Imc;

    public void pedirDatos(){
        Scanner lectura=new Scanner(System.in);
        System.out.println("Ingrese su tipo de documento");
        tipoDoc=lectura.next();
        System.out.println("Ingrese su numero de documento");
        documento=lectura.nextInt();
        System.out.println("Ingrese su nombre");
        nombre=lectura.next();
        System.out.println("Ingrese su peso en kg");
        peso=lectura.nextDouble();
        System.out.println("Ingrese su estatura en mts");
        estatura=lectura.nextDouble();
        System.out.println("Ingrese su edad");
        edad=lectura.nextInt();
        System.out.println("Ingrese su sexo");
        sexo=lectura.next();

        lectura.close();

    }

    public void mostrarPersona(){
        System.out.println("Los datos registrados son:");
        System.out.println("Tipo documento: "+tipoDoc+"\n Documento: "+documento+"\nNombre: "+nombre+"\nPeso: "+peso+"\nEstatura: "+estatura+"\nEdad: "+edad+"\nSexo: "+sexo);
    }

        public void calcularImc(){
        Imc=(peso)/(estatura*estatura);
        System.out.println("su indice de mas corporal es: "+Imc);
        if (Imc<20) {
            System.out.println("El peso esta por debajo de lo ideal");
        }
        else if (Imc >=20 && Imc <=25) {
            System.out.println("El peso es ideal");
            
        }
        else if (Imc>25) {
            System.out.println("Tiene sobrepeso");
            
        }

    }
    public void mayorEdad(){
        if (edad>=18) {
            System.out.println("Es mayor de edad");
            
        }
        else if(edad<18){
            System.out.println("Es menor de edad");

        }

    }
    -------------------------------------------------------------------
    */
/* 
-----------------------RETO 2-----------------------------------------
    public class Persona {
        private  String tipoDoc;
        private int documento;
        private String nombre;
        private int edad;
        private String sexo;
        
        public void pedirDatos(){
            Scanner lectura=new Scanner(System.in);
            System.out.println("Ingrese su tipo de documento");
            tipoDoc=lectura.next();
            System.out.println("Ingrese su numero de documento");
            documento=lectura.nextInt();
            System.out.println("Ingrese su nombre");
            nombre=lectura.next();
            System.out.println("Ingrese su edad");
            edad=lectura.nextInt();
            System.out.println("Ingrese su sexo");
            sexo=lectura.next();
    
            lectura.close();
    
        }
    
        public void mostrarPersona(){
            System.out.println("Los datos registrados son:");
            System.out.println("Tipo documento: "+tipoDoc+"\n Documento: "+documento+"\nNombre: "+nombre+"\nEdad: "+edad+"\nSexo: "+sexo);
        }
        public void mayorEdad(){
            if (edad>=18) {
                System.out.println("Es mayor de edad");
                
            }
            else if(edad<18){
                System.out.println("Es menor de edad");
    
            }
    
        }
    public double calcularImc(double peso,double estatura){
        Double Imc;
        Imc=(peso)/(estatura*estatura);
        System.out.println("Su indice de masa corporal es: "+Imc);
        if (Imc<20) {
            System.out.println("PESO BAJO");
        }
        else if (Imc >=20 && Imc <=25) {
            System.out.println("PESO IDEAL");
            
        }
        else if (Imc>25) {
            System.out.println("SOBREPESO");
            
        }
        return Imc;
    }
    -------------------------------------------------------------------------------------------------
   



} */
public class Persona {
    private  String tipoDoc;
    private int documento;
    private String nombre;
    private int edad;
    private String sexo;
    
    public Persona(){

    }
    
    public Persona(String tipoDoc, int documento, String nombre, int edad, String sexo) {
        this.tipoDoc = tipoDoc;
        this.documento = documento;
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }
    
    public String getTipoDoc() {
        return tipoDoc;
    }

    public int getDocumento() {
        return documento;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void pedirDatos(){
        Scanner lectura=new Scanner(System.in);
        System.out.println("Ingrese su tipo de documento");
        tipoDoc=lectura.next();
        System.out.println("Ingrese su numero de documento");
        documento=lectura.nextInt();
        System.out.println("Ingrese su nombre");
        nombre=lectura.next();
        System.out.println("Ingrese su edad");
        edad=lectura.nextInt();
        System.out.println("Ingrese su sexo");
        sexo=lectura.next();

        lectura.close();

    }

    public void mostrarPersona(){
        System.out.println("Los datos registrados son:");
        System.out.println("Tipo documento: "+tipoDoc+"\n Documento: "+documento+"\nNombre: "+nombre+"\nEdad: "+edad+"\nSexo: "+sexo);
    }
    

}