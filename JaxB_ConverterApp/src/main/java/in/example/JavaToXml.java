package in.example;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class JavaToXml {

	public static void main(String[] args) throws Exception {
		
		
		Customer c=new Customer();
		c.setCid(101);
		c.setCustomerName("Jagadeeswar reddy");
		c.setCustomerMobile("9381218722");
		c.setCustomerDelivery("ATP");
		
		JAXBContext context=JAXBContext.newInstance(Customer.class);
		Marshaller marshaller=context.createMarshaller();
		marshaller.marshal(c, new File("customer.xml"));
		System.out.println("Xml Created...");
	}
}
