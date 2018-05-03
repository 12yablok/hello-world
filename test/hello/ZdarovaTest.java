package hello;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ZdarovaTest{

    @Test
    public void summatorTest(){
        final Zdarova zdarova = new Zdarova();
        final int result = zdarova.summator(7,4);
        assertThat(result, is(11));
    }
}