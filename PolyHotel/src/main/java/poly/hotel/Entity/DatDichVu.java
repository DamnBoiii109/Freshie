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
    private double NgayKetThuc; 
    private double TrangThaiDat; 
    private boolean TrangThaiHuy; 
    private String TenNguoiDung;
private String MaPhong;
    
} 

