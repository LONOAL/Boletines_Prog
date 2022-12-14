public class Main {
    public static void main(String[] args) {

        int nadivinar;
        int nintentos;

        Numeros obx = new Numeros();

        nadivinar = obx.generarNumero();
        nintentos = obx.pedirIntentos();
        obx.juegoPrincipal(nadivinar, nintentos);


    }
}