package BLL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PedidoBLL {
    private Connection connection;

    public PedidoBLL() {
        try {
            connection = DatabaseConnection.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void adicionarPedido(int idPedido, int idCliente, int quantidade, String data) {
        String query = "INSERT INTO pedido (idpedido, idcliente, quantidade, data) VALUES (?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, idPedido);
            statement.setInt(2, idCliente);
            statement.setInt(3, quantidade);
            statement.setString(4, data);

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
