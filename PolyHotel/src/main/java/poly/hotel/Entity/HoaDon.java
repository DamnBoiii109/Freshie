package poly.hotel.entity;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class HoaDon {  
    private String maHoaDon;         
    private String maDatDichVu;     
    private Date ngayTaoDon;         
    private double thanhTien;        

    public static final String DATE_PATTERN = "HH:mm:ss dd-MM-yyyy";
}

