package p0108;

class GoodsStock {
    String goodsCode; 
    int stockNum;                       
    void addStock(int amount) {
    	System.out.println("입고수량:" + amount);
        stockNum += amount;              
    }
    int subtractStock(int amount) {
    	System.out.println("출고수량:" + amount);
        if (stockNum < amount)
            return 0;
        stockNum -= amount;            
        return amount;
    }
}

public class Exam02 {

	public static void main(String args[]) {
        GoodsStock obj;
        obj = new GoodsStock();
        obj.goodsCode = "52135";
        obj.stockNum = 200;
        System.out.println("상품코드:" + obj.goodsCode);
        System.out.println("재고수량:" + obj.stockNum);
        obj.addStock(1000);
        System.out.println("상품코드:" + obj.goodsCode);
        System.out.println("재고수량:" + obj.stockNum);
        obj.subtractStock(500);
        System.out.println("상품코드:" + obj.goodsCode);
        System.out.println("재고수량:" + obj.stockNum);
    }
}
