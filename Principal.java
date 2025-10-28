public class Principal {
  public static void main(String[] args) {
    Filme filme1 = new Filme();

    //definicao de Setters
    filme1.setTitulo("Matrix");
    filme1.setGenero("Ficção Científica");
    filme1.setDuracao(136);
    filme1.setAnoLancamento(1999);

    //
    filme1.exibirInfo();
    System.out.println("Titulo do filme: " + filme1.getTitulo());
  }
}
