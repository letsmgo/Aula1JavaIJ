package br.com.zup;

public class Aula1Java {

    public static void main(String[] args) {

        System.out.println("Hello World!");
        int idadeDoUsuario = 18;
        String nomeDoUsuario = "Leticia";
        //Printando as varáveis declaradas

        System.out.print("Olá, meu nome é ");
        System.out.print(nomeDoUsuario);
        System.out.print(" e minha idade é ");
        System.out.print(idadeDoUsuario);

        //Printando de forma concatenada as variáveis

        System.out.print(" Olá, meu nome é " + nomeDoUsuario);
    }
}
