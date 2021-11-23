package BinarySearchTree.BST;

public class Word {

	String word;
	int Freq;
	
	Word(){
		word="";
		Freq=1;
	}
	
	public void display() {
		
		System.out.println(word + " freq: "+Freq);
	}
}
