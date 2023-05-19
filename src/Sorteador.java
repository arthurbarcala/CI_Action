public class Sorteador {
    private int numero;
    public static boolean advinhar( int num ) {
        if ( num > 0 && num < 11 ) {
            return num == (int) ((Math.random()* 9) + 1);
        }
        return false;
    }
}
