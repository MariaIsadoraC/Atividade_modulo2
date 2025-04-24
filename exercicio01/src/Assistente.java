 class Assistente extends Funcionario {
    private int matricula;

    public Assistente(String nome, float salario, int anoContrat, int matricula) {
        super(nome, salario, anoContrat);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    @Override
    public void exibeDados(){
        System.out.println("Nome: "+ getNome());
        System.out.println("Salário: "+getSalario());
        System.out.println("Ano do contrato: "+getAnoContrat());
        System.out.println("Matricula: "+ getMatricula());
    }

}
