
package base_telefonojdbc;
import java.sql.*;

public class ModificaDB 
{
    public static void main(String args[])
    {
        try{
        //1.CREAMOS LA CONEXION
        Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/agendatelefonos","root","1234");
        //2.CREAMOS UN OBJETO STATEMENT PARA ENVIOAR CONSULTAS A LA BASE DE DATOS
        Statement miStatement = cn.createStatement();
        //creamos un string para cargar la instruccion sql
        String instruccion ="delete from contactos where idContactos=10";
                //"update contactos set Nombre = 'juan' where idContactos = 10 ";
                //"insert into contactos values(10, 'laura', 4553332)";
             
        //le pasasmos por parametro la instruccion a nuestro Statemnt
        miStatement.executeUpdate(instruccion);
        System.out.println("Datos borrados ok");
            
        //mostramos todos los datos cargados en la tabla contactos
        //Base_TelefonoJDBC tablaMuestra = new Base_TelefonoJDBC();
        //tablaMuestra.mostrar();
        
        }catch(Exception e)
        {
            System.out.println("Conexion no realizada..");
            e.fillInStackTrace();
        }
            
    }
    
}
