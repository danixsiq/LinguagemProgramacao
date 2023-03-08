package br.com.newton.linguagem.aula03;

import javax.xml.bind.SchemaOutputResolver;

public class Agenda {
    public static void main(String[] args){

        //Criando um objeto telefone utilizando um construtor
        //sem parâmetro padrão

        Telefone telefone = new Telefone();
        Contato contato = new Contato();
        contato.nome = "Rafaela";
        contato.telefone = "123456";
        telefone.contato = contato;
        System.out.println(telefone.contato.nome);

        contato.nome = "João";
        contato.telefone = "318989952";
        telefone.cor = "Azul";
        telefone.marca = "iPhone";
        System.out.println(telefone.marca + "   " + telefone.cor);

        contato.nome = "Carmen";
        contato.telefone =  "3189871147";
        telefone.cor = "Rosa";
        telefone.marca = "S20";
        System.out.println(telefone.marca + "   " + telefone.cor);
    }
}
