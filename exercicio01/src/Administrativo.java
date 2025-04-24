
 class Administrativo extends Assistente {
    private String turno; 
    public Administrativo(String nome, float salario, int anoContrat, int matricula, String turno) {
        super(nome, salario, anoContrat, matricula);
        this.turno = turno; 
    }
    public String getTurno() {
        return turno;
    }
    public void setTurno(String turno) {
        this.turno = turno;
    }

    
    public float calculaBonus(){
        if(getTurno().equalsIgnoreCase("noite")){
            return (float) (getSalario()*0.10);
        }
        else{
            return (float) 0.0; 
        }
    }
    @Override
    public void exibeDados(){
        System.out.println("Nome: "+ getNome());
        System.out.println("Salário: "+getSalario());
        System.out.println("Ano do contrato: "+getAnoContrat());
        System.out.println("Matricula: "+ getMatricula());
        System.out.println("Turno: "+ getTurno());
        System.out.println("Bonus Salarial: "+ calculaBonus());
    } 

}
