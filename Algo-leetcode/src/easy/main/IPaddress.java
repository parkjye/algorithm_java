package easy.main;

public class IPaddress {
	/* 1108. defanging an ip address */
	public static void main(String[] args) {
		String address = "1.1.1.1";
		
		IPaddress ip = new IPaddress();
		System.out.println(ip.defangIPaddr(address));

	}

	public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}
