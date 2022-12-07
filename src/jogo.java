public class jogo {
    public static void main(String[] args) {
        final String jogador1 = "x";
        final String jogador2 = "o";

        String[][] tabuleiroPrincipal;
        tabuleiroPrincipal = criarTabuleiro();
        System.out.println("Jogo da Velha \n");
        mostrarTabuleiro(tabuleiroPrincipal);

    }
    public static String[][] criarTabuleiro(){
        String[][] tabuleiroPrincipal = new String[4][4];
        tabuleiroPrincipal[0][0] = "# |";
        tabuleiroPrincipal[0][1] = " a |";
        tabuleiroPrincipal[0][2] = " b |";
        tabuleiroPrincipal[0][3] = " c |";
        tabuleiroPrincipal[1][0] = "1 |";
        tabuleiroPrincipal[1][1] = " _ |";
        tabuleiroPrincipal[1][2] = " _ |";
        tabuleiroPrincipal[1][3] = " _ |";
        tabuleiroPrincipal[2][0] = "2 |";
        tabuleiroPrincipal[2][1] = " _ |";
        tabuleiroPrincipal[2][2] = " _ |";
        tabuleiroPrincipal[2][3] = " _ |";
        tabuleiroPrincipal[3][0] = "3 |";
        tabuleiroPrincipal[3][1] = " _ |";
        tabuleiroPrincipal[3][2] = " _ |";
        tabuleiroPrincipal[3][3] = " _ |";

        return tabuleiroPrincipal;
    }

    public static void mostrarTabuleiro(String[][] tabuleiro1){
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                System.out.print(tabuleiro1[i][j]);
            }
            System.out.print("\n");
        }
    }

}
