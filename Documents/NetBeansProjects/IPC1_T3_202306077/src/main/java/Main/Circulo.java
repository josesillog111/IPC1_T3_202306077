package Main;

public class Circulo extends Figura {
    
    private double radio;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public Circulo() {
    }

    public Circulo(double radio, double x, double y) {
        super(x, y);
        this.radio = radio;
    }
    
    @Override
    public double calcularArea() {
        double pi = 3.1416;
        double resultado = pi*radio*radio;
        return resultado;
    }
    
}
