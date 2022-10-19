public class tabuada {
    public void escreveTabuada(int numero) {
        int x = 0;
        for (int i = 0; i < numero; i++) {
            x = x + 1;
            System.out.println("Tabuada do " + x);
            for (int j = 0; j < 10; j++) {
                System.out.println(x + " x " + j + " = " + (x * j));

            }
        }
    }

    public static void main(String[] args) {
        tabuada tabuada = new tabuada();
        tabuada.escreveTabuada(9);
    }
}