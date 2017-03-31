package Trees;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

import Trees.height_bt.Node;

public class Connect_Each_Level_BinaryT {

	public static class Node{
		
		int data ;
		Node left = null;
		Node right = null;
		Node next = null;
		
		Node(int data){
			this.data= data;
			
		}
	}

	static Node root;
	public static void main(String args[]){
		
		root = new Node(3);
		root.left = new Node(2);
		root.left.left = new Node(1);
		root.left.left.left = new Node(33);
		root.left.left.left.left = new Node(14);
		root.right = new Node(5);
		root.right.left = new Node(4);
		root.right.right = new Node(6);
		root.right.right.right = new Node(7);
		
		connect(root);
		
	}
	
	
	public static void connect(Node root){
		
		if(root==null){
			return;
		}
		Queue<HashMap<Integer, Node>> queueA = new LinkedList();
		HashMap<Integer,Node> h = new HashMap<Integer,Node>();
		h.put(1,root);
		queueA.add(h);
		
		HashMap<Integer,Node> temp = new HashMap<Integer,Node>();
		HashMap<Integer,Node> temp1 = new HashMap<Integer,Node>();
		while(!queueA.isEmpty()){
			
			temp = queueA.remove();
			temp1= queueA.peek();
			Node t = null;
			int level =2;
			int currentLevel = 0;
		
			for(Integer i1: temp.keySet()){
				
				t= temp.get(i1);
				currentLevel=i1;
				if(t.left!= null){
					h = new HashMap<Integer,Node>();
					h.put(level,t.left);
					queueA.add(h);
				}
				if(t.right!=null){
					h.put(level,t.right);
					queueA.add(h);
				}
				level++;
			}
			if(temp1!=null){
				for(Integer i: temp1.keySet()){
					
					if(i==currentLevel){
						t.next = temp1.get(i);
					}
					
				}
			}
		}
		
	}
}
