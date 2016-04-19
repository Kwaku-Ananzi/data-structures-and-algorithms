/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment8;

/**
 *
 * @author jkcherrelus6038
 */
public class SearchTree {
	TreeNode root;
	SearchTree(){
		root=null;
	}

	boolean insert(int newInt){
		// put your code here
	}

	boolean delete(int d){
		// put your code here
	}

	public void inTrav(){
		inTrav(root);
	}

	private void inTrav(TreeNode root){
		// put your code here
            if(root == null)
            {
                return;
            }
            
	}
        private TreeNode getLeftMostNode(TreeNode root)
        {
            while(root.left != null)
            {
                root = root.left;
            }
            return root;
        }

}
