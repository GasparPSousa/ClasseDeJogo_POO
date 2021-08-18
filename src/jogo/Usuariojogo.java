package jogo;

public class Usuariojogo {

    private String nome;
    private String nickname;
    private int pontuacao;
    private int nivel;

    public Usuariojogo(String nome, String nickname) {
        this.nome = nome;
        this.nickname = nickname;
        this.pontuacao = 0;
        this.nivel = 1;
    }

    public String aumentarPontuacao() {
        this.pontuacao = pontuacao + 1;
        return "Sua pontuação aumentou " + pontuacao;
    }

    public String bonus(int valor) {
        this.pontuacao = pontuacao + valor;
        return "Sua pontuação aumentou devido ao bônus " + pontuacao;
    }

    public String subirNivel() {
        if(this.pontuacao > 1000) {
            this.nivel = nivel + 1;
        } else if(this.pontuacao > 2000) {
            this.nivel = nivel + 1;
        } else if(this.pontuacao > 3000) {
            this.nivel = nivel + 1;
        } else {
            return "Sua pontuação é : " + pontuacao + " Você ainda precisa aumentar a pontuação para subir de nível";
        }

        return "Seu nível subiu para Nível: " + nivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }















}
