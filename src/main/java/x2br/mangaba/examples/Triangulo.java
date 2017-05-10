/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package x2br.mangaba.examples;

/**
 *
 * @author Marco Antonio de Carvalho <marcarvalho@gmail.com>
 */
public class Triangulo {

    private int a, b, c;

    public Triangulo(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String retornarTipo() {

// erro de lógica
        if ((this.a == 0) && (this.b == 0) && (this.c == 0)) {
            return "Todos os lados Nulos";
        }

        if ((this.a == 0) || (this.b == 0) || (this.c == 0)) // Erro no retorno
        {
            return "Lado Nulo";
        }

        if ((this.a < 0) || (this.b < 0) || (this.c < 0)) {
            return "Lado Negatívo";
        }

        if ((this.a == this.b) && (this.b == this.c)) {
            return "Equilátero";
        }

        if (((this.a != this.b) && (this.b == this.c))
                || ((this.a == this.b) && (this.b != this.c))
                || ((this.a == this.c) && (this.b != this.c))) // Erro no retorno
        {
            return "Isósceles";
        }

        if ((this.a + this.b == this.c)
                || (this.b + this.c == this.a)
                || (this.c + this.a == this.b)) {
            return "Soma dos dois lados igual a terceiro";
        }

        if ((this.a + this.b < this.c)
                || (this.b + this.c < this.a)
                || (this.c + this.a < this.b)) {
            return "Soma dos dois lados menor que a terceiro";
        }

        if ((this.a != this.b) && (this.a != this.c)) {
            return "Escaleno";
        }

        return null;
    }
}
