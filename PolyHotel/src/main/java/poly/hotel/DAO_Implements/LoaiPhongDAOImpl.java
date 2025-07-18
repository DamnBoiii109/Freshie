
package Poly.hotel.DAO.Impl;

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
 
    String createSql = "INSERT INTO LoaiPhong(LoaiPhong, TenLoaiPhong, GiaPhong, GhiChu) VALUES(?,?)"; 
    String updateSql = "UPDATE LoaiPhong SET TenLoaiPhong=? WHERE LoaiPhong=?"; 
    String deleteSql = "DELETE FROM LoaiPhong WHERE LoaiPhong=?"; 
    String findAllSql = "SELECT * FROM LoaiPhong"; 
    String findByLoaiPhongSql = "SELECT * FROM LoaiPhong WHERE LoaiPhong=?"; 
 
    @Override 
    public LoaiPhong create(LoaiPhong entity) { 
        Object[] values = { 
            entity.getLoaiPhong(), 
            entity.getTenLoaiPhong() 
        }; 
        XJdbc.executeUpdate(createSql, values); 
        return entity; 
    } 
    @Override 
    public void update(LoaiPhong entity) { 
        Object[] values = { 
            entity.getTenLoaiPhong(), 
            entity.getLoaiPhong() 
        }; 
        XJdbc.executeUpdate(updateSql, values); 
    } 
    @Override 
    public void deleteByLoaiPhong(String LoaiPhong) { 
        XJdbc.executeUpdate(deleteSql, LoaiPhong); 
    } 
    @Override 
    public List<LoaiPhong> findAll() { 
        return XQuery.getEntityList(LoaiPhong.class, findAllSql); 
    } 
    @Override 
    public LoaiPhong findByLoaiPhong(String LoaiPhong) { 
        return XQuery.getSingleBean(LoaiPhong.class, findByLoaiPhongSql, LoaiPhong); 
    } 
} 
