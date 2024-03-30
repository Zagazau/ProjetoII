package entity;

import jakarta.persistence.*;

@Entity
public class Tipopagamento {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idtipopag")
    private int idtipopag;
    @Basic
    @Column(name = "nometipopag")
    private String nometipopag;

    public int getIdtipopag() {
        return idtipopag;
    }

    public void setIdtipopag(int idtipopag) {
        this.idtipopag = idtipopag;
    }

    public String getNometipopag() {
        return nometipopag;
    }

    public void setNometipopag(String nometipopag) {
        this.nometipopag = nometipopag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tipopagamento that = (Tipopagamento) o;

        if (idtipopag != that.idtipopag) return false;
        if (nometipopag != null ? !nometipopag.equals(that.nometipopag) : that.nometipopag != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idtipopag;
        result = 31 * result + (nometipopag != null ? nometipopag.hashCode() : 0);
        return result;
    }
}
