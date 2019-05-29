# 1. Adapter

## 1.2.Exercício:
Abaixo estão os códigos fonte de um cliente, uma interface para um somador que ele espera utilizar e uma
classe concreta que implementa uma soma, mas não da maneira esperada pelo cliente. Como você pode ver
abaixo, o cliente espera usar uma classe que soma inteiros em um vetor, mas a classe pronta soma inteiros
em uma lista. Crie um adaptador (dica: use Adapter de objeto) para resolver esta situação.

```
public class Cliente {
 private SomadorEsperado somador;
 private Cliente(SomadorEsperado somador) {
 this.somador = somador;
 }
 public void executar() {
 int[] vetor = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
 int soma = somador.somaVetor(vetor);
 System.out.println("Resultado: " + soma);
 }
}
public interface SomadorEsperado {
 int somaVetor(int[] vetor);
}
import java.util.List;
public class SomadorExistente {
 public int somaLista(List<Integer> lista) {
 int resultado = 0;
 for (int i : lista) resultado += i;
 return resultado;
 }
}
```
