package poly.hotel.DAO_Implements;

import java.util.List;
import poly.hotel.DAO.NhanVienDAO;
import poly.hotel.Entity.NhanVien;
import poly.hotel.util.XJdbc;
import poly.hotel.util.XQuery;

public class NhanVienDAOImpl implements NhanVienDAO {

    String createSql = "INSERT INTO NhanVien(TenNguoiDung,MatKhau,KichHoat,AnhDaiDien,VaiTroQuanLy) VALUES(?, ?, ?, ?, ?)";
    String updateSql = "UPDATE NhanVien SET MatKhau=? WHERE TenNguoiDung=? ";
    String deleteByIdSql = "DELETE FROM NhanVien WHERE TenNguoiDung=?";
    String findAllSql = "SELECT * FROM NhanVien";
    String findByIdSql = "SELECT * FROM NhanVien WHERE TenNguoiDung=?";

    @Override
    public NhanVien create(NhanVien entity) {
        Object[] values = {
            entity.getTenDangNhap(),
            entity.getMatKhau(),
            entity.isKichHoat(),
            entity.getImage(),
            entity.isQuanLy()
        };
        XJdbc.executeUpdate(createSql, values);
        return entity;
    }

    @Override
    public void update(NhanVien entity) {
        Object[] values = {
            entity.getMatKhau(),
            entity.isKichHoat(),
            entity.getImage(),
            entity.isQuanLy(),
            entity.getTenDangNhap()
        };
        XJdbc.executeUpdate(updateSql, values);
    }

    @Override
    public void deleteById(String id) {
        XJdbc.executeUpdate(deleteByIdSql, id);
    }

    @Override
    public List<NhanVien> findAll() {
        return XQuery.getBeanList(NhanVien.class, findAllSql);
    }

    @Override
    public NhanVien findById(String id) {
        return XQuery.getSingleBean(NhanVien.class, findByIdSql, id);
    }
}
