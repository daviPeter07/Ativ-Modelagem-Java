public class Principal {
  public static void main(String[] args) {
    Filme filme1 = new Filme();
    Filme filme2 = new Filme();

    filme1.titulo = "Matrix";
    filme1.genero = "Ficção Científica";
    filme1.duracao = 136;
    filme1.anoLancamento = 1999;

    filme2.titulo = "O Rei Leão";
    filme2.genero = "Animação";
    filme2.duracao = 118;
    filme2.anoLancamento = 1994;

    filme1.exibirInfo();
    System.out.println("--------------------------");
    filme2.exibirInfo();
  }
}
