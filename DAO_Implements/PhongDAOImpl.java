package poly.hotel.DAO_Implements;

import Poly.Hotel.dao.PhongDAO;
import Poly.Hotel.entity.Phong;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import poly.hotel.util.XJdbc;

/**
 *
 * @author hp user
 */
public class PhongDAOImpl implements PhongDAO {

    private final String createSql = "INSERT INTO Phong (MaPhong, TrangThaiPhong,TenPhong, LoaiPhong) VALUES (?, ?, ?, ?)";
    private final String updateSql = "UPDATE Phong SET TrangThaiPhong = ? WHERE MaPhong = ?";
    private final String deleteSql = "DELETE FROM Phong WHERE MaPhong = ?";
    private final String findAllSql = "SELECT * FROM Phong";
    private final String findByMaPhongIdSql = "SELECT * FROM Phong WHERE MaPhong = ?";

    @Override
    public Phong create(Phong entity) {
        try {
            XJdbc.executeUpdate(createSql, entity.getMaPhong(), entity.getTrangThaiPhong());
            return entity; // Trả về entity vừa được thêm
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error creating Phong: " + e.getMessage());
        }
    }

    @Override
    public void update(Phong entity) {
        try {
            XJdbc.executeUpdate(updateSql, entity.getTrangThaiPhong(), entity.getMaPhong());
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error updating Phong: " + e.getMessage());
        }
    }

    public void deleteByMaPhong(Integer MaPhong) {
        try {
            XJdbc.executeUpdate(deleteSql, MaPhong);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error deleting Phong: " + e.getMessage());
        }
    }

    @Override
    public List<Phong> findAll() {
        List<Phong> list = new ArrayList<>();
        try (ResultSet rs = XJdbc.executeQuery(findAllSql)) {
            while (rs.next()) {
                Phong Phong = new Phong();
                Phong.setMaPhong(rs.getInt("MaPhong"));
                Phong.setTrangThaiPhong(rs.getInt("TrangThaiPhong"));
                list.add(Phong);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error finding all cards: " + e.getMessage());
        }
        return list;
    }

    public Phong findByMaPhong(Integer MaPhong) {
        try (ResultSet rs = XJdbc.executeQuery(findByMaPhongIdSql, MaPhong)) {
            if (rs.next()) {
                Phong Phong = new Phong();
                Phong.setMaPhong(rs.getInt("MaPhong"));
                Phong.setTrangThaiPhong(rs.getInt("TrangThaiPhong"));
                return Phong;
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error finding Phong by MaPhong: " + e.getMessage());
        }
        return null;
    }

    @Override
    public void deleteById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Phong findById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
