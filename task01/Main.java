package by.htp.home.main9.task01;

/*
 * 1. Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на
консоль текст, заголовок текста.
 */

public class Main {

	public static void main(String[] args) {

		Text t = new Text("alfavit");
		Sentence s1 = new Sentence();
		Sentence s2 = new Sentence();
		Sentence s3 = new Sentence();

		s1.add(new Word("aaaaa"));
		s1.add(new Word("bbbb"));
		s1.add(new Word("ccccc"));
		s1.add(new Word("ddddd"));

		s2.add(new Word("eeeee"));
		s2.add(new Word("fffff"));
		s2.add(new Word("jjjjj"));
		s2.add(new Word("iiiiii"));

		s3.add(new Word("kkkkk"));
		s3.add(new Word("lllll"));
		s3.add(new Word("mmmmm"));
		s3.add(new Word("nnnnn"));

		t.add(s1);
		t.add(s2);
		t.add(s3);

		printTitle(t);
		printText(t);

		System.out.println("---------------------");

		Sentence s4 = new Sentence();
		s4.add(new Word("xxxxxx"));
		s4.add(new Word("wwwwww"));
		s4.add(new Word("zzzzzzz"));

		t = TextLogic.append(t, s4);

		printText(t);

	}

	public static void printTitle(Text t) {
		System.out.println(t.getTitle());
	}

	public static void printText(Text t) {

		for (Sentence s : t.getText()) {
			for (Word w : s.getSentences()) {
				System.out.print(w.getWordValue() + " ");
			}
			System.out.println(".");
		}

	}

}
