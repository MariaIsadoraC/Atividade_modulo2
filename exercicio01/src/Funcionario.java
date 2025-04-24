
class Funcionario {
    private String nome; 
    private float salario; 
    private int anoContrat;

    public Funcionario(String nome, float salario, int anoContrat){
        this.nome = nome;
        this.salario = salario;
        this.anoContrat = anoContrat;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public int getAnoContrat() {
        return anoContrat;
    }

    public void setAnoContrat(int anoContrat) {
        this.anoContrat = anoContrat;
    }
    public void exibeDados(){
        System.out.println("Nome: "+ getNome());
        System.out.println("Salário: "+getSalario());
        System.out.println("Ano do contrato: "+getAnoContrat());
    }
   

}
