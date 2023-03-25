import java.util.Scanner;

public class tareaFlores {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introdusca la cantidad de dinero q tiene: ");
        double dinero = sc.nextDouble();

        int barato = (int)dinero / 70;
        

        int caro = (int)dinero / 120;
        

        System.out.println("Puedes compar "+ barato +" ramos de 70 $ pesos");

        System.out.println( "Y " + caro + " ramos de 120 $ pesos");
    }
}
