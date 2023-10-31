package ch.bbw.addressbook;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AddressServiceWithMockTest {
    private AddressService addressService;
    private AddressDAO addressDAO;

    @BeforeEach
    public void setUp() {
        addressDAO = new AddressDAOMock();
        addressService = new AddressService(addressDAO);
    }

    @Test
    void testGetAllAddressesWithMock() {
        Address address1 = new Address(1, "Bob", "Bem", "123456789", new Date());
        Address address2 = new Address(2, "Bim", "Bomb", "987654321", new Date());
        addressDAO.create(address1);
        addressDAO.create(address2);

        List<Address> addresses = addressService.getAllAddresses();
        assertNotNull(addresses);
        assertEquals(2, addresses.size());
    }

    @Test
    void testRegisterAddressWithMock() {
        Address address = new Address(0, "Bumb", "Bimb", "123456789");
        addressService.registerAddress(address);

        Address retrievedAddress = addressDAO.read(0);
        assertNotNull(retrievedAddress);
        assertEquals("Bumb", retrievedAddress.getFirstname());
    }
}
