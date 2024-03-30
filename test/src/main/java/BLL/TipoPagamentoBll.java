package BLL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TipoPagamentoBLL {
    private Connection connection;

    public TipoPagamentoBLL() {
        try {
            connection = DatabaseConnection.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void adicionarTipoPagamento(int idTipoPagamento, String nomeTipoPagamento) {
        String query = "INSERT INTO tipopagamento (idtipopag, nometipopag) VALUES (?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, idTipoPagamento);
            statement.setString(2, nomeTipoPagamento);

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
