package entity;

import jakarta.persistence.*;

@Entity
public class Faturacompra {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idfaturac")
    private int idfaturac;
    @Basic
    @Column(name = "idencomenda")
    private int idencomenda;
    @Basic
    @Column(name = "idtipopag")
    private int idtipopag;
    @Basic
    @Column(name = "valor")
    private float valor;
    @Basic
    @Column(name = "quantidade")
    private int quantidade;

    @ManyToOne
    @JoinColumn(name = "idcliente")
    private Cliente cliente;


    public int getIdfaturac() {
        return idfaturac;
    }

    public void setIdfaturac(int idfaturac) {
        this.idfaturac = idfaturac;
    }

    public int getIdencomenda() {
        return idencomenda;
    }

    public void setIdencomenda(int idencomenda) {
        this.idencomenda = idencomenda;
    }

    public int getIdtipopag() {
        return idtipopag;
    }

    public void setIdtipopag(int idtipopag) {
        this.idtipopag = idtipopag;
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

        Faturacompra that = (Faturacompra) o;

        if (idfaturac != that.idfaturac) return false;
        if (idencomenda != that.idencomenda) return false;
        if (idtipopag != that.idtipopag) return false;
        if (Float.compare(valor, that.valor) != 0) return false;
        if (quantidade != that.quantidade) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idfaturac;
        result = 31 * result + idencomenda;
        result = 31 * result + idtipopag;
        result = 31 * result + (valor != 0.0f ? Float.floatToIntBits(valor) : 0);
        result = 31 * result + quantidade;
        return result;
    }
}
