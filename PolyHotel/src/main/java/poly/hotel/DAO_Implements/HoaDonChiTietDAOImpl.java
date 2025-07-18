
package poly.Hotel.dao.impl;

import java.util.List;
import poly.Hotel.dao.ChiTietHoaDonDAO;
import poly.Hotel.entity.ChiTietHoaDon;

/**
 *
 * @author truon
 */
public class ChiTietHoaDonDAOImpl implements ChiTietHoaDonDAO { 
    String createSql = "…"; 
    String updateSql = "…"; 
    String deleteSql = "…"; 
    String findAllSql = "SELECT bd.*, d.name AS TenDichVu  \n" +
"FROM ChiTietHoaDon bd JOIN DatDichVu d ON d.Id=bd.DichVuId"; 
    String findByIdSql = "SELECT bd.*, d.name AS TenDichVu  \n" +
"FROM ChiTietHoaDon bd JOIN DatDichVu d ON d.Id=bd.DichVuId WHERE bd.Id=?";  
    String findByChiTietHoaDonIdSql = "SELECT bd.*, d.name AS TenDichVu  \n" +
"FROM ChiTietHoaDon bd JOIN DatDichVu d ON d.Id=bd.DichVuId WHERE bd.HoaDonId=?"; 
String findByDichVuIdSql = "SELECT bd.*, d.name AS TenDichVu  \n" +
"FROM ChiTietHoaDon bd JOIN DatDichVu d ON d.Id=bd.DichVuId WHERE bd.DichVuId=?"; 
@Override 
public ChiTietHoaDon create(ChiTietHoaDon entity) {return null;
} 
@Override 
public void update(ChiTietHoaDon entity) {} 
@Override 
public void deleteById(Long id) {} 
@Override 
public List<ChiTietHoaDon> findAll() {
        return null;
    } 
@Override 
public ChiTietHoaDon findById(Long id) {
        return null;
    } 
@Override 
public List<ChiTietHoaDon> findByHoaDonId(Long HoaDonId) {
        return null;
    }     
@Override 
public List<ChiTietHoaDon> findByDichVuId(String DichVuId) {
        return null;
    }  
}
