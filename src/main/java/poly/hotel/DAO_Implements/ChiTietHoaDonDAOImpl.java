
package poly.hotel.DAO_Implements;

import Poly.Hotel.entity.DatDichVu;
import java.util.List;
import poly.Hotel.entity.ChiTietHoaDon;
import poly.hotel.dao.ChiTietHoaDonDAO;

/**
 *
 * @author truon
 */
public class ChiTietHoaDonDAOImpl implements ChiTietHoaDonDAO { 
    private final String createSql = "INSERT INTO ChiTietHoaDon(MaHoaDon, MaDichVu, SoLuong, DonGia, ThanhTien) VALUES(?, ?, ?, ?, ?)";
    private final String updateSql = "UPDATE ChiTietHoaDon SET MaHoaDon=?, MaDichVu=?, SoLuong=?, DonGia=?, ThanhTien=? WHERE Id=?";
    private final String deleteByIdSql = "DELETE FROM ChiTietHoaDon WHERE MaHoaDon=?";
    private final String findAllSql = "SELECT bd.*, d.name AS TenDichVu FROM ChiTietHoaDon bd JOIN DatDichVu d ON d.Id=bd.MaDichVu";
    private final String findByIdSql = findAllSql + " WHERE bd.Id=?";
    private final String findLastSql = findAllSql + " WHERE bd.Id IN(SELECT max(Id) FROM ChiTietHoaDon)";
    private final String findByBillIdSql = findAllSql + " WHERE bd.MaHoaDon=?";
    private final String findByDrinkIdSql = findAllSql + " WHERE bd.MaDichVu=?";
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
public List<ChiTietHoaDon> findByDichVuId(String DichVuId) {
        return null;
    }  

    @Override
    public List<DatDichVu> findByDatDichVuId(String datDichVuId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
