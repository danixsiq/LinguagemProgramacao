package br.com.newton.linguagem.aula03;

import javax.xml.bind.SchemaOutputResolver;

public class Agenda {
    public static void main(String[] args){

        //Criando um objeto telefone utilizando um construtor
        //sem parâmetro padrão

        Telefone telefone = new Telefone();
        Contato contato = new Contato();
        contato.nome = "Rafaela";
        contato.numero = "123456";
        telefone.cor = "amarelo";
        telefone.marca = "iPhone";
        telefone.contato = contato;
        System.out.println(contato.nome + " " + telefone.cor + " " + telefone.marca);

        Telefone telefone2 = new Telefone();
        Contato contato2 = new Contato();
        contato2.nome = "João";
        contato2.numero = "318989952";
        telefone2.cor = "preto";
        telefone2.marca = "iPhone";
        telefone2.contato = contato2;
        System.out.println(contato2.nome + " " + telefone2.cor + " " + telefone2.marca);

        Telefone telefone3 = new Telefone();
        Contato contato3 = new Contato();
        contato3.nome = "Carmen";
        contato3.numero =  "3189871147";
        telefone3.cor = "preto";
        telefone3.marca = "S20";
        telefone3.contato = contato3;
        System.out.println(contato3.nome + " " + telefone3.cor + " " + telefone3.marca);

        Telefone telefone4 = new Telefone();
        Contato contato4 = new Contato();
        contato4.nome = "Juliana";
        contato4.numero =  "3189871582";
        telefone4.cor = "preto";
        telefone4.marca = "S20";
        telefone4.contato = contato4;
        System.out.println(contato4.nome + " " + telefone4.cor + " " + telefone4.marca);

        telefone.Tocar ("pagode");
        telefone.Tocar ("samba");

        telefone3.Ligar(contato2);
        telefone3.Ligar(contato4);
    }
}
