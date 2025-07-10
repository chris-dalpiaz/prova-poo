package Biblioteca;

import Mensagem.IMensagem;
import Usuario.UsuarioBiblioteca;

import java.util.ArrayList;

public class Biblioteca {
    ArrayList<UsuarioBiblioteca> listaUsuarios = new ArrayList<>();
    private IMensagem tipoMensagem;

    public Biblioteca(IMensagem tipoMensagem) {
        this.tipoMensagem = tipoMensagem;
    }

    public void addUsuario(UsuarioBiblioteca usuario){
        listaUsuarios.add(usuario);
        System.out.println("Adicionado o usuário " + usuario.getNome() +
                " com sucesso!\n");
    }

    public void processarMultas(){

    }

    public ArrayList getListaUsuarios() {
        return listaUsuarios;
    }

}
