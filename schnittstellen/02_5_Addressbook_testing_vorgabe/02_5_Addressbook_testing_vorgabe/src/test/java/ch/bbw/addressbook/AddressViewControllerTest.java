package ch.bbw.addressbook;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class AddressViewControllerTest {

    private AddressViewController addressViewController;

    @Mock
    private AddressService addressService;

    @BeforeEach
    public void setUp() {
        addressService = Mockito.mock(AddressService.class);
        addressViewController = new AddressViewController();
    }

    @Test
    void testGetAddresses() {
        Address address1 = new Address(1, "Bomba", "Bumba", "123456789", new Date());
        Address address2 = new Address(2, "Bimba", "Bamba", "987654321", new Date());
        Mockito.when(addressService.getAllAddresses()).thenReturn(Arrays.asList(address1, address2));

        addressViewController.getAddresses();
        List<Address> addresses = addressViewController.getAddresses();
        assertNotNull(addresses);
        assertEquals(2, addresses.size());
    }

    @Test
    void testSaveAddress() {
        addressViewController.setFirstname("Bomba");
        addressViewController.setLastname("Bumba");
        addressViewController.saveAddress();

        verify(addressService, times(1)).registerAddress(any(Address.class));
    }
}
