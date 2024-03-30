package entity;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
@jakarta.persistence.IdClass(entity.PedidoprodutoPK.class)
public class Pedidoproduto {
    @jakarta.persistence.GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    @jakarta.persistence.Id
    @Basic
    @Column(name = "idpedido")
    private int idpedido;
    @jakarta.persistence.GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    @jakarta.persistence.Id
    @Basic
    @Column(name = "idproduto")
    private int idproduto;

    public int getIdpedido() {
        return idpedido;
    }

    public void setIdpedido(int idpedido) {
        this.idpedido = idpedido;
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

        Pedidoproduto that = (Pedidoproduto) o;

        if (idpedido != that.idpedido) return false;
        if (idproduto != that.idproduto) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idpedido;
        result = 31 * result + idproduto;
        return result;
    }
}
