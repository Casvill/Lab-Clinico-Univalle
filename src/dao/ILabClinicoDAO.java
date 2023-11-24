package dao;
import java.sql.Connection;

/**
 *
 * @author Daniel Casvill
 */
public interface ILabClinicoDAO 
{
    public  Connection establecerConexion();
    public String realizarConsulta(String sql);
    public boolean insertarDatos(String sql);
    public boolean actualizarDatos(String sql);
    public boolean eliminarDatos(String sql);    
}
