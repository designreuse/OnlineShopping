package mum.edu.repository;

import mum.edu.domain.OrderItem;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by su on 10/7/16.
 */

@Repository
public interface OrderItemRepository extends CrudRepository<OrderItem,Long> {
}
