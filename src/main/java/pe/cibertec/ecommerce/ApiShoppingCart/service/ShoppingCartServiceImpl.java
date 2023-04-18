/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.ecommerce.ApiShoppingCart.service;

import jakarta.transaction.Transactional;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.cibertec.ecommerce.ApiShoppingCart.DAO.OrderRepository;
import pe.cibertec.ecommerce.ApiShoppingCart.dto.Purchase;
import pe.cibertec.ecommerce.ApiShoppingCart.dto.PurchaseResponse;
import pe.cibertec.ecommerce.ApiShoppingCart.entity.Order;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService {
    
    @Autowired
    private OrderRepository orderRepository;
    
    @Override
    @Transactional
    public PurchaseResponse placeOrder (Purchase purchase){
         Order order= purchase.getOrder();
         order.setTrackingNumber(getTrackingNumber());
         purchase.getOrderItems().forEach(i->{
             order.addOrderItem(i);
         });
        orderRepository.save(order);
        return new PurchaseResponse(order.getTrackingNumber());
    }

    private String getTrackingNumber() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return UUID.randomUUID().toString();
    }
    
  
    
}
    

