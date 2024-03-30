package entity;

import jakarta.persistence.*;

@Entity
public class Tipoutilizador {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idtipoutilizador")
    private int idtipoutilizador;
    @Basic
    @Column(name = "nometipoutil")
    private String nometipoutil;

    public int getIdtipoutilizador() {
        return idtipoutilizador;
    }

    public void setIdtipoutilizador(int idtipoutilizador) {
        this.idtipoutilizador = idtipoutilizador;
    }

    public String getNometipoutil() {
        return nometipoutil;
    }

    public void setNometipoutil(String nometipoutil) {
        this.nometipoutil = nometipoutil;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tipoutilizador that = (Tipoutilizador) o;

        if (idtipoutilizador != that.idtipoutilizador) return false;
        if (nometipoutil != null ? !nometipoutil.equals(that.nometipoutil) : that.nometipoutil != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idtipoutilizador;
        result = 31 * result + (nometipoutil != null ? nometipoutil.hashCode() : 0);
        return result;
    }
}
