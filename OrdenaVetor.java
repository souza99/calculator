public class OrdenaVetor {
    
    public int[] ordenaVetor(int[] vetor) {

        int[] vetorOrdenado = vetor.clone();

        for (int a = 0; a < vetorOrdenado.length; a++) {
            for (int b = 0; b < vetorOrdenado.length; b++ ) {
                if (vetorOrdenado[a] < vetorOrdenado[b]) {
                    int aux = vetorOrdenado[a];
                    vetorOrdenado[a] = vetorOrdenado[b];
                    vetorOrdenado[b] = aux;
                }
            }
        }
        
        return vetorOrdenado;
    }
}
