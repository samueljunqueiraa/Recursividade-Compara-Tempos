package javarecursaocomparatempos;

public class JavaRecursaoComparaTempos {

    // Método recursivo para calcular Fibonacci
    public static long fibonacciRecursivo(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
    }

    // Método iterativo para calcular Fibonacci
    public static long fibonacciIterativo(int n) {
        if (n <= 1) {
            return n;
        }
        long anterior = 0, atual = 1;
        for (int i = 2; i <= n; i++) {
            long proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }
        return atual;
    }
    


    public static void main(String[] args) {
        int numero = 45; // Número para calcular o Fibonacci
         


        // Medir o tempo de execução do método recursivo
        long tempoInicio = System.currentTimeMillis();
        long resultadoRecursivo = fibonacciRecursivo(numero);
        long tempoFim = System.currentTimeMillis();
        long tempoTotalRecursivo = tempoFim - tempoInicio;

        // Exibir resultados
        System.out.println("Fibonacci de " + numero + " (recursivo): " + resultadoRecursivo);
        System.out.println("Tempo de execução (recursivo): " + tempoTotalRecursivo + " milissegundos");
        


        // Medir o tempo de execução do método iterativo
        long tempoInicioIterativo = System.currentTimeMillis();
        long resultadoIterativo = fibonacciIterativo(numero);
        long tempoFimIterativo = System.currentTimeMillis();
        long tempoTotalIterativo = tempoFimIterativo - tempoInicioIterativo;

        // Exibir resultados
        System.out.println("Fibonacci de " + numero + " (iterativo): " + resultadoIterativo);
        System.out.println("Tempo de execução (iterativo): " + tempoTotalIterativo + " milissegundos");
    }
}
