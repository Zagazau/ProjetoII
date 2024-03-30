package entity;

import jakarta.persistence.*;

@Entity
public class Utilizador {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idutilizador")
    private int idutilizador;
    @Basic
    @Column(name = "codpostal")
    private String codpostal;
    @Basic
    @Column(name = "nome")
    private String nome;
    @Basic
    @Column(name = "telefone")
    private int telefone;
    @Basic
    @Column(name = "rua")
    private String rua;
    @Basic
    @Column(name = "numporta")
    private int numporta;
    @Basic
    @Column(name = "nif")
    private int nif;
    @Basic
    @Column(name = "idtipoutilizador")
    private Integer idtipoutilizador;

    public int getIdutilizador() {
        return idutilizador;
    }

    public void setIdutilizador(int idutilizador) {
        this.idutilizador = idutilizador;
    }

    public String getCodpostal() {
        return codpostal;
    }

    public void setCodpostal(String codpostal) {
        this.codpostal = codpostal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumporta() {
        return numporta;
    }

    public void setNumporta(int numporta) {
        this.numporta = numporta;
    }

    public int getNif() {
        return nif;
    }

    public void setNif(int nif) {
        this.nif = nif;
    }

    public Integer getIdtipoutilizador() {
        return idtipoutilizador;
    }

    public void setIdtipoutilizador(Integer idtipoutilizador) {
        this.idtipoutilizador = idtipoutilizador;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Utilizador that = (Utilizador) o;

        if (idutilizador != that.idutilizador) return false;
        if (telefone != that.telefone) return false;
        if (numporta != that.numporta) return false;
        if (nif != that.nif) return false;
        if (codpostal != null ? !codpostal.equals(that.codpostal) : that.codpostal != null) return false;
        if (nome != null ? !nome.equals(that.nome) : that.nome != null) return false;
        if (rua != null ? !rua.equals(that.rua) : that.rua != null) return false;
        if (idtipoutilizador != null ? !idtipoutilizador.equals(that.idtipoutilizador) : that.idtipoutilizador != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idutilizador;
        result = 31 * result + (codpostal != null ? codpostal.hashCode() : 0);
        result = 31 * result + (nome != null ? nome.hashCode() : 0);
        result = 31 * result + telefone;
        result = 31 * result + (rua != null ? rua.hashCode() : 0);
        result = 31 * result + numporta;
        result = 31 * result + nif;
        result = 31 * result + (idtipoutilizador != null ? idtipoutilizador.hashCode() : 0);
        return result;
    }
}
