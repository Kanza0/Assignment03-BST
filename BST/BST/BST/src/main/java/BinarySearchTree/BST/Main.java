package BinarySearchTree.BST;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		VocabThread vc=new VocabThread();
		
		vc.start();
		Scanner sc=new Scanner(System.in);
		String fname1;String fname2;
		System.out.println("Enter 2 files names\n");
		fname1=sc.nextLine();
		fname2=sc.nextLine();
		inputfilesthread ft=new inputfilesthread(fname1,fname2);
		ft.start();

		System.out.println("1) Displaying BST build from Vocabulary File.\r\n"
				+ "2) Displaying Vectors build from Input files.\r\n"
				+ "3) Viewing Match words and its frequency\r\n"
				+ "4) Searching a query->It should display all the files query found in.\r\n"
				+ "5) Enter 5 for Exiting\r\n"
				+ "");
		
		
		int input=sc.nextInt();
		//int input=2;
		if(input==1) {
			
			vc.displaytee();
		}
		
		if(input==2) {
			ft.displayvectors();
		}
		
		if(input==3) {
			ft.matching(vc.bst);
		}
		
		if(input==4) {
			Scanner ss=new Scanner(System.in);
			System.out.println("Enter query\n");
			String q=ss.nextLine();
			
			StringTokenizer tt=new StringTokenizer(q," ");
			Binarysearchtree bt=new Binarysearchtree();
			
			while(tt.hasMoreTokens()) {
				bt.insert(tt.nextToken());
			}
			
			ft.matching(bt);			
		}
		
		if(input==5) {
			System.out.println("program ended.");
		}
		
		
	}

}
