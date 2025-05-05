public class Gerente extends Funcionario{
    private double salarioBase;
    private double bonusFixo;

    public Gerente (double salarioBase, double bonusFixo){
        this.bonusFixo = bonusFixo;
        this.salarioBase = salarioBase;
    }

    @Override
    public double calcularSalarioFinal() { 
        return salarioBase + bonusFixo;
    }
}