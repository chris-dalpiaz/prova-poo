package Usuario;

public abstract class UsuarioBiblioteca {
    protected String nome;
    protected Integer diasAtraso;


    public UsuarioBiblioteca(String nome,Integer diasAtraso) {
        this.nome = nome;
        this.diasAtraso = diasAtraso;
    }

    public abstract double calcularMulta();

    public String getResumo() {
        return nome + " atrasou " + diasAtraso + " dias.";
    }

    public String getNome() {
        return nome;
    }

    public Integer getDiasAtraso() {
        return diasAtraso;
    }
}
