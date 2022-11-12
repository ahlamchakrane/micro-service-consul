package ma.enset.orderservice.repositories;

import ma.enset.orderservice.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource
public interface OrderRepository extends JpaRepository<Order, Long> {
    //localhost:9999/order-service/orders/search/byCustomerId?customerId=1&projection=fullProjection
    @RestResource(path = "/byCustomerId") //pour que cette methode soit accessible par rest
    List<Order> findByCustomerId(@Param("customerId") Long customerId);
}
