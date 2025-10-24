public class PotenciaDeDois {

    public static void main(String[] args) {

        //System.out.println(Potencia(3 ));
        System.out.println(PotenciaRecursiva(-4.0));
    }


    public static Double Potencia(int n) {

        Double resultado = 1.0;

        if (n >= 0)
            for (int i = 0; i < n; i++) {
                resultado = resultado * 2;
            }

        else {
            for (int i = 0; i > n; i--) {
                resultado = resultado * 2;
            }
            resultado = (1 / resultado);
        }
        return resultado;
    }


    public static Double PotenciaRecursiva(Double n) {

        if (n == 0) {
            return 1.0;
        }

        if (n > 0) {
            return PotenciaRecursiva(n - 1) * 2;

        } else {
            return PotenciaRecursiva(n + 1) * 0.5;
        }
    }
}
