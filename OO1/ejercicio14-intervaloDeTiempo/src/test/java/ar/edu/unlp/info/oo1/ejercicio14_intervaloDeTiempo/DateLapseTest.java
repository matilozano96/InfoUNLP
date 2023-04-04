 package ar.edu.unlp.info.oo1.ejercicio14_intervaloDeTiempo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DateLapseTest {

	DateLapse v1, v2;
	LocalDate from = LocalDate.parse("2022-02-02");
	int days = 100;
	LocalDate to = from.plusDays(days);
	
	@BeforeEach
	void setUp() throws Exception {
		v1 = new DateLapse_v1(from, to);
		v2 = new DateLapse_v2(from, days);
	}
	
    @Test
    public void testGetTo() {
    	assertEquals(to,v1.getTo());
    	assertEquals(to,v2.getTo());
    	assertEquals(v1.getTo(),v2.getTo());
    }
    
    @Test
    public void testDays() {
    	assertEquals(days,v1.sizeInDays());
    	assertEquals(days,v2.sizeInDays());
    }
    
    @Test
    public void testIncludesDate() {
    	LocalDate valid = from.plusDays(50);
    	LocalDate invalid = from.minusDays(50);
    	
    	assertTrue(v1.includesDate(valid));
    	assertTrue(v2.includesDate(valid));
    	
    	assertFalse(v1.includesDate(invalid));
    	assertFalse(v2.includesDate(invalid));
    }
}
