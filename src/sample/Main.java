package sample;

public class Main {
	public static void main(String[] args){
		System.out.println("Hello");
		Parent takeda = new Parent("ïêìcÇ≥ÇÒ");
		Parent wada = new Parent("òaìcÇ≥ÇÒ");

		Child gondo = new Child("å†ì°Ç≥ÇÒ");
		Main.showName(gondo);
		//System.out.println(gondo.getName());
		//System.out.println(gondo.getChildName());
		
		Main.showName(takeda);
		Main.showName(wada);
		Main.showName(takeda);
		Main.showName(wada);
		/*
		System.out.println(wada.getName());
		System.out.println(takeda.getName());
		System.out.println(wada.getName());
		System.out.println(takeda.getName());
		System.out.println(wada.getName());
		*/
		//Parent.showType();
		//Child.showType();
	}
	
	public static void showName(Human parent){
		System.out.println(parent.getName());
//		Parent.showType();
//		Parent.familyNumber();
	}

}
