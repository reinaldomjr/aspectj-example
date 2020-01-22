import com.sysweb.poc.aspect.SecuredMethod;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SecuredMethodTest {
    @Test
    void lockedMethod() {
        Assertions.assertThrows(Exception.class, () ->
                new SecuredMethod().lockedMethod()
        );
    }
    @Test
    void unlockedMethod() {
        new SecuredMethod().unlockedMethod();
    }
}