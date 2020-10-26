package cmps252.HW4_2.UnitTesting;

import static org.junit.jupiter.api.Assertions.*;
import java.io.FileNotFoundException;
import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import cmps252.HW4_2.Customer;
import cmps252.HW4_2.FileParser;

@Tag("26")
class Record_21 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 21: FirstName is Parker")
	void FirstNameOfRecord21() {
		assertEquals("Parker", customers.get(20).getFirstName());
	}

	@Test
	@DisplayName("Record 21: LastName is Durante")
	void LastNameOfRecord21() {
		assertEquals("Durante", customers.get(20).getLastName());
	}

	@Test
	@DisplayName("Record 21: Company is Beacon Realty Services Inc")
	void CompanyOfRecord21() {
		assertEquals("Beacon Realty Services Inc", customers.get(20).getCompany());
	}

	@Test
	@DisplayName("Record 21: Address is 2888 Bluff St  #-450")
	void AddressOfRecord21() {
		assertEquals("2888 Bluff St  #-450", customers.get(20).getAddress());
	}

	@Test
	@DisplayName("Record 21: City is Boulder")
	void CityOfRecord21() {
		assertEquals("Boulder", customers.get(20).getCity());
	}

	@Test
	@DisplayName("Record 21: County is Boulder")
	void CountyOfRecord21() {
		assertEquals("Boulder", customers.get(20).getCounty());
	}

	@Test
	@DisplayName("Record 21: State is CO")
	void StateOfRecord21() {
		assertEquals("CO", customers.get(20).getState());
	}

	@Test
	@DisplayName("Record 21: ZIP is 80301")
	void ZIPOfRecord21() {
		assertEquals("80301", customers.get(20).getZIP());
	}

	@Test
	@DisplayName("Record 21: Phone is 303-530-0368")
	void PhoneOfRecord21() {
		assertEquals("303-530-0368", customers.get(20).getPhone());
	}

	@Test
	@DisplayName("Record 21: Fax is 303-530-1253")
	void FaxOfRecord21() {
		assertEquals("303-530-1253", customers.get(20).getFax());
	}

	@Test
	@DisplayName("Record 21: Email is parker@durante.com")
	void EmailOfRecord21() {
		assertEquals("parker@durante.com", customers.get(20).getEmail());
	}

	@Test
	@DisplayName("Record 21: Web is http://www.parkerdurante.com")
	void WebOfRecord21() {
		assertEquals("http://www.parkerdurante.com", customers.get(20).getWeb());
	}
}
