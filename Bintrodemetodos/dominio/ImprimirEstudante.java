package javacore.Bintrodemetodos.dominio;

public class ImprimirEstudante {
    public void imprimir (Estudante estudante){
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println(estudante.serie);
        for (double nota : estudante.notas) {
            System.out.print(nota + " ");
        }
        System.out.println(); // Adiciona uma quebra de linha após imprimir as notas
    }
    
}
