public class Main {
    public static void main(String[] args) {
        Pelicula peli = new Pelicula("El lobo de Wall Street","Martin Scorsese","mp4", "3 h", "Leonardo DiCaprio", "Margot Robbie" );
        Disco disc = new Disco("The Marshall Mathers LP", "Eminem", "mp3", "1h 12m", "Hip hop/rap" );
        System.out.println(peli.toString()+"\n"+disc.toString());
    }
}
