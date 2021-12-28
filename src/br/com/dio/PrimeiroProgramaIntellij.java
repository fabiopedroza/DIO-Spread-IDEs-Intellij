package br.com.dio;

// atalhos main (enter)
// sout -> System.out.println
// ctrl + shift + f10 - add configuration
// shift + f10 - run (roda o programa)
// ctrl + shift + / comenta todas as linhas /* */
// shift + / comenta linha a linha
// alt + enter faz o import da biblioteca
// ctrl + y apaga a linha
// ctrl + d duplica a linha
// shift + f6 -> refactorar / alterar o nome
// shift + f12 - expande a a tela
// ctrl + alt + l

import br.com.dio.model.Gato;

public class PrimeiroProgramaIntellij {
    public static void main(String[] args) {

        Gato gato = new Gato();
        System.out.println(gato);
        System.out.println(gato);
        System.out.println(gato);

/*
        int a = 5;
        int b = 3;
        System.out.println("Hello World!!! " + (a + b));
*/


    }
}
