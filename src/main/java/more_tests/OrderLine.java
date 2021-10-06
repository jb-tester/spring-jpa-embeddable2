package more_tests;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "ordre_linje")
@Entity
public class OrderLine {
    @EmbeddedId
    private OrderLineKey id;
}
