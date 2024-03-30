package BLL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TipoUtilizadorBLL {
    private Connection connection;

    public TipoUtilizadorBLL() {
        try {
            connection = DatabaseConnection.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void adicionarTipoUtilizador(int idTipoUtilizador, String nomeTipoUtilizador) {
        String query = "INSERT INTO tipoutilizador (idtipoutilizador, nometipoutil) VALUES (?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, idTipoUtilizador);
            statement.setString(2, nomeTipoUtilizador);

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
