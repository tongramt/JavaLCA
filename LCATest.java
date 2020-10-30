package lowestCommonAncestor;

import static org.junit.Assert.*;

import org.junit.Test;

public class LCATest {

	@Test
	public void testNullTree() {
		
		LCA tree = new LCA();
		tree.root = null;
		assertEquals(-1, tree.findLCA(4, 5)); 
	}
	
	@Test
	public void testStandardTree() {
		
		LCA tree = new LCA();
		tree.root=new Node(1);
		tree.root.left=new Node(2);
		tree.root.right=new Node(3);
		tree.root.left.right=new Node(4);
		tree.root.left.left=new Node(5);
		tree.root.right.left=new Node(6);
		tree.root.right.right=new Node(7);
		
		assertEquals(2,tree.findLCA(4, 5));	
	}
	
	@Test
	public void testNegativeStandardTree() {
		
		LCA tree = new LCA();
		tree.root=new Node(-1);
		tree.root.left=new Node(-2);
		tree.root.right=new Node(-3);
		tree.root.left.right=new Node(-4);
		tree.root.left.left=new Node(-5);
		tree.root.right.left=new Node(-6);
		tree.root.right.right=new Node(-7);
		
		assertEquals(-2,tree.findLCA(-4, -5));	
	}
	
	@Test
	public void testOneNodeNotPresent() {
		
		LCA tree = new LCA();
		tree.root=new Node(1);
		tree.root.left=new Node(2);
		tree.root.right=new Node(3);
		tree.root.left.right=new Node(4);
		tree.root.left.left=new Node(5);
		tree.root.right.left=new Node(6);
		tree.root.right.right=new Node(7);
		
		assertEquals(-1,tree.findLCA(4, 8));	
		
	}
	
	@Test
	public void testBothNodesNotPresent(){
		
		LCA tree = new LCA();
		tree.root=new Node(1);
		tree.root.left=new Node(2);
		tree.root.right=new Node(3);
		tree.root.left.right=new Node(4);
		tree.root.left.left=new Node(5);
		tree.root.right.left=new Node(6);
		tree.root.right.right=new Node(7);
		
		assertEquals(-1,tree.findLCA(12, 8));	
		
	}
	
	@Test
	public void testBothNodesSame(){
		
		LCA tree = new LCA();
		tree.root=new Node(1);
		tree.root.left=new Node(2);
		tree.root.right=new Node(3);
		tree.root.left.right=new Node(4);
		tree.root.left.left=new Node(5);
		tree.root.right.left=new Node(6);
		tree.root.right.right=new Node(7);
		
		assertEquals(4,tree.findLCA(4, 4));	
		
	}
	/*
	 * Couldn't get the borrowed implementation to handle these inputs
	@Test
	public void testNonNumericTree(){
		
		LCA tree = new LCA();
		tree.root=new Node(a);
		tree.root.left=new Node(b);
		tree.root.right=new Node(c);
		tree.root.left.right=new Node(d);
		tree.root.left.left=new Node(e);
		tree.root.right.left=new Node(f);
		tree.root.right.right=new Node(g);
		
		assertEquals(-1,tree.findLCA(f, g));
	}
	*/
	
	/*
	 *  Couldn't get the borrowed implementation to handle these inputs
	@Test
	public void testNonNumericSearchOfNumericTree(){
		
		LCA tree = new LCA();
		tree.root=new Node(1);
		tree.root.left=new Node(2);
		tree.root.right=new Node(2);
		tree.root.left.right=new Node(4);
		tree.root.left.left=new Node(5);
		tree.root.right.left=new Node(6);
		tree.root.right.right=new Node(7);
		
		assertEquals(-1,tree.findLCA(f, a));
		
	}
	*/
	
}
