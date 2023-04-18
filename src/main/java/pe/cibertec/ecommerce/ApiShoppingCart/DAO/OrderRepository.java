/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.cibertec.ecommerce.ApiShoppingCart.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.cibertec.ecommerce.ApiShoppingCart.entity.Order;




public interface OrderRepository extends JpaRepository<Order , Long>{
    
}
