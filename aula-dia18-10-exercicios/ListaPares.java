
public class ListaPares {

    public void listar() 
    {
        int x = 0;
        while (x <= 100) {
            System.out.println(x);
            x = x + 2;
        }
    }

    public static void main(String[] args) {
        ListaPares listaPares = new ListaPares();
        listaPares.listar();
    }

}
