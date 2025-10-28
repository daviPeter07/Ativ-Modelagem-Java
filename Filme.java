public class Filme {
  String titulo;
  String genero;
  int duracao;
  int anoLancamento;

  // Getter e Setter de titulo
  public String getTitulo() {
    return titulo;
  }
  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  // Getter e Setter de genero
  public String getGenero() {
    return genero;
  }
  public void setGenero(String genero) {
    this.genero = genero;
  }

  // Getter e Setter de duracao
  public int getDuracao() {
    return duracao;
  }
  public void setDuracao(int duracao) {
    this.duracao = duracao;
  }

  // Getter e Setter de anoLancamento
  public int getAnoLancamento() {
    return anoLancamento;
  }
  public void setAnoLancamento(int anoLancamento) {
    this.anoLancamento = anoLancamento;
  }

  public void exibirInfo() {
    System.out.println("Titulo: " + titulo);
    System.out.println("Genero: " + genero);
    System.out.println("Duracao: " + duracao);
    System.out.println("Ano de lançamento: " + anoLancamento);
  }
}