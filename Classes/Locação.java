package Classes;

import java.time.LocalDate;

public class Locação {
    
    private LocalDate dataLocacao;
    private Integer cpfCliente;
    private Integer codigo;
    private LocalDate dataDevolucao;
    private String status;
   
    public Locação(LocalDate dataLocacao, Integer cpfCliente, Integer codigo, LocalDate dataDevolucao, String status) {
        this.dataLocacao = dataLocacao;
        this.cpfCliente = cpfCliente;
        this.codigo = codigo;
        this.dataDevolucao = dataDevolucao;
        this.status = status;
    }
   
    @Override
    public String toString() {
        return "Locação [codigo=" + codigo + ", cpfCliente=" + cpfCliente + ", dataDevolucao=" + dataDevolucao
                + ", dataLocacao=" + dataLocacao + ", status=" + status + "]";
    }
   
    public LocalDate getDataLocacao() {
        return dataLocacao;
    }
    public void setDataLocacao(LocalDate dataLocacao) {
        this.dataLocacao = dataLocacao;
    }
    public Integer getCpfCliente() {
        return cpfCliente;
    }
    public void setCpfCliente(Integer cpfCliente) {
        this.cpfCliente = cpfCliente;
    }
    public Integer getCodigo() {
        return codigo;
    }
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }
    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
}
