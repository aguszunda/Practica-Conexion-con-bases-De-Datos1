
package base_telefonojdbc;
import java.sql.*;


public class Base_TelefonoJDBC {

    /*public static void main(String[] args) 
    {
        try{
            //1.Creamosla conexion
            Connection cx = DriverManager.getConnection("jdbc:mysql://localhost:3306/agendatelefonos","root","1234"); 
           
            //2.Creamos un objeto Statement para enviar consultas a la base de datos
            Statement miStatement = cx.createStatement();
            
            //3.Ejecutar sql
            ResultSet miResultSet = miStatement.executeQuery("select * from contactos");
            
            //Leer el ResultSet
            while(miResultSet.next())
            {
                System.out.println(miResultSet.getString("idContactos") + " "+miResultSet.getString("Nombre")+ " "
                        +miResultSet.getString("Telefono"));
            }
            
        }catch(Exception e)
        {
            System.out.println("No conecta..");
            e.printStackTrace();
        }
          
    }*/
}