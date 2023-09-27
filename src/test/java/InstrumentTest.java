import com.codebase.InstrumentBrand;
import com.codebase.Instrument;
import com.codebase.InstrumentBrand;
import com.codebase.TypeOfInstrument;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InstrumentTest {
    Instrument instrument;
    @Before

    public void before() {
    }
    @Test

    public void instrumentHasBrand(){
        Instrument instrument1 = new Instrument(InstrumentBrand.YAMAHA, TypeOfInstrument.GUITAR, 500.00);

        assertEquals("Yamaha", instrument1.getBrand());
    }

    @Test
    public void instrumentHasType(){
        Instrument instrument1 = new Instrument(InstrumentBrand.YAMAHA, TypeOfInstrument.GUITAR, 500.00);
        assertEquals("Guitar", instrument1.getType());
    }


}
