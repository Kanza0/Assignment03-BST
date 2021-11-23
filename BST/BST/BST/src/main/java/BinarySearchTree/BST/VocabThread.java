package BinarySearchTree.BST;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class VocabThread extends Thread {

	Binarysearchtree bst=new Binarysearchtree();
	
	@Override
	public void run() {
		
		File f1=new File("vocabulary.txt");
		try {
			String line;
			FileReader fd=new FileReader(f1);
			Scanner sc=new Scanner(fd);
			while(sc.hasNext()) {
				line=sc.nextLine();
				StringTokenizer st=new StringTokenizer(line,",");
				while(st.hasMoreTokens())
				bst.insert(st.nextToken());	
			}
					
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
	
	public void displaytee() {
		
		bst.inorder();
	}
}
