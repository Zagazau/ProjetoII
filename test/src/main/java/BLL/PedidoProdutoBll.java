package BLL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PedidoProdutoBLL {
    private Connection connection;

    public PedidoProdutoBLL() {
        try {
            connection = DatabaseConnection.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void adicionarPedidoProduto(int idPedido, int idProduto) {
        String query = "INSERT INTO pedidoproduto (idpedido, idproduto) VALUES (?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, idPedido);
            statement.setInt(2, idProduto);

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
