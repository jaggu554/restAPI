package in.example;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class Customer {

	private Integer cid;
	
	private String customerName;
	
	private String customerMobile;
	
	private String customerDelivery;
	
	
	
}
