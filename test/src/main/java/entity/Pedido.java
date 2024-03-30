package entity;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
public class Pedido {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idpedido")
    private int idpedido;
    @Basic
    @Column(name = "idcliente")
    private int idcliente;
    @Basic
    @Column(name = "quantidade")
    private int quantidade;
    @Basic
    @Column(name = "data")
    private Date data;

    public int getIdpedido() {
        return idpedido;
    }

    public void setIdpedido(int idpedido) {
        this.idpedido = idpedido;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
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

        Pedido pedido = (Pedido) o;

        if (idpedido != pedido.idpedido) return false;
        if (idcliente != pedido.idcliente) return false;
        if (quantidade != pedido.quantidade) return false;
        if (data != null ? !data.equals(pedido.data) : pedido.data != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idpedido;
        result = 31 * result + idcliente;
        result = 31 * result + quantidade;
        result = 31 * result + (data != null ? data.hashCode() : 0);
        return result;
    }
}
