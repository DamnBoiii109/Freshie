
package Poly.hotel.entity;

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
public class Category { 
    private String LoaiPhong; 
    private String TenLoaiPhong; 
    private double GiaPhong;
    private String GhiChu;
} 

