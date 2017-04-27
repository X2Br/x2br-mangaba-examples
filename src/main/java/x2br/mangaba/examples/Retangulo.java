/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package x2br.mangaba.examples;

import x2br.mangaba.annotations.AutoImplementTheTests;

/**
 *
 * @author Marco Antonio de Carvalho <marcarvalho@gmail.com>
 */
@AutoImplementTheTests()
public class Retangulo {

        int base;
        int altura;
        int area;
        int perimetro;

        public Retangulo(int base, int altura) {
            System.out.println("Construindo base=" + base + " e altura=" + altura);
            this.base = base;
            this.altura = altura;
            this.area = base * altura;
            this.perimetro = 2 * (altura + base);
        }

        public int getBase() {
            return base;
        }

        public int getAltura() {
            return altura;
        }

        public int getArea() {
            return area;
        }

        public int getPerimetro() {
            return perimetro;
        }

        @Override
        public String toString() {
            return "Retangulo{" + "base=" + base + ", altura=" + altura + ", area=" + area + ", perimetro=" + perimetro + '}';
        }

    }
