package poly.Hotel.entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Data;
@NoArgsConstructor 
@AllArgsConstructor 
@Builder 
@Data 
public class ChiTietHoaDon { 
    private Long MaHoaDon; 
    private Long MaDichVu; 
    private int SoLuong; 
    private double DonGia; 
    private double ThanhTien; 

}
