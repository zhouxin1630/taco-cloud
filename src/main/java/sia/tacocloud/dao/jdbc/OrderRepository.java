package sia.tacocloud.dao.jdbc;

import sia.tacocloud.entity.Order;

public interface OrderRepository {

  Order save(Order order);
  
}
