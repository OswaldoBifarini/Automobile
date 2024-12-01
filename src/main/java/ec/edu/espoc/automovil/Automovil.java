package ec.edu.espoc.automovil;

import java.awt.Color;

public class Automovil {
    // Atributos del carro
    private String marcaCarro;
    private int modeloCarro;
    private double motorCarro;
    private TipoCombustible tipoCombustible;
    private TipoAutomovil tipoCarro;
    private int cuantasPuertas;
    private int numeroAsientos;
    private double maximaVelocidad;
    private Color color;
    private double velocidadActual;

    // Constructores ddl carro
    public Automovil(String marca, int modelo, double motor, TipoCombustible tipoCombustible, 
                     TipoAutomovil tipoAutomovil, int numeroPuertas, int cantidadAsientos, 
                     double velocidadMaxima, Color color) {
        this.marcaCarro = marca;
        this.modeloCarro = modelo;
        this.motorCarro = motor;
        this.tipoCombustible = tipoCombustible;
        this.tipoCarro = tipoAutomovil;
        this.cuantasPuertas = numeroPuertas;
        this.numeroAsientos = cantidadAsientos;
        this.maximaVelocidad = velocidadMaxima;
        this.color = color;
        this.velocidadActual = 0; // Velocidad inicial
    }

    // Métodos Getters y Setters del carro
    public String getMarca() { return marcaCarro; }
    public void setMarca(String marca) { this.marcaCarro = marca; }

    public int getModelo() { return modeloCarro; }
    public void setModelo(int modelo) { this.modeloCarro = modelo; }

    public double getMotor() { return motorCarro; }
    public void setMotor(double motor) { this.motorCarro = motor; }

    public TipoCombustible getTipoCombustible() { return tipoCombustible; }
    public void setTipoCombustible(TipoCombustible tipoCombustible) { this.tipoCombustible = tipoCombustible; }

    public TipoAutomovil getTipoAutomovil() { return tipoCarro; }
    public void setTipoAutomovil(TipoAutomovil tipoAutomovil) { this.tipoCarro = tipoAutomovil; }

    public int getNumeroPuertas() { return cuantasPuertas; }
    public void setNumeroPuertas(int numeroPuertas) { this.cuantasPuertas = numeroPuertas; }

    public int getCantidadAsientos() { return numeroAsientos; }
    public void setCantidadAsientos(int cantidadAsientos) { this.numeroAsientos = cantidadAsientos; }

    public double getVelocidadMaxima() { return maximaVelocidad; }
    public void setVelocidadMaxima(double velocidadMaxima) { this.maximaVelocidad = velocidadMaxima; }

    public Color getColor() { return color; }
    public void setColor(Color color) { this.color = color; }

    public double getVelocidadActual() { return velocidadActual; }
    public void setVelocidadActual(double velocidadActual) { this.velocidadActual = velocidadActual; }

    // Métodos funcionales para el carro 
    public void acelerar(double incremento) {
        if (velocidadActual + incremento > maximaVelocidad) {
            System.out.println("No puedes superar la velocidad máxima: " + maximaVelocidad + " km/h.");
        } else {
            velocidadActual += incremento;
            System.out.println("Velocidad actual: " + velocidadActual + " km/h.");
        }
    }

    public void desacelerar(double decremento) {
        if (velocidadActual - decremento < 0) {
            System.out.println("No puedes desacelerar a una velocidad negativa.");
        } else {
            velocidadActual -= decremento;
            System.out.println("Velocidad actual: " + velocidadActual + " km/h.");
        }
    }

    public void frenar() {
        velocidadActual = 0;
        System.out.println("El automóvil se ha detenido.");
    }

    public double calcularTiempoLlegada(double distancia) {
        if (velocidadActual == 0) {
            System.out.println("El automóvil está detenido. No se puede calcular el tiempo de llegada.");
            return -1;
        }
        double tiempo = distancia / velocidadActual;
        System.out.println("Tiempo estimado de llegada: " + tiempo + " horas.");
        return tiempo;
    }

    public void mostrarAtributos() {
        System.out.println("Marca del carro: " + marcaCarro);
        System.out.println("Modelodel carro: " + modeloCarro);
        System.out.println("Motor del carro: " + motorCarro + "L");
        System.out.println("Tipo de Combustible del carro: " + tipoCombustible);
        System.out.println("Tipo de Carro: " + tipoCarro);
        System.out.println("Número de Puertas del carro: " + cuantasPuertas);
        System.out.println("Cantidad de Asientos del carro: " + numeroAsientos);
        System.out.println("Velocidad Máxima del carro: " + maximaVelocidad + " km/h");
        System.out.println("Color del carro: " + color);
        System.out.println("Velocidad Actual del carro: " + velocidadActual + " km/h");
    }

    // Método Main para el carro
    public static void main(String[] args) {
        // Crear un objeto Automovil
        Automovil auto = new Automovil("CHEVROLET CAMARO", 2016, 6.2, TipoCombustible.GASOLINE, 
                                       TipoAutomovil.CITY, 4, 5, 180, Color.BLACK);
                                      


        // Operaciones para el carro
        auto.mostrarAtributos();
        auto.setVelocidadActual(100);
        System.out.println("Velocidad inicial del: " + auto.getVelocidadActual() + " km/h.");

        auto.acelerar(20);
        auto.desacelerar(50);
        auto.frenar();

        auto.calcularTiempoLlegada(500);
    }
}


    
