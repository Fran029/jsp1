package utiles;

public class UtilesGeneral {

    public boolean esPar(int numero) {
        if (numero % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }


    public double getFactorial(int num) {

        // inicializacion de variables de metodo
        double factorial;

        // es importante inicializarlo a 1, ya que multiplicará-
        factorial = 1;

        // por ejemplo: el factorial de 10 es, 10*9*8*7*6*5*4*3*2*1
        for (int i = num; i > 0; i--) {
            factorial = factorial * i;
        }

        // Retorno de factorial
        return factorial;
    }


}

