package BinarySearchTree.BST;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;

import BinarySearchTree.BST.Binarysearchtree.Node;

public class inputfilesthread extends Thread {

	Vector<String> file1Vector=new Vector<String>();
	Vector<String> file2Vector=new Vector<String>();
	Vector<Word> wordds1=new Vector<Word>();
	Vector<Word> wordds2=new Vector<Word>();
	Vector<String> bnt=new Vector<String>();
	String fname1;String fname2;
	
	inputfilesthread(String f1,String f2){
		fname1=f1;fname2=f2;
	}
	@Override
	public void run() {
		
		try {
			String line;
			File f1=new File(fname1);
			FileReader fd=new FileReader(f1);
			Scanner sc1=new Scanner(fd);
			while(sc1.hasNext()) {
				line=sc1.nextLine();
				StringTokenizer st=new StringTokenizer(line," ");
				while(st.hasMoreTokens())
					file1Vector.add(st.nextToken());
			}
					
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			String line;
			File f1=new File(fname2);
			FileReader fd=new FileReader(f1);
			Scanner sc1=new Scanner(fd);
			while(sc1.hasNext()) {
				line=sc1.nextLine();
				StringTokenizer st=new StringTokenizer(line," ");
				while(st.hasMoreTokens())
					file2Vector.add(st.nextToken());
			}
					
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	 void inorderRec(Node root) {
		    if (root != null) {
		      inorderRec(root.left);
		      bnt.add(root.key);
		      inorderRec(root.right);
		    }
		  }
	
	public void displayvectors() {
		
		System.out.println("file 1 vectors"+"\n");
		for(String i : file1Vector)
			System.out.println(i+"\n");
		System.out.println("file 2 vectors"+"\n");
		for(String i : file2Vector)
			System.out.println(i+"\n");
	}
	
	public void matching(Binarysearchtree bst) {
		
		inorderRec(bst.root);
		
		
		for(String i: file1Vector) {
		
		
			boolean exist=false;
			
			
			boolean c=false;
			
			
		
			for(String t : bnt)
			{
				c=false;
				
				if(t.equals(i))
					{
					c=true;break;}
			}
			
			if(c) {
			
				Word w=new Word();
				w.word=i;
				
				for(Word z : wordds1) {
					
					if(z.word.equals(w.word))
						{exist=true;z.Freq++;break;}
				}
				if(!exist)
				wordds1.add(w);
		}
		
		}	

			for(String i1: file2Vector) {
			
				
				boolean exist1=false;
				
				boolean c=false;
				
				
				
					for(String t : bnt)
					{
						c=false;
					
						if(t.equals(i1))
							{
							c=true;break;}
					}
				if(c) {
				
					Word w=new Word();
					w.word=i1;
					
					for(Word z : wordds2) {
						
						if(z.word.equals(w.word))
							{exist1=true;z.Freq++;break;}
					}
					if(!exist1)
					wordds2.add(w);
			}
		
		}
		
			System.out.println("for file 1 :\n");
			for(Word z : wordds1) {
				z.display();
			}
			System.out.println("\n\nfor file 2 :\n");
			for(Word z : wordds2)
				z.display();
		
		
	}
	

}
