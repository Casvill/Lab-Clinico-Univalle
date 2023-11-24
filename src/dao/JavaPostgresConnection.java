package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JavaPostgresConnection {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:postgresql://localhost:5432/LabClinicoUnivalle";
        String usuario = "postgres";
        String contraseña = "postgresql";

        try {
            // Cargar el controlador JDBC
            Class.forName("org.postgresql.Driver");

            // Establecer la conexión
            Connection connection = DriverManager.getConnection(jdbcUrl, usuario, contraseña);

            // Realizar operaciones en la base de datos
            String sql = "SELECT * FROM valorExamen";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                ResultSet resultSet = statement.executeQuery();
                while (resultSet.next()) {
                    // Procesar los resultados
                    System.out.println(resultSet.getString("id"));
                    System.out.println(resultSet.getString("tipo_examen"));
                    System.out.println(resultSet.getString("valor"));
                    // Procesar y mostrar todos los resultados
//                    for (int i = 1; i <= resultSet.getMetaData().getColumnCount(); i++) {
//                        System.out.print(resultSet.getString(i) + "\t");
//                    }
                    System.out.println(); // Salto de línea para la siguiente fila
                }
            }

            // Cerrar la conexión
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}

