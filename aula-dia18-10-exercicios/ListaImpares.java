public class ListaImpares {
    public void listar() {
        int x = 1;
        while (x <= 100) {
            System.out.println(x);
            x = x + 2;
        }
    }
    
    public static void main(String[] args) {
        ListaImpares listaImpares = new ListaImpares();
        listaImpares.listar();
    }


}
