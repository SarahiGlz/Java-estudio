import java.util.Scanner;

public class App 
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Hola, este es mi primer programa en java");

        int variable;
        int valor1, valor2;
        System.out.println("Digite un valor");
        valor1=sc.nextInt();

        System.out.println("Digite otro valor");
        valor2=sc.nextInt();

        variable = valor1+valor2;
        System.out.println("el resultado es: "+variable);
        
    }

}
