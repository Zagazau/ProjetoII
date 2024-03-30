package entity;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Embeddable;

@Embeddable
public class PedidoprodutoPK implements Serializable {
    private int idpedido;
    private int idproduto;

    // Construtor, getters e setters

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PedidoprodutoPK that = (PedidoprodutoPK) o;
        return idpedido == that.idpedido && idproduto == that.idproduto;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idpedido, idproduto);
    }
}
