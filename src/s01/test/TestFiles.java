package s01.test;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Iterator;

public class TestFiles {

	public static void main(String[] args) {
		File f = new File("src/s01/test/Ihm/testFile.txt");
		System.out.println("Directory (false): " + f.isDirectory());
		System.out.println("Existe(true): " + f.exists());
		System.out.println("Absolute Path: " + f.getAbsolutePath());
		System.out.println("Path: " + f.getName());
		System.out.println();

		File g = new File("src/s01/test/Ihm");
		System.out.println("Directory (true): " + g.isDirectory());
		System.out.println("Existe(true): " + g.exists());
		System.out.println("Absolute Path: " + g.getAbsolutePath());
		System.out.println("Path: " + g.getName());
		System.out.println();

		File h = new File("src/s01/test/Ihm/testFileNotExist.txt");
		System.out.println("Directory (false): " + h.isDirectory());
		System.out.println("Existe(false): " + h.exists());
		System.out.println("Absolute Path: " + h.getAbsolutePath());
		System.out.println("Path: " + h.getName());

		System.out.println();
		System.out.println("Contenu du répertoire: ");
		String[] str = g.list();
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
		System.out.println();
		System.out.println("Avec filtre classe anonyme");
		FilenameFilter filter = new FilenameFilter() {

			@Override
			public boolean accept(File dir, String name) {
				return name.matches("(.+?).(jpg|jpeg|png|gif)$");
			}
		};

		for (String string : g.list(filter)) {
			System.out.println(string);
		}
		System.out.println();
		System.out.println("Avec filtre expression lambda");
		for (String string : g.list((File dir, String name) -> name.matches("(.+?).(jpg|jpeg|png|gif)$"))) {
			System.out.println(string);
		}

		System.out.println();
		System.out.println("Avec filtre classe ordinaire");
		TestFiltre testFiltre = new TestFiltre();
		for (String string : g.list(testFiltre)) {
			System.out.println(string);
		}

	}

}
