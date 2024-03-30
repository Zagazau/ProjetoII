package entity;

import jakarta.persistence.*;

@Entity
public class Tipoproduto {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idtipoproduto")
    private int idtipoproduto;
    @Basic
    @Column(name = "descricao")
    private String descricao;
    @Basic
    @Column(name = "idproduto")
    private int idproduto;

    public int getIdtipoproduto() {
        return idtipoproduto;
    }

    public void setIdtipoproduto(int idtipoproduto) {
        this.idtipoproduto = idtipoproduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getIdproduto() {
        return idproduto;
    }

    public void setIdproduto(int idproduto) {
        this.idproduto = idproduto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tipoproduto that = (Tipoproduto) o;

        if (idtipoproduto != that.idtipoproduto) return false;
        if (idproduto != that.idproduto) return false;
        if (descricao != null ? !descricao.equals(that.descricao) : that.descricao != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idtipoproduto;
        result = 31 * result + (descricao != null ? descricao.hashCode() : 0);
        result = 31 * result + idproduto;
        return result;
    }
}
