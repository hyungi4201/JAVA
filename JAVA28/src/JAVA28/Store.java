package JAVA28;

import java.util.Scanner;
class Market{
	String[] fruitItem;
	String[] houseItem;
	Fruit[] fruits;
	int fruit;
	int house;
	private final int MAXITEM = 10;
	
	int getMaxitem() {
		return MAXITEM;
	}
	void printItems() {
		for ( int i = 0; ; i++) {
			System.out.println(fruitItem[i]);
		for ( int r = 0; ; r++) {
			System.out.println(fruitItem[r]);
		}
	}
}
	
class Manager{
	String name;
	Market market;
	
	Scanner sc = new Scanner(System.in);
	
	public Manager (Market market) {
		this.market = market;
	}
	void buyFruit() {
		String k;
		while (k == "y") {
			while(market.fruit > market.getMaxitem()) {
			System.out.print("개수를 입력해주세요: ");
			market.fruit = sc.nextInt();
		}
		
			System.out.print("더 사시겠습니까? (y/n)");
			k = sc.next();			
		}
		market.fruits = new Fruit[market.fruit];
		this.buyItem();
		}
	void tagFruit() {
		
	}
	void buyHomeSupply() {
		String k;
		
		while (k == "y") {
			while(market.house > market.getMaxitem()) {
				System.out.print("개수를 입력해주세요: ");
				market.house = sc.nextInt();
			}
				System.out.print("더 사시겠습니까? (y/n)");
				k = sc.next();			
			}
		this.buyItem();
	}
	void tagHomeSupply() {
		
	}
	void buyItem() {
		int x;
		System.out.println("어떤 아이템을 사겠습니까?(1. 과일 2.가정용품) : ");
		x = sc.nextInt();
		if ( x == 1)
			this.buyFruit();
		else if (x == 2 )
			this.buyHomeSupply();
		else {
			System.out.println("잘못입력했습니다. 다시 입력해주세요. ");
			continue;
		}
	}
}

class Fruit{
	Market market;
	String type;
	int price;
	String life;
}

class HomeSupplies {
	Market market;
	String type;
	int price;
}
public class Store {
	public static void main(String args[]) {
		Market m=new Market();
		Manager manager = new Manager(m);
		int work;
		Scanner sc = new Scanner(System.in);
		m.setManagers(manager);
		do {
			System.out.println("어떤 작업을 하시겠습니까? (1. 상품 들여오기 2. 상품에 태그붙이기 3. 상품 둘러보기 4. 마치기) : ");
			work = sc.nextInt();
			if(work==1)
				manager.buyitem();
			else if(work==2)
				manager.tagitem();
			else if(work==3)
				manager.printitems();
			else if (work==4)
				break;
			else {
				System.out.println("잘못입력했습니다. 다시 입력해주세요. ");
				continue;
			}
		}while (work != 4);
	}
}
