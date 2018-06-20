
package base_telefonojdbc;
import java.sql.*;

public class ConsultaPreparada
{
    public static void main(String args[])
    {
        try{
            //1.generamos la conexion
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/agendatelefonos","root","1234");
            //iniciamos un elemento de tipo PreparedStatement
            String nombre="sofi";
            PreparedStatement consulta = con.prepareStatement("select * from contactos where Nombre like '%"+ nombre +"%'");  
            //generamos un elemento de tipo resulset para obtener los resultados
            ResultSet rs = consulta.executeQuery();
            //mostramos resultados con un bucle while
            while(rs.next())
            {
                System.out.println(rs.getInt("idContactos") + " " + rs.getString("Nombre") + "" + rs.getInt("Telefono"));
            } 
          rs.close();
        }catch(Exception e)
        {
            System.out.println("La base no conecta");
            e.printStackTrace();
        }
    
    }
    
}
