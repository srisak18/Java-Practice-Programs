	package demo1;
	import java.util.Scanner;
	
	class Customer{
	    private String name;
	    private String email;
	    private long phone;
	    private String password;
	    private String address;
	    
	    public void setName(String name) {
	        this.name = name;
	    }
	    
	    public String getName() {
	        return name;
	    }
	    
	    public void setEmail(String email) {
	        this.email = email;
	    }
	    
	    public String getEmail() {
	        return email;
	    }
	    
	    public void setPhone(long phone) {
	        this.phone = phone;
	    }
	    
	    public long getPhone() {
	        return phone;
	    }
	    
	    public void setPassword(String password) {
	        this.password = password;
	    }
	    
	    public String getPassword() {
	        return password;
	    }
	    
	    public void setAddress(String address) {
	        this.address = address;
	    }
	    
	    public String getAddress() {
	        return address;
	    }
	}
	
	public class HomeWork1 {
	    public static void main(String[] args) {
	    
	        Scanner scan = new Scanner(System.in);
	        int n = scan.nextInt();
	        Customer[] a = new Customer[n];
	        
	        for(int i=0; i<a.length; i++) {
	            Customer c = new Customer();
	            c.setName(scan.next());
	            c.setEmail(scan.next());
	            c.setPhone(scan.nextLong());
	            c.setPassword(scan.next());
				scan.nextLine();
	            c.setAddress(scan.nextLine());
	            a[i] = c;
	        }
	        
	        for(int i=0; i<a.length; i++) {
	            Customer c = a[i];
	            System.out.println(i+1);
	            System.out.println(c.getName());
	            System.out.println(c.getEmail());
	            System.out.println(c.getPhone());
	            System.out.println(c.getPassword());
	            System.out.println(c.getAddress());
	        }
	    }
}

