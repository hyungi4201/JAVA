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
			System.out.print("������ �Է����ּ���: ");
			market.fruit = sc.nextInt();
		}
		
			System.out.print("�� ��ðڽ��ϱ�? (y/n)");
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
				System.out.print("������ �Է����ּ���: ");
				market.house = sc.nextInt();
			}
				System.out.print("�� ��ðڽ��ϱ�? (y/n)");
				k = sc.next();			
			}
		this.buyItem();
	}
	void tagHomeSupply() {
		
	}
	void buyItem() {
		int x;
		System.out.println("� �������� ��ڽ��ϱ�?(1. ���� 2.������ǰ) : ");
		x = sc.nextInt();
		if ( x == 1)
			this.buyFruit();
		else if (x == 2 )
			this.buyHomeSupply();
		else {
			System.out.println("�߸��Է��߽��ϴ�. �ٽ� �Է����ּ���. ");
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
			System.out.println("� �۾��� �Ͻðڽ��ϱ�? (1. ��ǰ �鿩���� 2. ��ǰ�� �±׺��̱� 3. ��ǰ �ѷ����� 4. ��ġ��) : ");
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
				System.out.println("�߸��Է��߽��ϴ�. �ٽ� �Է����ּ���. ");
				continue;
			}
		}while (work != 4);
	}
}
