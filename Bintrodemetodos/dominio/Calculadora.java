package javacore.Bintrodemetodos.dominio;

public class Calculadora {
    
    public void multiplicacao(float n1, float n2){
        System.out.println(n1 * n2);
    } 

    public void somarDoisNumeros(int n1, int n2){
        System.out.println(n1 + n2);
    }

    public double divisaoDoisNumeros(double n1, double n2){
        if (n2 != 0) {
            return n1 / n2;
        }
        System.out.println("Não existe divisão por zero!");
        return 0;
    }
}
