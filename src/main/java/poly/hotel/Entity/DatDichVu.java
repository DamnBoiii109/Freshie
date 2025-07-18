package Poly.Hotel.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Data;

/**
 *
 * @author truon
 */
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class DatDichVu {

    private String MaDatDichVu;
    private String NgayDat;
    @Builder.Default
    private double NgayKetThuc = 0.0;
    private Boolean TrangThaiDat;
    private Boolean TrangThaiHuy;
    private String TenNguoiDung;
    private String MaPhong;

    public void setId(String key) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
