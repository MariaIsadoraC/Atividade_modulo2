public class App {
    public static void main(String[] args) throws Exception {
       System.out.println("Funcionario: "); 
       Funcionario funcionario = new Funcionario("Gabriel", (float) 3000.00, 2020);
       funcionario.exibeDados();

       System.out.println("\nGerente:"); 
       Gerente gerente = new Gerente("Aline", (float) 6000.00, 2019, 15); 
       System.out.println("Nome: "+ gerente.getNome());
       System.out.println("Salário: "+gerente.getSalario());
       System.out.println("Ano do contrato: "+gerente.getAnoContrat());
       System.out.println("O bonus do salário é: "+ gerente.calculaBonus());

       System.out.println("\nAssistente:"); 
       Assistente assistente = new Assistente("Lucas", (float) 2000.00, 2023, 202301136);
       assistente.exibeDados();

       System.out.println("\nAssistente tecnico:"); 
       Tecnico assistenteTecnico = new Tecnico("Julia", (float) 2000.00, 2023, 202301149); 
       assistenteTecnico.exibeDados();

       System.out.println("\nAssistente administrativo:"); 
       Administrativo assistenteAdministrativo = new Administrativo("Luan", (float) 2000.00, 2023, 202301146, "noite"); 
       assistenteAdministrativo.exibeDados();
    }
}
