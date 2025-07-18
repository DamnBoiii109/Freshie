/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.hotel.util;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class User {
    private String username;
    private String password;
    private boolean enabled;
    private String fullname;
    private String photo;
    private boolean manager;
}
