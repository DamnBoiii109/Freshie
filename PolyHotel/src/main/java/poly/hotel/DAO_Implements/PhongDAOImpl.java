package Poly.Hotel.dao.impl;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import poly.cafe.dao.CardDAO;
import poly.cafe.entity.Phong;
import poly.cafe.util.XJdbc;

/**
 *
 * @author hp user
 */
public class CardDAOImpl implements PhongDAO {

    private final String createSql = "INSERT INTO Phong (Id, Status) VALUES (?, ?)";
    private final String updateSql = "UPDATE Phong SET Status = ? WHERE Id = ?";
    private final String deleteSql = "DELETE FROM Phong WHERE Id = ?";
    private final String findAllSql = "SELECT * FROM Phong";
    private final String findByIdSql = "SELECT * FROM Phong WHERE Id = ?";

    @Override
    public Phong create(Phong entity) {
        try {
            XJdbc.executeUpdate(createSql, entity.getId(), entity.getStatus());
            return entity; // Trả về entity vừa được thêm
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error creating card: " + e.getMessage());
        }
    }

    @Override
    public void update(Phong entity) {
        try {
            XJdbc.executeUpdate(updateSql, entity.getStatus(), entity.getId());
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error updating Phong: " + e.getMessage());
        }
    }

    @Override
    public void deleteById(Integer id) {
        try {
            XJdbc.executeUpdate(deleteSql, id);
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
                Phong.setId(rs.getInt("Id"));
                Phong.setStatus(rs.getInt("Status"));
                list.add(card);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error finding all cards: " + e.getMessage());
        }
        return list;
    }

    @Override
    public Phong findById(Integer id) {
        try (ResultSet rs = XJdbc.executeQuery(findByIdSql, id)) {
            if (rs.next()) {
                Phong Phong = new Phong();
                Phong.setId(rs.getInt("Id"));
                Phong.setStatus(rs.getInt("Status"));
                return Phong;
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error finding card by id: " + e.getMessage());
        }
        return null;
    }
}
