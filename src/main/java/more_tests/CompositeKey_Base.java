package more_tests;

import javax.persistence.Embeddable;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@MappedSuperclass
@Embeddable
public abstract class CompositeKey_Base implements Serializable {
   private static final long serialVersionUID = 42L;

    protected CompositeKey_Base() {
    }

    public int hashCode() {
        return 1;
    }

    public boolean equals(Object object) {
        return true;
    }

    public String toString() {
        return "smth";
    }
}