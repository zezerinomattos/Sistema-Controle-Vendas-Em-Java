package br.com.projeto.model;

public class Produtos {
    private int id;
    private String descricao;
    private double preco_custo;
    private double preco;
    private int porcentagem_aumento; 
    private int qtd_estoque;
    private double lucro;
    private Fornecedores fornecedor;
    private String marca;
    private String tamanho;
    private String corPredominante;
    private String corDetalhes;
    private String obs;
    private int entrada;
    private int saida;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQtd_estoque() {
        return qtd_estoque;
    }

    public void setQtd_estoque(int qtd_estoque) {
        
        this.qtd_estoque = qtd_estoque;
    }

    public Fornecedores getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedores fornecedor) {
        this.fornecedor = fornecedor;
    }

    public double getPreco_custo() {
        return preco_custo;
    }

    public void setPreco_custo(double preco_custo) {
        this.preco_custo = preco_custo;
    }

    public int getPorcentagem_aumento() {
        return porcentagem_aumento;
    }

    public void setPorcentagem_aumento(int porcentagem_aumento) {
        this.porcentagem_aumento = porcentagem_aumento;
    }

    public double getLucro() {
        return lucro;
    }

    public void setLucro(double lucro) {
        this.lucro = lucro;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getCorPredominante() {
        return corPredominante;
    }

    public void setCorPredominante(String corPredominante) {
        this.corPredominante = corPredominante;
    }

    public String getCorDetalhes() {
        return corDetalhes;
    }

    public void setCorDetalhes(String corDetalhes) {
        this.corDetalhes = corDetalhes;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public int getEntrada() {
        return entrada;
    }

    public void setEntrada(int entrada) {
        this.entrada = entrada;
    }

    public int getSaida() {
        return saida;
    }

    public void setSaida(int saida) {
        this.saida = saida;
    }
    
    
    
    
}
