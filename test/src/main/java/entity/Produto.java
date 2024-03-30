package entity;

import jakarta.persistence.*;

@Entity
public class Produto {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idproduto")
    private int idproduto;
    @Basic
    @Column(name = "nome")
    private String nome;
    @Basic
    @Column(name = "valor")
    private float valor;
    @Basic
    @Column(name = "quantidade")
    private int quantidade;

    public int getIdproduto() {
        return idproduto;
    }

    public void setIdproduto(int idproduto) {
        this.idproduto = idproduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Produto produto = (Produto) o;

        if (idproduto != produto.idproduto) return false;
        if (Float.compare(valor, produto.valor) != 0) return false;
        if (quantidade != produto.quantidade) return false;
        if (nome != null ? !nome.equals(produto.nome) : produto.nome != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idproduto;
        result = 31 * result + (nome != null ? nome.hashCode() : 0);
        result = 31 * result + (valor != 0.0f ? Float.floatToIntBits(valor) : 0);
        result = 31 * result + quantidade;
        return result;
    }
}
