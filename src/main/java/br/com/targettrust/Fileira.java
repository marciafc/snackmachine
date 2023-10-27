package br.com.targettrust;

public class Fileira {

    private Produto produto;

    private Integer quantidadeProduto;

    private FileiraStatusEnum status;

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public FileiraStatusEnum getStatus() {
        return status;
    }

    public void setStatus(FileiraStatusEnum status) {
        this.status = status;
    }

    public Integer getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void setQuantidadeProduto(Integer quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

    @Override
    public String toString() {
        return "Fileira{" +
                "produto=" + produto +
                ", quantidadeProduto=" + quantidadeProduto +
                ", status=" + status +
                '}';
    }
}
