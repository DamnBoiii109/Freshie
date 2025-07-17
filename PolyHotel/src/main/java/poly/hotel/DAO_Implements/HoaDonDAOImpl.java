package poly.hotel.dao.impl;

import java.util.Date;
import java.util.List;
import poly.cafe.entity.HoaDon;
import poly.cafe.util.XJdbc;
import poly.cafe.dao.HoaDonDAO;
import poly.cafe.util.XQuery;

public class HoaDonDAOImpl implements HoaDonDAO {

    private final String createSql = "INSERT INTO HoaDon(MaHoaDon, MaDatDichVu, NgayTaoDon, ThanhTien) VALUES(?, ?, ?, ?)";
    private final String updateSql = "UPDATE HoaDon SET MaDatDichVu=?, NgayTaoDon=?, ThanhTien=? WHERE MaHoaDon=?";
    private final String deleteByIdSql = "DELETE FROM HoaDon WHERE MaHoaDon=?";
    private final String findAllSql = "SELECT * FROM HoaDon";
    private final String findByIdSql = findAllSql + " WHERE MaHoaDon=?";
    private final String findByMaDatDichVuSql = findAllSql + " WHERE MaDatDichVu=?";
    private final String findByTimeRangeSql = findAllSql + " WHERE NgayTaoDon BETWEEN ? AND ? ORDER BY NgayTaoDon DESC";

    @Override
    public HoaDon create(HoaDon entity) {
        Object[] values = {
            entity.getMaHoaDon(),
            entity.getMaDatDichVu(),
            entity.getNgayTaoDon(),
            entity.getThanhTien()
        };
        XJdbc.executeUpdate(createSql, values);
        return entity;
    }

    @Override
    public void update(HoaDon entity) {
        Object[] values = {
            entity.getMaDatDichVu(),
            entity.getNgayTaoDon(),
            entity.getThanhTien(),
            entity.getMaHoaDon()
        };
        XJdbc.executeUpdate(updateSql, values);
    }

    @Override
    public void deleteById(String maHoaDon) {
        XJdbc.executeUpdate(deleteByIdSql, maHoaDon);
    }

    @Override
    public List<HoaDon> findAll() {
        return XQuery.getBeanList(HoaDon.class, findAllSql);
    }

    @Override
    public HoaDon findById(String maHoaDon) {
        return XQuery.getSingleBean(HoaDon.class, findByIdSql, maHoaDon);
    }

    @Override
    public List<HoaDon> findByMaDatDichVu(String maDatDichVu) {
        return XQuery.getBeanList(HoaDon.class, findByMaDatDichVuSql, maDatDichVu);
    }

    @Override
    public List<HoaDon> findByTimeRange(Date from, Date to) {
        return XQuery.getBeanList(HoaDon.class, findByTimeRangeSql, from, to);
    }
}

