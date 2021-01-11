/**
 * 
 */
package com.xebia.serviceimpl;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;


/**
 * @author m.bm.kumar
 *
 */
@ExtendWith(MockitoExtension.class)
class DeliveryLocationServiceimplTest {

	@InjectMocks
	DeliveryLocationServiceimpl underTest;

	/**
	 * Test method for
	 * {@link com.xebia.serviceimpl.DeliveryLocationServiceimpl#checkDeliveryLocation(java.lang.String)}.
	 */
	@Test
	void testCheckDeliveryLocation() {
		Boolean status = underTest.checkDeliveryLocation("122001");
		assertTrue(status, "Assuming service will return true when food is available to deliver at zi code");
	}

}
