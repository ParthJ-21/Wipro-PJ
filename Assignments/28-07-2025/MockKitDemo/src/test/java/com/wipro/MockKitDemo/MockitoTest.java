package com.wipro.MockKitDemo;
import com.wipro.MockKitDemo.OrderService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Test;

class MockitoTest {

	@Test
	public void testPlaceOrder() {
        OrderService mockService = mock(OrderService.class);

        when(mockService.Order("ORD-01")).thenReturn("successful");


        String result = mockService.Order("ORD-01");
        assertEquals("successful", result);
        verify(mockService).Order("ORD-01");
    }

}
