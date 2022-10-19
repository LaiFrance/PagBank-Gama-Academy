public class cidades {
    public void mostrarCidades() {
        String[] cidades = {"recife","olinda","caruaru"};
        for (int i = 0; i < cidades.length; i++) {
            System.out.println(cidades[i]);
        }
    }

    public static void main(String[] args) {
        cidades c = new cidades();
        c.mostrarCidades();
    }
}


