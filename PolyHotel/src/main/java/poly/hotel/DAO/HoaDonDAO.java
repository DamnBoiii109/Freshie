package poly.hotel.dao;

import java.util.Date;
import java.util.List;
import poly.cafe.entity.HoaDon;

public interface HoaDonDAO extends CrudDAO<HoaDon, String> {
    /**
     * Truy vấn hóa đơn theo người dùng
     * 
     * @param tenNguoiDung tên đăng nhập của người dùng
     * @return danh sách hóa đơn
     */
    public List<HoaDon> findByTenNguoiDung(String tenNguoiDung);

    /**
     * Truy vấn hóa đơn theo mã đặt dịch vụ
     * 
     * @param maDatDichVu mã đặt dịch vụ
     * @return danh sách hóa đơn
     */
    public List<HoaDon> findByMaDatDichVu(String maDatDichVu);

    /**
     * Truy vấn hóa đơn tạo trong khoảng thời gian
     * 
     * @param from thời gian bắt đầu
     * @param to thời gian kết thúc
     * @return danh sách hóa đơn
     */
    public List<HoaDon> findByTimeRange(Date from, Date to);

    /**
     * Truy vấn hóa đơn theo người dùng và khoảng thời gian
     * 
     * @param tenNguoiDung tên đăng nhập người dùng
     * @param from thời gian bắt đầu
     * @param to thời gian kết thúc
     * @return danh sách hóa đơn
     */
    public List<HoaDon> findByUserAndTimeRange(String tenNguoiDung, Date from, Date to);
}

