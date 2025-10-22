package codigodoprogama;

public class Usuario {
    private String nome;
    private String tipo;
    private String loogin;


    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public String getLoogin() {
        return loogin;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setLoogin(String loogin) {
        this.loogin = loogin;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", tipo='" + tipo + '\'' +
                ", loogin='" + loogin + '\'' +
                '}';
    }

}
