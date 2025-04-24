 class Gerente extends Funcionario {
    private int supervisiona;

   public Gerente(String nome, float salario, int anoContrat, int supervisiona) {
       super(nome, salario, anoContrat);
       this.supervisiona = supervisiona;
    }
    

public float calculaBonus(){
    return (float) (this.getSalario() *0.20);
   }


public int getSupervisiona() {
    return supervisiona;
}


public void setSupervisiona(int supervisiona) {
    this.supervisiona = supervisiona;
}
}
