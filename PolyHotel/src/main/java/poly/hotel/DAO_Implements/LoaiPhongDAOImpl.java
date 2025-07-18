
package poly.hotel.DAO.Impl;

import java.util.List;
import poly.cafe.dao.LoaiPhongDAO;
import poly.cafe.entity.LoaiPhong;
import poly.cafe.util.XJdbc;
import poly.cafe.util.XQuery;

/**
 *
 * @author truon
 */
public class LoaiPhongDAOImpl implements LoaiPhongDAO { 
 
    String createSql = "INSERT INTO Categories(Id, Name) VALUES(?, ?)"; 
    String updateSql = "UPDATE Categories SET Name=? WHERE Id=?"; 
    String deleteSql = "DELETE FROM Categories WHERE Id=?"; 
    String findAllSql = "SELECT * FROM Categories"; 
    String findByIdSql = "SELECT * FROM Categories WHERE Id=?"; 
 
    @Override 
    public LoaiPhong create(LoaiPhong entity) { 
        Object[] values = { 
            entity.getId(), 
            entity.getName() 
        }; 
        XJdbc.executeUpdate(createSql, values); 
        return entity; 
    } 
    @Override 
    public void update(LoaiPhong entity) { 
        Object[] values = { 
            entity.getName(), 
            entity.getId() 
        }; 
        XJdbc.executeUpdate(updateSql, values); 
    } 
    @Override 
    public void deleteById(String id) { 
        XJdbc.executeUpdate(deleteSql, id); 
    } 
    @Override 
    public List<LoaiPhong> findAll() { 
        return XQuery.getEntityList(LoaiPhong.class, findAllSql); 
    } 
    @Override 
    public LoaiPhong findById(String id) { 
        return XQuery.getSingleBean(LoaiPhong.class, findByIdSql, id); 
    } 
} 
