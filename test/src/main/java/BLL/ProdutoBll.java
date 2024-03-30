package BLL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProdutoBLL {
    private Connection connection;

    public ProdutoBLL() {
        try {
            connection = DatabaseConnection.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void adicionarProduto(int idProduto, String nome, float valor, int quantidade) {
        String query = "INSERT INTO produto (idproduto, nome, valor, quantidade) VALUES (?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, idProduto);
            statement.setString(2, nome);
            statement.setFloat(3, valor);
            statement.setInt(4, quantidade);

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
