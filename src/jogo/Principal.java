package jogo;

public class Principal {

    public static void main(String[] args) {

        Usuariojogo usuario = new Usuariojogo("Procopio", "Nath");

        System.out.println(usuario.getNome());
        System.out.println(usuario.getNickname());
        System.out.println(usuario.getPontuacao());
        usuario.aumentarPontuacao();
        System.out.println(usuario.getPontuacao());
        usuario.bonus(500);
        System.out.println(usuario.getPontuacao());
        System.out.println(usuario.bonus(10));
        usuario.aumentarPontuacao();
        System.out.println(usuario.aumentarPontuacao());
        System.out.println(usuario.aumentarPontuacao());
        System.out.println(usuario.subirNivel());
        usuario.bonus(600);
        System.out.println(usuario.subirNivel());
        usuario.bonus(900);
        System.out.println(usuario.subirNivel());


    }
}
