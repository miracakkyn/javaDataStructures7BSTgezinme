package javaDataStructures7BSTgezinme;

public class Uygulama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BST agac=new BST();
		agac.root=agac.insert(agac.root,10);
		agac.root=agac.insert(agac.root,8);
		agac.root=agac.insert(agac.root,5);
		agac.root=agac.insert(agac.root,9);
		agac.root=agac.insert(agac.root,15);
		agac.root=agac.insert(agac.root,12);
		agac.root=agac.insert(agac.root,20);
		agac.root=agac.insert(agac.root, 22);
		agac.root=agac.insert(agac.root, 25);
		/*
		 				10
		 		8				15
		 	5		9		12		20
		 								22
		 									25
		 								
		 				
		 				*/
		
		System.out.print("preOrder: ");agac.preOrder(agac.root);System.out.println();//başta kök
		System.out.print("inOrder: ");agac.inOrder(agac.root);System.out.println();//ortada kök
		System.out.print("postOrder: ");agac.postOrder(agac.root);//sonda kök
		System.out.println("\n\nAğacın yüksekliği: "+agac.height(agac.root));
		System.out.println("Ağacın kök sayısı: "+agac.size(agac.root));
	}
	

}
