package JogoBet;

import java.util.Date;

public class Jogador {
    private int id;
    private String nome;
    private String apelido;
    private Date dataNascimento;
    private int numero;
    private String posicao;
    private int qualidade;
    private int cartoesAmarelo;
    private int cartoesVermelho;
    private boolean suspenso;
    
    //getters
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getApelido() {
        return apelido;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public int getNumero() {
        return numero;
    }

    public String getPosicao() {
        return posicao;
    }

    public int getQualidade() {
        return qualidade;
    }

    public int getCartoesAmarelo() {
        return cartoesAmarelo;
    }

    public int getCartoesVermelho() {
        return cartoesVermelho;
    }  

                            //usa-se '"is" para retorno dos tipos booleanos
    public boolean isSuspenso() {
        return suspenso;
    }
    
    //setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public void setQualidade(int qualidade) {
        this.qualidade = qualidade;
    }

    public void setCartoesAmarelos(int cartoesAmarelos) {
        this.cartoesAmarelo = cartoesAmarelos;
    }

    public void setSuspenso(boolean suspenso) {
        this.suspenso = suspenso;
    }

    public void setCartoesAmarelo(int cartoesAmarelo) {
        this.cartoesAmarelo = cartoesAmarelo;
    }

    public void setCartoesVermelho(int cartoesVermelho) {
        this.cartoesVermelho = cartoesVermelho;
    }
    
    //constructors
    public Jogador(){
    }

    public Jogador(int id, String nome, String apelido, Date dataNascimento, int numero, String posicao, int qualidade, int cartoesAmarelo, int cartoesVermelho, boolean suspenso) {
        this.id = id;
        this.nome = nome;
        this.apelido = apelido;
        this.dataNascimento = dataNascimento;
        this.numero = numero;
        this.posicao = posicao;
        this.qualidade = qualidade;
        this.cartoesAmarelo = cartoesAmarelo;
        this.cartoesVermelho = cartoesVermelho;
        this.suspenso = suspenso;
    }
    
    //metodos
    public boolean verificarCondicaoDeJogo(){   
        if (this.cartoesAmarelo > 3 || this.cartoesVermelho >= 1) {
            this.suspenso = false;
            return false;
        }
        this.suspenso = true;
        return true;
    }

    @Override
    public String toString() {
        return "Jogador{" + "id=" + id + ", nome=" + nome + ", apelido=" + apelido + ", dataNascimento=" + dataNascimento + ", numero=" + numero + ", posicao=" + posicao + ", qualidade=" + qualidade + ", cartoesAmarelo=" + cartoesAmarelo + ", cartoesVermelho=" + cartoesVermelho + ", suspenso=" + suspenso + '}';
    }
    
}
