import com.codebase.Instrument;
import com.codebase.InstrumentBrand;
import com.codebase.Shop;
import com.codebase.TypeOfInstrument;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    Instrument instrument;
    Shop shop;

    @Test
    public void shopHAsName(){
        Shop shop = new Shop("JamminWithJason");
        assertEquals("JamminWithJason", shop.getName());
    }

    @Test
    public void canAddInstrument(){
        Shop shop = new Shop ("JamminWithJason");
        Instrument instrument = new Instrument(InstrumentBrand.YAMAHA, TypeOfInstrument.GUITAR, 350.00);
        shop.addInstrument(instrument);
        Instrument instrument2 = new Instrument(InstrumentBrand.YAMAHA, TypeOfInstrument.GUITAR, 350.00);
        shop.addInstrument(instrument2);
        assertEquals(2, shop.getInstruments().size());

    }

}
