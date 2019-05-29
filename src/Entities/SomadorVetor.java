package Entities;

import java.util.ArrayList;
import java.util.List;

public class SomadorVetor implements SomadorEsperado {
    private SomadorExistente somador = new SomadorExistente();

    @Override
    public int somaVetor(int[] vetor) {
        int soma = 0;
        List<Integer> aux = new ArrayList<>();

        for (int i : vetor) {
            aux.add(i);
        }

        soma = somador.somaLista(aux);

        return soma;
    }
}
