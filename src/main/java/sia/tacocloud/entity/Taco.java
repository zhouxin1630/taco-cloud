package sia.tacocloud.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

@Data
@RequiredArgsConstructor
public class Taco {
    private Long id;

    private Date createdAt;

//end::newFields[]

    @NotNull
    @Size(min=5, message="Name must be at least 5 characters long")
    private String name;

    @Size(min=1, message="You must choose at least 1 ingredient")
    private List<Ingredient> ingredients;

  /*
//tag::newFields[]
   ...

//end::newFields[]
   */
//tag::newFields[]
}
//end::newFields[]
