
package Form;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
        

public class KoneksiDB {
   static Connection koneksi;
   public static Connection getcoConnection () {
       try {
            koneksi=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_akademikmhs","root","");
   } catch (Exception e) {
           JOptionPane.showMessageDialog(null,"Koneksi Berhasil" );
   }
       return koneksi;
}
   }
