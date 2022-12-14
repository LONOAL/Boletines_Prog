public class Main {

    final static int CUADRADO = 1;
    final static int TRIANGULO = 2;
    final static int CIRCUNFERENCIA = 3;

    public static void main(String[] args) {

        Funciones misFunciones = new Funciones();
        int opcion = misFunciones.introducirOpcion();

        switch (opcion){
            case CUADRADO:
                int lado = misFunciones.introducirNumero();
                double area = misFunciones.calcularAreaCuadrado(lado);
                misFunciones.mostrarArea(area);
            break;
            case TRIANGULO:
                int altura = misFunciones.introducirNumero();
                int base = misFunciones.introducirNumero();
                area = misFunciones.calcularAreaTriangulo(base,altura);
                misFunciones.mostrarArea(area);
            break;
            case CIRCUNFERENCIA:
                int radio = misFunciones.introducirNumero();
                area = misFunciones.calcularAreaCircunferencia(radio);
                misFunciones.mostrarArea(area);
            break;
            default:
                misFunciones.mostrarMensaje();
        }

    }
}