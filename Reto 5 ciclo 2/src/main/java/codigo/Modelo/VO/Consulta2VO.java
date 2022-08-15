package codigo.Modelo.VO;
import codigo.Modelo.DAO.*;
import java.sql.*;
import java.util.ArrayList;

public class Consulta2VO {
    public static ArrayList<String[]> valores() {
        ArrayList<String[]> salida_vo=new ArrayList<String[]>();
        
        try {
            ResultSet rs=Consulta2DAO.consulta();
            while(rs.next()){
                int ID=rs.getInt("ID_Proyecto");
                String constructora=rs.getString("Constructora");
                String hb=rs.getString("Numero_Habitaciones");
                String ciudad=rs.getString("Ciudad");
                salida_vo.add(new String[]{ID+"",constructora,hb,ciudad});
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return salida_vo;        
    }
}
