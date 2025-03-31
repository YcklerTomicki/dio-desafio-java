package Smartphone.Funcionalidades;

public class FuncionalidadesGerais implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{

    public void pausar() {
        System.out.println("Pausando Música");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Tocando " +musica);
    }

    public void tocar() {
        System.out.println("Tocando Música");
    }

    public void atender() {
        System.out.println("Atendendo Chamada");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio de Voz");
    }

    public void ligar(String numero) {
        System.out.println("Ligando para " +numero);
    }

    public void adicionarNovaAba() {
        System.out.println("Abrindo uma nova aba");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando a página");
    }

    public void exibirPagina(String url) {
        System.out.println("Indo para " +url);
    }
}