/*Nome: Marcelo Augusto de Augusto de Barros Araújo.
 * Curso: Engenharia da Computação.
 * Professor: Waldemar.
 * Disciplina: Algoritmo e Estrutura de Dados.
 */
package main;

public class App 
{

    public static int encontre(int[] arrayOrdenado, int num) 
    {
        for (int i = 0; i < arrayOrdenado.length; i++) 
        {
            if (arrayOrdenado[i] == num) 
            {
                return 1;
            }
            if (arrayOrdenado[i] > num) 
            {
                return 0;
            }
        }
        return 0;
    }

    public static int maior(int[] arrayDesordenado) 
    {
        if (arrayDesordenado.length == 0) 
        {
            return -1; // Retorna -1 caso não tenha elemento no array.
        }

        int max = arrayDesordenado[0];
        for (int i = 1; i < arrayDesordenado.length; i++) 
        {
            if (arrayDesordenado[i] > max) 
            {
                max = arrayDesordenado[i];
            }
        }

        return max;
    }

    public static Double parMaisProximo(Integer[][] pares) 
    {
        if (pares.length < 2) 
        {
            return null; // Retorna nulo caso não tenha dois pontos no array.
        }

        double distanciaMinima = Double.MAX_VALUE;

        for (int i = 0; i < pares.length; i++) 
        {
            for (int j = i + 1; j < pares.length; j++) 
            {
                int x1 = pares[i][0];
                int y1 = pares[i][1];
                int x2 = pares[j][0];
                int y2 = pares[j][1];

                double distancia = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

                if (distancia < distanciaMinima) {
                    distanciaMinima = distancia;
                }
            }
        }

        return distanciaMinima;
    }

    public static void main(String[] args) 
    {
        // chamada do método encontre o valor solicitado no array ordenado
        // teste01
        int[] arrayOrdenado = { 1, 2, 3, 4, 5 };
        int valorProcurado = 3;
        // teste02
        // int[] arrayOrdenado = {1, 2, 3};
        // int valorProcurado = 3;
        // teste03
        // int[] arrayOrdenado = {1, 2, 3};
        // int valorProcurado = 7;
        // teste04
        // int[] arrayOrdenado = {1, 2, 7, 3};
        // int valorProcurado = 7;
        // teste05
        // int[] arrayOrdenado = {};
        // int valorProcurado = 7;
        int resultadoEncontre = encontre(arrayOrdenado, valorProcurado);

        if (resultadoEncontre == 1) 
        {
            System.out.println("Valor encontrado na lista => " + valorProcurado);
        } else {
            System.out.println("Valor não encontrado na lista. ");
        }

        // chamada do método maior número do array com números desordenados.
        // teste01
        int[] arrayDesordenado = { 1, 2, 3, 4, 5 };
        // teste02
        // int[] arrayDesordenado ={5, 2, 3, 4, 5};
        // teste03
        // int[] arrayDesordenado ={5, 2, 3, 4, 1};
        // teste04
        // int[] arrayDesordenado ={-5, -2, -3, -4, -1};
        // teste05
        // int[] arrayDesordenado ={-5};
        int resultadoMaior = maior(arrayDesordenado);
        System.out.println("Maior número da lista é => " + resultadoMaior);

        // chamada do método ponto mais próximo no vetor
        Integer[][] pontos = 
        {
                // teste01
                { 2, 4 },
                { 5, 9 },
                { 1, 3 },
                { 8, 2 },
                { 6, 7 }
                // teste02
                // {2, 4},
                // {5, 9},
                // {1, 3},
                // {8, 2},
                // {2, 4}
        };
        Double resultadoParMaisProximo = parMaisProximo(pontos);
        System.out.printf("O ponto mais próximo é => %.3f%n", resultadoParMaisProximo);

    }
}
