/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package x2br.mangaba.examples;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author Marco Antonio de Carvalho <marcarvalho@gmail.com>
 */
@RunWith(Parameterized.class)
public class TrianguloTest {

    private int a;
    private int b;
    private int c;

    private String tipo;

    public TrianguloTest(int a, int b, int c, String trianguloEsperado) {
        super();
        this.a = a;
        this.b = b;
        this.c = c;
        this.tipo = trianguloEsperado;
    }

    @Parameters
    public static Collection carregaTriangulosDeTeste() {
        return Arrays.asList(
                new Object[][]{
                    //Test0
                    {2, 9, 10, "Escaleno"},
                    //Test1
                    {20, 20, 20, "Equilátero"},
                    //Test2
                    {20, 20, 30, "Isósceles"},
                    //Test3
                    {20, 30, 20, "Isósceles"},
                    //Test4
                    {30, 20, 20, "Isósceles"},
                    //Test5
                    {0, 2, 9, "Lado Nulo"},
                    //Test6
                    {3, -2, 9, "Lado Negatívo"},
                    //Test7
                    {5, 6, 11, "Soma dos dois lados igual a terceiro"},
                    //Test8
                    {5, 11, 6, "Soma dos dois lados igual a terceiro"},
                    //Test9
                    {11, 6, 5, "Soma dos dois lados igual a terceiro"},
                    //Test10
                    {5, 6, 12, "Soma dos dois lados menor que a terceiro"},
                    //Test11
                    {0, 0, 0, "Todos os lados Nulos"},
                    //Test12
                    {5, 12, 6, "Soma dos dois lados menor que a terceiro"},
                    //Test13
                    {12, 5, 6, "Soma dos dois lados menor que a terceiro"},}
        );

    }

    @Test
    public void validaTriangulo() {
        Triangulo escalenoValido = new Triangulo(a, b, c);
        assertEquals(escalenoValido.retornarTipo(), tipo);
    }

}
