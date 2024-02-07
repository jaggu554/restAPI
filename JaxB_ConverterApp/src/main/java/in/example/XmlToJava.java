package in.example;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class XmlToJava {

	public static void main(String[] args) throws Exception {
		
		File f=new File("customer.xml");
		
		JAXBContext context=JAXBContext.newInstance(Customer.class);
		
		Unmarshaller unmarshaller=context.createUnmarshaller();
		Object obj=unmarshaller.unmarshal(f);
		Customer c=(Customer)obj;
		System.out.println(c);
	}
}
