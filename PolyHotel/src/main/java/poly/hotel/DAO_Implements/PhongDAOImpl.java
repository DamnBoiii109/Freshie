package Poly.Hotel.dao.impl;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import poly.cafe.dao.CardDAO;
import poly.cafe.entity.Card;
import poly.cafe.util.XJdbc;

/**
 *
 * @author hp user
 */
public class CardDAOImpl implements CardDAO {

    private final String createSql = "INSERT INTO Cards (Id, Status) VALUES (?, ?)";
    private final String updateSql = "UPDATE Card SET Status = ? WHERE Id = ?";
    private final String deleteSql = "DELETE FROM Cards WHERE Id = ?";
    private final String findAllSql = "SELECT * FROM Cards";
    private final String findByIdSql = "SELECT * FROM Cards WHERE Id = ?";

    @Override
    public Card create(Card entity) {
        try {
            XJdbc.executeUpdate(createSql, entity.getId(), entity.getStatus());
            return entity; // Trả về entity vừa được thêm
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error creating card: " + e.getMessage());
        }
    }

    @Override
    public void update(Card entity) {
        try {
            XJdbc.executeUpdate(updateSql, entity.getStatus(), entity.getId());
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error updating card: " + e.getMessage());
        }
    }

    @Override
    public void deleteById(Integer id) {
        try {
            XJdbc.executeUpdate(deleteSql, id);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error deleting card: " + e.getMessage());
        }
    }

    @Override
    public List<Card> findAll() {
        List<Card> list = new ArrayList<>();
        try (ResultSet rs = XJdbc.executeQuery(findAllSql)) {
            while (rs.next()) {
                Card card = new Card();
                card.setId(rs.getInt("Id"));
                card.setStatus(rs.getInt("Status"));
                list.add(card);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error finding all cards: " + e.getMessage());
        }
        return list;
    }

    @Override
    public Card findById(Integer id) {
        try (ResultSet rs = XJdbc.executeQuery(findByIdSql, id)) {
            if (rs.next()) {
                Card card = new Card();
                card.setId(rs.getInt("Id"));
                card.setStatus(rs.getInt("Status"));
                return card;
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error finding card by id: " + e.getMessage());
        }
        return null;
    }
}
