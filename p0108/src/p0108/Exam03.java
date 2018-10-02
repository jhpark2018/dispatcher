package p0108;

class SubscriberInfo {
    String name, id, password; 
    String phoneNo, address;
    SubscriberInfo(String name, String id, String password) {
        this.name = name;              
        this.id = id;              
        this.password = password;              
    }
    SubscriberInfo(String name, String id, String password, String phoneNo, String address) {
        this.name = name;              
        this.id = id;              
        this.password = password;              
        this.phoneNo = phoneNo;
        this.address = address;
    }
    void changePassword(String password) {
        this.password = password;              
    }
    void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
    void setAddress(String address) {
        this.address = address;
    }
    void printInfo() {
        System.out.println("이름:" + this.name);  
        System.out.println("아이디:" + this.id);   
        System.out.println("패스워드:" + this.password);  
        System.out.println("전화번호:" + this.phoneNo);   
        System.out.println("주소:" + this.address);   
        System.out.println(); 
    } 
}
public class Exam03 {

	public static void main(String args[]) {
        SubscriberInfo obj1, obj2;                        
        obj1 = new SubscriberInfo("연흥부", "poorman", "zebi");
        obj1.printInfo();
        obj2 = new SubscriberInfo("연놀부", "richman", "money", 
                                  "02-000-0000", "타워팰리스");
        obj2.printInfo();
        
   }
}
