public class App {
    public static void main(String[] args) throws Exception {
        
       Funcionario funcionario1 = new Funcionario("Marcia", "Contabilidade",
        1350, "13/11/75", "1");
    
        System.out.printf("O nome do funcionario é %s, a data de adimissão foi %s, foi contratado para departamento %s, o RG do Funcionario é %s, e refebe %f",
        funcionario1.getNome(),funcionario1.getData(),funcionario1.getDepartamento(),funcionario1.getRg(), funcionario1.getSalario());
    }
}
