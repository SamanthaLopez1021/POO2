package FigurasGeometricas;

public class Circulo extends Figura {
    private float radio;
    
    public Circulo(float radio) {
        this.radio = radio;
    }
    
    public float getRadio() {
        return radio;
    }


    public void setRadio(float radio) {
        this.radio = radio;
    }

    public void calcularArea(){
        float area=0;
        area=(float) ((radio*radio)*(Math.PI));
        System.out.println("El area del circulo es:"+area);

    }
}


    
