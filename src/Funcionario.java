public class Funcionario {
    private String nome;
    private String departamento;
    private double salario;
    private String data;
    private String rg;
    public int telefone;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public String getRg() {
        return rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }
    void funcionario(){

    }
    public Funcionario(String nome, String departamento, double salario,
    String data, String rg){
        this.nome = nome;
        this.departamento = departamento;
        this.data = data;
        this.salario = salario;
        this.rg = rg;    

    }
    

}
