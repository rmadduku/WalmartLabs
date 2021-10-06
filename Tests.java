import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class Tests {
	@Test
	public void overflow() throws IOException {
		String rvString  = Main.seater("C:\\Users\\ragha\\eclipse-workspace\\Walmart_HW\\src\\over");
		String expectedString = "R001 B1, B5, B9, B13, B17 \n"
							  + "R002 C2, C6 \n"
							  + "R003 D1, D5, D9, D13 \n"
							  + "R004 E2, E6, E10, E14 \n"
							  + "R005 F1, F5, F9 \n";
		assertEquals(expectedString, rvString);
	}
	@Test
	public void normal() throws IOException {
		String rvString  = Main.seater("C:\\Users\\ragha\\eclipse-workspace\\Walmart_HW\\src\\example");
		String expectedString = "R001 B1, B5 \n"
				+ "R002 C2, C6, C10, C14 \n"
				+ "R003 D1, D5, D9, D13 \n"
				+ "R004 E2, E6, E10 \n"
				+ "";
		assertEquals(expectedString, rvString);
	}
	@Test
	public void noSpace() throws IOException {
		String rvString  = Main.seater("C:\\Users\\ragha\\eclipse-workspace\\Walmart_HW\\src\\max");
		String expectedString = "R009 J1, J5, J9, J13, J17 \n";
		assertEquals(expectedString, rvString);
	}
	@Test
	public void all() throws IOException {
		String rvString  = Main.seater("C:\\Users\\ragha\\eclipse-workspace\\Walmart_HW\\src\\all");
		System.out.println(rvString);
		String expectedString = "R000 A1, A5, A9, A13, A17 \n"
							  + "R001 B2, B6, B10, B14, \n"
							  + "R002 C1, C5, C9, C13, C17 \n"
							  + "R003 D2, D6, D10, D14, \n"
							  + "R004 E1, E5, E9, E13, E17 \n"
							  + "R005 F2, F6, F10, F14, \n"
							  + "R006 G1, G5, G9, G13, G17 \n"
							  + "R007 H2, H6, H10, H14, \n"
							  + "R008 I1, I5, I9, I13, I17 \n"
							  + "R009 J2, J6, J10, J14, \n"
							  + "";
		assertEquals(expectedString, rvString);
	}

}
