package io.github.santelgg.produtos_api.model;

    //POJO -> Plain Old Java Object
    //Classe de negócios

public class Produto {

    private String id;
    private String nome;
    private String descricao;
    private Double preco;

    //Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrição() {
        return descricao;
    }

    public void setDescrição(String descrição) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    //Representação em String do objeto
    @Override
    public String toString() {
        return "Produto{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", descrição='" + descricao + '\'' +
                ", preco=" + preco +
                '}';
    }
}
