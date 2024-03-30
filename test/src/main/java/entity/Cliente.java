package entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Cliente {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idcliente")
    private int idcliente;
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

    @OneToMany(mappedBy = "cliente")
    private Set<Faturacompra> faturasCompra;

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
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

    public Set<Faturacompra> getFaturasCompra() {
        return faturasCompra;
    }

    public void setFaturasCompra(Set<Faturacompra> faturasCompra) {
        this.faturasCompra = faturasCompra;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cliente cliente = (Cliente) o;

        if (idcliente != cliente.idcliente) return false;
        if (telefone != cliente.telefone) return false;
        if (numporta != cliente.numporta) return false;
        if (nif != cliente.nif) return false;
        if (codpostal != null ? !codpostal.equals(cliente.codpostal) : cliente.codpostal != null) return false;
        if (nome != null ? !nome.equals(cliente.nome) : cliente.nome != null) return false;
        if (rua != null ? !rua.equals(cliente.rua) : cliente.rua != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idcliente;
        result = 31 * result + (codpostal != null ? codpostal.hashCode() : 0);
        result = 31 * result + (nome != null ? nome.hashCode() : 0);
        result = 31 * result + telefone;
        result = 31 * result + (rua != null ? rua.hashCode() : 0);
        result = 31 * result + numporta;
        result = 31 * result + nif;
        return result;
    }
}
