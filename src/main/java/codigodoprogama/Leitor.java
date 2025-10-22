package codigodoprogama;

public class Leitor extends Usuario implements Acessarbiblioteca  {

    @Override
    public void visualizarLivros(){

    }

    @Override
    public void Solicitarlivros(){
        System.out.println(this.getNome() + " solicitou um livro");
    }
}
