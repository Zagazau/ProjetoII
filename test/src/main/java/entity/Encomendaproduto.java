package entity;

import jakarta.persistence.*;

@Entity
public class Encomendaproduto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Basic
    @Column(name = "idencomenda")
    private int idencomenda;
    @Basic
    @Column(name = "idproduto")
    private int idproduto;

    public int getIdencomenda() {
        return idencomenda;
    }

    public void setIdencomenda(int idencomenda) {
        this.idencomenda = idencomenda;
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

        Encomendaproduto that = (Encomendaproduto) o;

        if (idencomenda != that.idencomenda) return false;
        if (idproduto != that.idproduto) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idencomenda;
        result = 31 * result + idproduto;
        return result;
    }
}
