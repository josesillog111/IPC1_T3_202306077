package Main;

public class claseAbstracta {

    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        Cuadrado cuadrado = new Cuadrado();
        
        //Calculado el area de un circulo de radio 5.5
        circulo.setRadio(5.5);
        double a=circulo.calcularArea();
        System.out.print("El área del circulo de radio 5.5 es: "+a+"\n");
        
        //Calculado el area de un cuadrado de lado 5.5
        cuadrado.setLado(5.5);
        double b =cuadrado.calcularArea();
        System.out.print("El área del cuadrado de lado 5.5 es: "+b);
    }
}
