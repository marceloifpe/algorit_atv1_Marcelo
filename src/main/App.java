package main;

public class App {

    public static int encontre(int[] arrayOrdenado, int num) {
        for (int i = 0; i < arrayOrdenado.length; i++) {
            if (arrayOrdenado[i] == num) {
                return 1;
            }
            if (arrayOrdenado[i] > num) {
                return 0;
            }
        }
        return 0;
    }

    public static int maior(int[] arrayDesordenado) {
        if (arrayDesordenado.length == 0) {
            return -1; // Retorna -1 se o array estiver vazio.
        }

        int max = arrayDesordenado[0];
        for (int i = 1; i < arrayDesordenado.length; i++) {
            if (arrayDesordenado[i] > max) {
                max = arrayDesordenado[i];
            }
        }

        return max;
    }
    public static Double parMaisProximo(Integer[][] pares) {
        if (pares.length < 2) {
            return null; // Retorna null se não houver pelo menos 2 pontos.
        }

        double distanciaMinima = Double.MAX_VALUE;

        for (int i = 0; i < pares.length; i++) {
            for (int j = i + 1; j < pares.length; j++) {
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


    public static void main(String[] args) {
        // Exemplo de teste do método encontre
        //teste1
        int[] arrayOrdenado = {1, 2, 3, 4, 5};
        int valorProcurado = 3;
        //teste2
        //  int[] arrayOrdenado = {1, 2, 3};
        // int valorProcurado = 3;
           //teste3
        //  int[] arrayOrdenado = {1, 2, 3};
        // int valorProcurado = 7;
           //teste4
        //  int[] arrayOrdenado = {1, 2, 7, 3};
        // int valorProcurado = 7;
           //teste5
        //  int[] arrayOrdenado = {};
        // int valorProcurado = 7;
        int resultadoEncontre = encontre(arrayOrdenado, valorProcurado);

        if (resultadoEncontre == 1) {
            System.out.println("\n Valor encontrado na lista: " + valorProcurado);
        } else {
            System.out.println("\n Valor não encontrado na lista: ");
        }

        // método maior
        int[] arrayDesordenado = {5, 2, 30, 4, 5};
        int resultadoMaior = maior(arrayDesordenado);
        System.out.println("Maior número da lista: " + resultadoMaior);

                // Teste do método parMaisProximo
        Integer[][] pontos = {
            {2, 4},
            {5, 9},
            {1, 3},
            {8, 2},
            {6, 7}
        };
        Double resultadoParMaisProximo = parMaisProximo(pontos);
        System.out.println("Resultado do parMaisProximo: " + resultadoParMaisProximo);
    }
}

