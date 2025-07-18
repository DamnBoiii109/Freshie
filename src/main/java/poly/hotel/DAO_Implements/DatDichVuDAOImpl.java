package poly.hotel.DAO_Implements;

import Poly.Hotel.entity.DatDichVu;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import poly.hotel.dao.DatDichVuDAO;
import poly.hotel.util.XJdbc;
import poly.hotel.util.XQuery;
import poly.hotel.util.XStr;

public class DatDichVuDAOImpl implements DatDichVuDAO {

    private final String createSql = "INSERT INTO DatDichVu(MaDatDichVu, NgayDat,NgayKetThuc,TrangThaiDat, TrangThaiHuy, TenNguoiDung, MaPhong) VALUES(?, ?, ?, ?, ?, ?, ?)";
    private final String updateSql = "UPDATE Drinks SET NgayDat=?, NgayKetThuc=?, TrangThaiDat=?, TrangThaiHuy=?, TenNguoiDung=?, LoaiPhongId=? WHERE MaDatDichVu=?";
    private final String deleteByIdSql = "DELETE FROM DatDichVu WHERE MaDatDichVu=?";

    private final String findAllSql = "SELECT * FROM DatDichVu";
    private final String findByIdSql = findAllSql + " WHERE MaDatDichVu =?";
    private final String findByLoaiPhongIdSql = findAllSql + " WHERE DatDichVuId=?";

    @Override
    public DatDichVu create(DatDichVu entity) {
        entity.setId(XStr.getKey());
        Object[] values = {
            entity.getMaDatDichVu(),
            entity.getNgayDat(),
            entity.getNgayKetThuc(),
            entity.getTrangThaiDat(),
            entity.getTrangThaiHuy(),
            entity.getTenNguoiDung(),
            entity.getMaPhong()

        };
        XJdbc.executeUpdate(createSql, values);
        return entity;
    }

    @Override
    public void update(DatDichVu entity) {
        Object[] values = {
            entity.getMaDatDichVu(),
            entity.getNgayDat(),
            entity.getNgayKetThuc(),
            entity.getTrangThaiDat(),
            entity.getTrangThaiHuy(),
            entity.getTenNguoiDung(),
            entity.getMaPhong()
        };
        XJdbc.executeUpdate(updateSql, values);
    }

    @Override
    public void deleteById(String id) {
        XJdbc.executeUpdate(deleteByIdSql, id);
    }

    @Override
    public List<DatDichVu> findAll() {
        return XQuery.getBeanList(DatDichVu.class, findAllSql);
    }

    @Override
    public DatDichVu findById(String id) {
        return XQuery.getSingleBean(DatDichVu.class, findByIdSql, id);
    }

    @Override
    public List<DatDichVu> findByLoaiPhongId(String LoaiPhongId) {
        return XQuery.getBeanList(DatDichVu.class, findByLoaiPhongIdSql, LoaiPhongId);
    }
}
