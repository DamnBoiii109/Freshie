package poly.hotel.Entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class NhanVien{
  private String TenDangNhap;
  private String MatKhau;
  private boolean KichHoat;
  private String Image;
  private boolean QuanLy;
}
