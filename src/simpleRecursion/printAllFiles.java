package simpleRecursion;

import java.io.File;

public class printAllFiles {

	static int counter = 0;

	public static void main(String[] args) {

		String _FILE_PATH = "D:\\mobilebackup";

		printAllFilesFromFolder(_FILE_PATH);

		System.out.println(counter);

	}

	static void printAllFilesFromFolder(String path) {

		File file = new File(path);
		if (!file.isDirectory()) {

			System.out.println(file.getPath());
			return;
		}

		File[] listOfFiles = file.listFiles();

		for (int i = 0; i < listOfFiles.length; i++) {

			printAllFiles(listOfFiles[i].getAbsolutePath());

		}

		counter++;

	}
}
