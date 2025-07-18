package poly.cafe.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import poly.cafe.entity.DatDichVu;
import poly.cafe.util.XJdbc;
import poly.cafe.util.XStr;
import poly.cafe.dao.DatDichVuDAO;
import poly.cafe.util.XQuery;

public class DatDichVuDAOImpl implements DatDichVuDAO {

    private final String createSql = "INSERT INTO SOF2042_DatDichVu(MaDatDichVu, NgayDat,NgayKetThuc,TrangThaiDat, TrangThaiHuy, TenNguoiDung, MaPhong) VALUES(?, ?, ?, ?, ?, ?, ?)";
    private final String updateSql = "UPDATE SOF2042_Drinks SET NgayDat=?, NgayKetThuc=?, TrangThaiDat=?, TrangThaiHuy=?, TenNguoiDung=?, LoaiPhongId=? WHERE MaDatDichVu=?";
    private final String deleteByIdSql = "DELETE FROM SOF2042_DatDichVu WHERE MaDatDichVu=?";
    
    private final String findAllSql = "SELECT * FROM SOF2042_DatDichVu";
    private final String findByIdSql = findAllSql + " WHERE MaDatDichVu =?";
    private final String findByCategoryIdSql = findAllSql + " WHERE DatDichVuId=?";

    @Override
    public DatDichVu create(DatDichVu entity) {
        entity.setId(XStr.getKey());
        Object[] values = {
            entity.getMaDatDichVu(),
            entity.getNgayDat(),
            entity.getNgayKetThuc(),
            entity.getTrangThaiDat(),
            entity.getTrangThaiHuy(),
            entity.isTenNguoiDung(),
            entity.getMaPhongId()
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
            entity.isTenNguoiDung(),
            entity.getMaPhongId()
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
    public List<DatDichVu> findByLoaiPhongId(String categoryId) {
        return XQuery.getBeanList(DatDichVu.class, findByLoaiPhongIdSql, categoryId);
    }    
}
