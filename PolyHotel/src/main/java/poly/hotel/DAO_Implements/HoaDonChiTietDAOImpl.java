
package poly.Hotel.dao.impl;

import java.util.List;
import poly.Hotel.dao.ChiTietHoaDonDAO;
import poly.Hotel.entity.ChiTietHoaDon;

/**
 *
 * @author truon
 */
public class ChiTietHoaDonDAOImpl implements ChiTietHoaDonDAO { 
    private final String createSql = "INSERT INTO SOF2042_BillDetails(BillId, DrinkId, UnitPrice, Discount, Quantity) VALUES(?, ?, ?, ?, ?)";
    private final String updateSql = "UPDATE SOF2042_BillDetails SET BillId=?, DrinkId=?, UnitPrice=?, Discount=?, Quantity=? WHERE Id=?";
    private final String deleteByIdSql = "DELETE FROM SOF2042_BillDetails WHERE Id=?";

    private final String findAllSql = "SELECT bd.*, d.name AS drinkName FROM SOF2042_BillDetails bd JOIN SOF2042_Drinks d ON d.Id=bd.DrinkId";
    private final String findByIdSql = findAllSql + " WHERE bd.Id=?";
    private final String findLastSql = findAllSql + " WHERE bd.Id IN(SELECT max(Id) FROM SOF2042_BillDetails)";
    private final String findByBillIdSql = findAllSql + " WHERE bd.BillId=?";
    private final String findByDrinkIdSql = findAllSql + " WHERE bd.DrinkId=?";
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
