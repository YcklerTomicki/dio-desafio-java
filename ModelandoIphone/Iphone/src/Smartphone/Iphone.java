package Smartphone;
import Smartphone.Funcionalidades.FuncionalidadesGerais;

public class Iphone{
    public static void main(String[] args){
    FuncionalidadesGerais iPhone = new FuncionalidadesGerais();


System.out.println("======Aparelho Telefonico======");
iPhone.ligar("992239715");
iPhone.atender();
iPhone.iniciarCorreioVoz();

System.out.println("======Reprodutor Musical======");
iPhone.tocar();
iPhone.pausar();
iPhone.selecionarMusica("Dormi na praça");

System.out.println("======Navegador Internet======");
iPhone.exibirPagina("www.google.com");
iPhone.atualizarPagina();
iPhone.atualizarPagina();

    }
}