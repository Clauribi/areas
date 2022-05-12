package com.company;

public class Circulo extends Figuras {
    public Circulo(int altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow((this.altura/2), 2);
    }

    public double calcularPerimetro() {
        return Math.PI * 2 * (this.altura/2);
    }
}


