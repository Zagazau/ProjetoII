package entity;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
public class Encomenda {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idencomenda")
    private int idencomenda;
    @Basic
    @Column(name = "idfornecedor")
    private int idfornecedor;
    @Basic
    @Column(name = "quantidade")
    private float quantidade;
    @Basic
    @Column(name = "data")
    private Date data;

    public int getIdencomenda() {
        return idencomenda;
    }

    public void setIdencomenda(int idencomenda) {
        this.idencomenda = idencomenda;
    }

    public int getIdfornecedor() {
        return idfornecedor;
    }

    public void setIdfornecedor(int idfornecedor) {
        this.idfornecedor = idfornecedor;
    }

    public float getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(float quantidade) {
        this.quantidade = quantidade;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Encomenda encomenda = (Encomenda) o;

        if (idencomenda != encomenda.idencomenda) return false;
        if (idfornecedor != encomenda.idfornecedor) return false;
        if (Float.compare(quantidade, encomenda.quantidade) != 0) return false;
        if (data != null ? !data.equals(encomenda.data) : encomenda.data != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idencomenda;
        result = 31 * result + idfornecedor;
        result = 31 * result + (quantidade != 0.0f ? Float.floatToIntBits(quantidade) : 0);
        result = 31 * result + (data != null ? data.hashCode() : 0);
        return result;
    }
}
