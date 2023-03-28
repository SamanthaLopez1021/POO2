package Principal;
import java.util.Scanner;
import Salud.Persona;
import Salud.Empleado;

public class Inicio {
    /*----------------RETO1--------------------
    public static void main(String[] args) {
        Persona Datos = new Persona();
        Datos.pedirDatos();
        Datos.mostrarPersona();
        Datos.calcularImc();
        Datos.mayorEdad();
        
    }*/
    /*-----------RETO2-------------------------------------------
    public static void main(String[] args) {
        double peso,estatura;
        Scanner lectura=new Scanner(System.in);
        Persona Datos=new Persona();
        System.out.print("Ingrese su peso en kg");
        peso=lectura.nextDouble();
        System.out.print("Ingrese su estatura en mts");
        estatura=lectura.nextDouble();
        
        Datos.pedirDatos();
        Datos.mostrarPersona();
        Datos.calcularImc(peso,estatura);
        Datos.mayorEdad();
        lectura.close();
        
    }*/
    public static void main(String[] args) {
        String Cargo,Departamento;
        int valorHora,horasTrabajadas;
        Scanner lectura=new Scanner(System.in);
        Persona Datos=new Persona();
        
       
        Datos.pedirDatos();
        System.out.println("Ingrese el cargo del empleado");
        Cargo=lectura.next();
        System.out.println("Ingrese el valor por hora");
        valorHora=lectura.nextInt();
        System.out.println("Ingrese las horas trabajadas del empleado");
        horasTrabajadas=lectura.nextInt();
        System.out.println("Ingrese el departamento");
        Departamento=lectura.next();
        
        Empleado Datos1=new Empleado(Datos.getTipoDoc(),Datos.getDocumento(),Datos.getNombre(),Datos.getEdad(),Datos.getSexo(),Cargo,valorHora,horasTrabajadas,Departamento);
        Datos1.mostrarEmpleado();
        Datos1.calcularHonorarios();
        lectura.close();
        
    }
    
}
