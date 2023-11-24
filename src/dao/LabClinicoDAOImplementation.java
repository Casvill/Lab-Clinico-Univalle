package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Daniel Casvill
 */
public class LabClinicoDAOImplementation implements ILabClinicoDAO
{
    // Información de conexión
    private final  String jdbcUrl = "jdbc:postgresql://localhost:5432/LabClinicoUnivalle";
    private final  String usuario = "postgres";
    private final  String contraseña = "postgresql";

    //-----------------------------------------------------------------------------------------
    
    @Override
    public Connection establecerConexion() 
    {
        try 
        {
            Class.forName("org.postgresql.Driver");
            return DriverManager.getConnection(jdbcUrl, usuario, contraseña);
        } 
        catch (ClassNotFoundException | SQLException e) 
        {
            e.printStackTrace();
            return null; 
        }
    }

    //-----------------------------------------------------------------------------------------
    
    @Override
    public String realizarConsulta(String sql) 
    {
        String resultado = "";
        try (Connection connection = establecerConexion();
             PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) 
        {
            
            while (resultSet.next()) 
            {                 
                        // Procesar y mostrar todos los resultados
                for (int i = 1; i <= resultSet.getMetaData().getColumnCount(); i++) 
                {
                    resultado += resultSet.getString(i) + "\t";
                }
                resultado += "-";
                
            }
            
            return resultado;
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
            return resultado;
        }                            
    }
    
    //-----------------------------------------------------------------------------------------
    
    @Override
    public boolean insertarDatos(String sql) 
    {
        try (Connection connection = establecerConexion();
             PreparedStatement statement = connection.prepareStatement(sql)) 
        {
            // Configurar parámetros para la inserción (si es necesario)
            // statement.setTipoDato(indice, valor);
            int filasAfectadas = statement.executeUpdate();
            System.out.println("Filas afectadas por la inserción: " + filasAfectadas);
            return true;
        } 
        
        catch (SQLException e) 
        {
            e.printStackTrace();
            return false;
        }
    }
    
    //-----------------------------------------------------------------------------------------
    
    @Override
    public boolean actualizarDatos(String sql) 
    {
        try (Connection connection = establecerConexion();
             PreparedStatement statement = connection.prepareStatement(sql)) 
        {
            // Configurar parámetros para la actualización (si es necesario)
            // statement.setTipoDato(indice, valor);
            int filasAfectadas = statement.executeUpdate();
            System.out.println("Filas afectadas por la actualización: " + filasAfectadas);
            return true;
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
            return false;
        }
    }
    
    //-----------------------------------------------------------------------------------------
    
    @Override
    public boolean eliminarDatos(String sql) 
    {
        try(Connection conection = establecerConexion();
            PreparedStatement statement = conection.prepareStatement(sql))
        {
            int filasAfectadas = statement.executeUpdate();
            System.out.println("Filas afectadas por la eliminacion: " + filasAfectadas);
                
            return true;
        }
        
        catch (SQLException e)
        {
            e.printStackTrace();
            return false;
        }
    }
    
    //-----------------------------------------------------------------------------------------
    
}
