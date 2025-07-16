
package Poly.Hotel.dao.impl;

import java.util.List;
import poly.cafe.dao.DatDichVuDAO;
import poly.cafe.entity.DatDichVu;
import poly.cafe.util.XQuery;

/**
 *
 * @author truon
 */
public class DatDichVuDAOImpl implements DatDichVuDAO { 
    String createSql = "…"; 
    String updateSql = "…"; 
    String deleteSql = "…"; 
    String findAllSql = "…"; 
    String findByIdSql = "…"; 
 
    String findByLoaiPhongIdSql = "SELECT * FROM DatDichVu WHERE LoaiPhongId=?"; 
 
    @Override 
    public DatDichVu create(DatDichVu entity) {
        return null;
    } 
    @Override 
    public void update(DatDichVu entity) {}
    @Override 
    public void deleteById(String id) {} 
    @Override 
    public List< DatDichVu> findAll() {
        return null;
    } 
    @Override 
    public DatDichVu findById(String id) {
        return null;
    } 
 
    @Override 
    public List<DatDichVu> findByLoaiPhongId(String LoaiPhongId) { 
        return XQuery.getBeanList(DatDichVu.class, findByLoaiPhongIdSql, LoaiPhongId);
}
}
