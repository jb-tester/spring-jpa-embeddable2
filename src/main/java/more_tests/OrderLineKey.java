package more_tests;

import javax.persistence.Column;
import javax.persistence.Embeddable;

//@Embeddable
public class OrderLineKey extends CompositeKey_Base {
    @Column(name = "customerid", nullable = false)
    private Long customerId;

    @Column(name = "serialnumber", nullable = false)
    private Long serialNumber;
}
