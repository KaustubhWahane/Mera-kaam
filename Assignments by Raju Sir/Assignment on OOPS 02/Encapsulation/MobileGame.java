package encap;

public class MobileGame {

	public static void main(String[] args) {
		ClashofClans c1 = new ClashofClans();
		/*Basically encapsulation aesi chiz hai jo sidha 
		khana dene ke bajaye ghuma firake dega
		*/
		c1.setLoot("9840118");
		System.out.println(c1.getLoot());

		c1.setElixir(187515);
		System.out.println(c1.getElixir());
		
		c1.setCoins(191461);
		System.out.println(c1.getCoins());
	}

}
