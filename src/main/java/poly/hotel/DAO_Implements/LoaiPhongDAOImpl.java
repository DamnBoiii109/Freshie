package poly.hotel.DAO_Implements;

import Poly.hotel.entity.LoaiPhong;
import java.util.List;
import poly.hotel.dao.LoaiPhongDAO;
import poly.hotel.util.XJdbc;
import poly.hotel.util.XQuery;

public class LoaiPhongDAOImpl implements LoaiPhongDAO {

    private final String insertSql = "INSERT INTO LoaiPhong (LoaiPhong, TenLoaiPhong, GiaPhong, GhiChu) VALUES (?, ?, ?, ?)";
    private final String updateSql = "UPDATE LoaiPhong SET TenLoaiPhong = ?, GiaPhong = ?, GhiChu = ? WHERE LoaiPhong = ?";
    private final String deleteSql = "DELETE FROM LoaiPhong WHERE LoaiPhong = ?";
    private final String selectAllSql = "SELECT * FROM LoaiPhong";
    private final String selectByIdSql = "SELECT * FROM LoaiPhong WHERE LoaiPhong = ?";

    @Override
    public LoaiPhong create(LoaiPhong entity) {
        Object[] values = {
            entity.getLoaiPhong(),
            entity.getTenLoaiPhong(),
            entity.getGiaPhong(),
            entity.getGhiChu()
        };
        XJdbc.executeUpdate(insertSql, values);
        return entity;
    }

    @Override
    public void update(LoaiPhong entity) {
        Object[] values = {
            entity.getTenLoaiPhong(),
            entity.getGiaPhong(),
            entity.getGhiChu(),
            entity.getLoaiPhong()
        };
        XJdbc.executeUpdate(updateSql, values);
    }

    @Override
    public void deleteById(String id) {
        XJdbc.executeUpdate(deleteSql, id);
    }

    @Override
    public List<LoaiPhong> findAll() {
        return XQuery.getBeanList(LoaiPhong.class, selectAllSql);
    }

    @Override
    public LoaiPhong findById(String id) {
        return XQuery.getSingleBean(LoaiPhong.class, selectByIdSql, id);
    }
}
