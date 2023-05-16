public class Salario {
    private String name;
    private double grossSalary;
    private double tax;
    private double netSalary;
    private  double increaseSalary;

    public Salario(String name, double grossSalary, double tax) {
        this.name = name;
        this.grossSalary = grossSalary;
        this.tax = tax;
    }


    public double calculaImposto (){

     return this.netSalary =this.grossSalary-((this.tax/100)*this.grossSalary);
    }
    public double calculaAcrescimo (){

        return this.increaseSalary =this.netSalary+((this.tax/100)*this.grossSalary);
    }

    public   void exibedados1 (){
        System.out.println("Nome= " + this.name);
        System.out.println("Salario Liquido: " + calculaImposto());
    }
    public   void exibedados2 (){
        System.out.println("Nome= " + this.name);
        System.out.println("Salario Liquido com acrescimo: " + calculaAcrescimo());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getNetSalary() {
        return netSalary;
    }

    public void setNetSalary(double netSalary) {
        this.netSalary = netSalary;
    }

    public double getIncreaseSalary() {
        return increaseSalary;
    }

    public void setIncreaseSalary(double increaseSalary) {
        this.increaseSalary = increaseSalary;
    }
}
