package BLL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TipoProdutoBLL {
    private Connection connection;

    public TipoProdutoBLL() {
        try {
            connection = DatabaseConnection.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void adicionarTipoProduto(int idTipoProduto, String descricao, int idProduto) {
        String query = "INSERT INTO tipoproduto (idtipoproduto, descricao, idproduto) VALUES (?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, idTipoProduto);
            statement.setString(2, descricao);
            statement.setInt(3, idProduto);

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
