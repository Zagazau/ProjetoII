package BLL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FornecedorBLL {
    private Connection connection;

    public FornecedorBLL() {
        try {
            connection = DatabaseConnection.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void adicionarFornecedor(int idFornecedor, String codPostal, String nome, int telefone, String rua, int numPorta, int nif) {
        String query = "INSERT INTO fornecedor (idfornecedor, codpostal, nome, telefone, rua, numporta, nif) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, idFornecedor);
            statement.setString(2, codPostal);
            statement.setString(3, nome);
            statement.setInt(4, telefone);
            statement.setString(5, rua);
            statement.setInt(6, numPorta);
            statement.setInt(7, nif);

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
