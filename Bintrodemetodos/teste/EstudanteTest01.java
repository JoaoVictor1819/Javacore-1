package javacore.Bintrodemetodos.teste;

import javacore.Bintrodemetodos.dominio.Estudante;
import javacore.Bintrodemetodos.dominio.ImprimirEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) { 
    Estudante estudante1 = new Estudante();
    Estudante estudante2 = new Estudante();
    ImprimirEstudante impressora = new ImprimirEstudante();
    

    estudante1.nome = "Lucas";
    estudante1.idade = 12;
    estudante1.sexo = 'M';
    estudante1.serie = 7;

    estudante2.nome = "Beatriz";
    estudante2.idade = 19;
    estudante2.sexo ='F';
    estudante2.serie = 11;

    impressora.imprimir(estudante1);
    impressora.imprimir(estudante2);
    }
   
    
}
