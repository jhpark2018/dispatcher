package p0108;

class Account {
    String accountNo;    // 계좌번호
    String ownerName;    // 예금주 이름
    int balance;         // 잔액
    Account(String accountNo, String ownerName, int balance) {     // 생성자
        this.accountNo = accountNo; 
        this.ownerName = ownerName;  
        this.balance = balance;       
    }
    void  deposit(int amount)  {      
    	System.out.println("예 금:" + amount);
        balance += amount;
    }
    int withdraw(int amount) {
    	System.out.println("출 금:" + amount);
        if (balance < amount)
            return 0;
        balance -= amount;
        return amount;
    }
    void printAccount() {
        System.out.println("계좌번호:" + this.accountNo);  
        System.out.println("예금주 이름:" + this.ownerName);   
        System.out.println("잔액:" + this.balance);  
        System.out.println();                         // 줄 바꿈 문자 출력
    }   
}

public class Exam04 {

	public static void main(String args[]) {
        Account obj1 = new Account("111-222-33333333", "김영식", 200000);
        Account obj2 = new Account("555-666-77777777", "박진희", 1000000);
        obj1.deposit(1000000);
        obj1.printAccount();
        obj2.withdraw(200000); 
        obj2.printAccount();
   }
  
}	
