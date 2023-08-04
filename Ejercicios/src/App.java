public class App {
    public static void main(String[] args) throws Exception {
        int[] array_numeros = {1,2,3,4,5};

        for(int i = array_numeros.length-1; i >= 0; i--) {
            String respuesta = "";
            for(int j = 0; j < array_numeros[i]; j++) {
                respuesta += array_numeros[i];
            }
            System.out.println(respuesta);
        };
    };
};
