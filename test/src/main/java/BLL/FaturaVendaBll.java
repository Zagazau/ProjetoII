package BLL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FaturaVendaBLL {
    private Connection connection;

    public FaturaVendaBLL() {
        try {
            connection = DatabaseConnection.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void adicionarFaturaVenda(int idFatura, int idPedido, int idTipoPagamento, int idUtilizador, float valor, int quantidade) {
        String query = "INSERT INTO faturavenda (idfaturav, idpedido, idtipopag, idutilizador, valor, quantidade) VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, idFatura);
            statement.setInt(2, idPedido);
            statement.setInt(3, idTipoPagamento);
            statement.setInt(4, idUtilizador);
            statement.setFloat(5, valor);
            statement.setInt(6, quantidade);

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
