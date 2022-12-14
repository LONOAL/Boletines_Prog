public class Main {
    public static void main(String[] args) {

        int nadivinar;
        int nintentos;

        Numeros obx= new Numeros();

        nadivinar=obx.pedirNumero();
        nintentos=obx.numeroIntentos();
        obx.juegoPrincipal(nadivinar,nintentos);


    }
}