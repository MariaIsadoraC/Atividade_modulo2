
 class Tecnico extends Assistente {
    public Tecnico(String nome, float salario, int anoContrat, int matricula) {
        super(nome, salario, anoContrat, matricula);
    }
    public float calculaBonus(){
        return (float) (getSalario()*0.10);
    }
    float bonus = calculaBonus(); 
   @Override
   public void exibeDados(){
    System.out.println("Nome: "+ getNome());
    System.out.println("Salário: "+getSalario());
    System.out.println("Ano do contrato: "+getAnoContrat());
    System.out.println("Matricula: "+ getMatricula());
    System.out.println("Bonus Salarial: "+ bonus);
} 
}
