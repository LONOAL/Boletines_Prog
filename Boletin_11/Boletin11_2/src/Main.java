

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {

        int i;
        int sum= 0;
        BigInteger prod= BigInteger.ONE;

        for(i=10;i<90;i++){
            sum=i+sum;
            prod= prod.multiply(BigInteger.valueOf(i));
        }
        System.out.println("Suma: "+sum+" Producto: "+prod);
    }
}