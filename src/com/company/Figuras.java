package com.company;

public abstract class Figuras {
    protected int base;
    protected int altura;
    abstract public double calcularArea();

}
 class Main {

     public static void main(String[] args) {
         // Figura 1: rectangulo + circulo. calcular Area y perimetro
         Rectangulo figura1r = new Rectangulo(10,5);
         Circulo figura1c = new Circulo(5);
         System.out.println("El area de la figura compuesta 1 es: ");
         System.out.println(figura1r.calcularArea()+figura1c.calcularArea());
         System.out.println("El perimetro de la figura compuesta 1 es: ");
         System.out.println(figura1r.calcularPerimetro()+figura1c.calcularPerimetro());
         System.out.println();
         // Figura 2: cuadrado + 2 triangulos + semicirculo
         Cuadrado figura2cuadrado = new Cuadrado(4,4);
         Triangulo figura2triangulo = new Triangulo(4,4);
         Circulo figura2semicirculo = new Circulo(4);
         System.out.println("El area de la figura compuesta 2 es: ");
         System.out.println(figura2cuadrado.calcularArea()+(figura2triangulo.calcularArea()*2)+
                 (figura2semicirculo.calcularArea()/2));




     }
 }