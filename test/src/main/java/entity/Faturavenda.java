package entity;

import jakarta.persistence.*;

@Entity
public class Faturavenda {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idfaturav")
    private int idfaturav;
    @Basic
    @Column(name = "idpedido")
    private int idpedido;
    @Basic
    @Column(name = "idtipopag")
    private int idtipopag;
    @Basic
    @Column(name = "idutilizador")
    private int idutilizador;
    @Basic
    @Column(name = "valor")
    private float valor;
    @Basic
    @Column(name = "quantidade")
    private int quantidade;

    public int getIdfaturav() {
        return idfaturav;
    }

    public void setIdfaturav(int idfaturav) {
        this.idfaturav = idfaturav;
    }

    public int getIdpedido() {
        return idpedido;
    }

    public void setIdpedido(int idpedido) {
        this.idpedido = idpedido;
    }

    public int getIdtipopag() {
        return idtipopag;
    }

    public void setIdtipopag(int idtipopag) {
        this.idtipopag = idtipopag;
    }

    public int getIdutilizador() {
        return idutilizador;
    }

    public void setIdutilizador(int idutilizador) {
        this.idutilizador = idutilizador;
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

        Faturavenda that = (Faturavenda) o;

        if (idfaturav != that.idfaturav) return false;
        if (idpedido != that.idpedido) return false;
        if (idtipopag != that.idtipopag) return false;
        if (idutilizador != that.idutilizador) return false;
        if (Float.compare(valor, that.valor) != 0) return false;
        if (quantidade != that.quantidade) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idfaturav;
        result = 31 * result + idpedido;
        result = 31 * result + idtipopag;
        result = 31 * result + idutilizador;
        result = 31 * result + (valor != 0.0f ? Float.floatToIntBits(valor) : 0);
        result = 31 * result + quantidade;
        return result;
    }
}
