/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.ecommerce.ApiShoppingCart.entity;

import jakarta.persistence.Embeddable;
import java.math.BigDecimal;
import lombok.Data;


@Data
@Embeddable
public class Item {
       private Long productId;
       private String productName;
       private BigDecimal unitPrice;
    
}
