public class Filme {
  String titulo;
  String genero;
  int duracao;
  int anoLancamento;

  void exibirInfo() {
    System.out.println("Título: " + titulo);
    System.out.println("Gênero: " + genero);
    System.out.println("Duração: " + duracao + " minutos");
    System.out.println("Ano de lançamento: " + anoLancamento);
  }
}