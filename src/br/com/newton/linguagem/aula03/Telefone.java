package br.com.newton.linguagem.aula03;

public class Telefone
{
    Contato contato;
    public String marca;
    public String cor;


    public void Tocar (String estilomusical)
    {

        if (estilomusical.equals("pagode"))
        {
            System.out.println("Só tocamos pagode");
        }
    }
    public void Ligar (Contato contato)
    {
        if (cor.equals("preto") && contato.nome.equals("Juliana"))
        {
            System.out.println ("Ligando " + contato.nome);
        }
    }



}
