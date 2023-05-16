import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome:");
        String name = scanner.next();
        System.out.println("Digite o Salario bruto: ");
        double grossSalary = scanner.nextDouble();
        System.out.println("Digite o Imposto");
        double tax = scanner.nextDouble();
        Salario salario = new Salario(name, grossSalary, tax );
        salario.setName(name);
        salario.setGrossSalary(grossSalary);
        salario.setTax(tax);

        salario.exibedados1();
        System.out.println("InForme a taxa de Acrescimo");
        tax = scanner.nextDouble();
        Salario acrescimo = new Salario(name, grossSalary, tax);
        acrescimo.exibedados2();





    }
}