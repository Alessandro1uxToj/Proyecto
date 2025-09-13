/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectofinal;
    import Conexion.CreateConection;
    import java.sql.SQLException;
    //librerias para mamipular los datos
    import java.sql.connextion;
    import java.sql.SQLException;
    import java.sql.Statement;
    import java.sql.PreparedStatement;

    public class MainProyectoFinal {
    public static void main(String[] args) throws SQLException {
        CreateConection conexionPostgres = new CreateConection();
        Connection con= conexionPostgres.getConection();
        try{
            Statement smt = con.createStatement();
            String qry = "insert into public.empleado(nombre,apellido,salario)"
                    + " values ('Marina','Catalan',7550,25)";
            int filasInsertadas = smt.executeUpdate(qry);
            System.out.println("Total de Registros insertados"+filasInsertadas);
            smt.close();
        }catch(SQLException e){
            e.getMessage();
        }
        
    }
    
}
