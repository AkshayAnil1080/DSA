https://practice.geeksforgeeks.org/problems/foldable-binary-tree/1
https://practice.geeksforgeeks.org/viewSol.php?subId=e6ceab69b2ad277dc41387785612acf5&pid=700579&user=akshayanil

//mirror of tree
// for rec, see the smallest tree poss and make cases
// root -left a 
//root -right b
// for mirror left and b structure should be same
//1. if a nd b both null => ret true; single node is mirror
//2. a not null and b null => not mirror - ret false , Sim, false for vice versa
//3. now a and b can have tjeir left and right child , u will sit will be mirror 
// only if a left, overlap b right and a right to b left , recur for this

//out rec fun should have how many para -  i say two - cosidering the smallest tree - there will be two node left and right
// which should be mirror, and then step 3. recur two time for their children -  that is

//TC :  ht of tree - y ?  recuring till depth - then back
class Tree
{
    //Function to check whether a binary tree is foldable or not.
    boolean IsFoldable(Node node) 
	{ 
		// your code 
		if(node==null) return true;
		return fun( node.left,  node.right);
	} 
    boolean fun(Node a, Node b){
	    if(a==null && b==null) return true;
	    
	    // wil proceed only if anyone is not null, wo we know one is not null at this pt
	    if(a==null || b==null) return false;
	    
	   return fun(a.right, b.left) && fun(a.left, b.right);
	}
}
