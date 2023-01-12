package sia.tacocloud.dao.jdbc;

import sia.tacocloud.entity.Taco;

public interface TacoRepository  {

  Taco save(Taco design);
  
}
