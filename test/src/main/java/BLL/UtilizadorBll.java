package BLL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UtilizadorBLL {
    private Connection connection;

    public UtilizadorBLL() {
        try {
            connection = DatabaseConnection.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void adicionarUtilizador(int idUtilizador, String codPostal, String nome, int telefone, String rua, int numPorta, int nif, int idTipoUtilizador) {
        String query = "INSERT INTO utilizador (idutilizador, codpostal, nome, telefone, rua, numporta, nif, idtipoutilizador) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, idUtilizador);
            statement.setString(2, codPostal);
            statement.setString(3, nome);
            statement.setInt(4, telefone);
            statement.setString(5, rua);
            statement.setInt(6, numPorta);
            statement.setInt(7, nif);
            statement.setInt(8, idTipoUtilizador);

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
