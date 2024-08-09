package jp.co.diworks.human;

public class Test {

	public static void main(String[]args){
		//taro
		Person taro=new Person();
		taro.name="山田太郎";
		taro.age=20;
		taro.phoneNumber="000-111-222";
		taro.address="青森県青森市";

		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.phoneNumber);
		System.out.println(taro.address);


        //jiro
		Person jiro=new Person();
		jiro.name="木村次郎";
		jiro.age=18;
		jiro.phoneNumber="333-444-555";
		jiro.address="広島県広島市";

		System.out.println(jiro.name);
		System.out.println(jiro.age);
		System.out.println(jiro.phoneNumber);
		System.out.println(jiro.address);

		//hanako
		Person hanako=new Person();
		hanako.name="鈴木花子";
		hanako.age=16;
		hanako.phoneNumber="666-777-888";
		hanako.address="群馬県前橋市";

		System.out.println(hanako.name);
		System.out.println(hanako.age);
		System.out.println(hanako.phoneNumber);
		System.out.println(hanako.address);

		//kanami
		Person kanami=new Person();
		kanami.name="藏谷香陽";
		kanami.age=36;
		kanami.phoneNumber="999-111-222";
		kanami.address="沖縄県那覇市";

		System.out.println(kanami.name);
		System.out.println(kanami.age);
		System.out.println(kanami.phoneNumber);
		System.out.println(kanami.address);

		taro.talk();
		taro.walk();
		taro.run();


		Robot aibo=new Robot();
		aibo.name="アイボ";

		aibo.talk();
		aibo.walk();
		aibo.run();

		Robot asimo=new Robot();
		asimo.name="アシモ";

		asimo.talk();
		asimo.walk();
		asimo.run();

		Robot pepper=new Robot();
		pepper.name="ペッパー";

		pepper.talk();
		pepper.walk();
		pepper.run();


	}
}

































