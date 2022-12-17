public class Triangulos {

    public void trianguloA (int nfilas){

        int filas;
        int nveces;

        for (filas=1;filas<(nfilas+1);filas++){
            for (nveces=0;nveces<filas;nveces++){
                System.out.print("*");
            }
            System.out.println("");

        }
    }

    public void trianguloB (int nfilas){

        int filas;
        int nveces;

        for (filas=1;filas<(nfilas+1);filas++){
            for (nveces=0;nveces<((nfilas+1)-filas);nveces++){
                System.out.print(" ");
            }
            for (nveces=0;nveces<filas;nveces++){
                System.out.print("*");
            }
            System.out.println("");

        }
    }

    public void trianguloC (int nfilas){

        int filas;
        int nveces;

        for (filas=1;filas<(nfilas+1);filas++){
            for (nveces=0;nveces<(((nfilas+1)-filas));nveces++){
                System.out.print(" ");
            }
            for (nveces=0;nveces<filas;nveces++){
                System.out.print("* ");
            }
            System.out.println("");

        }
    }



}
