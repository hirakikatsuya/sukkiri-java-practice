package practice;

public class Practice5_2 {

	public static void main(String[] args) {
//		String title = "胸トレ";
		String address = "yokokawa@yokokawa";
		String text = "胸トレ行きましょう！";
//		email(title,address,text);
		email(address,text);
	}

	public static void email(String title, String address, String text) {
		System.out.println(address + "に以下のメールを送信しました");
		System.out.println("件名：" + title);
		System.out.println("本文：" + text);
	}

	public static void email(String address,String text) {
		System.out.println(address + "に以下のメールを送信しました");
		System.out.println("件名：無題");
		System.out.println("本文"+text);
	}
}