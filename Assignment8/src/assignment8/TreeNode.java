
package assignment8;

/**
 *
 * @author jkcherrelus6038
 */
public class TreeNode {
	public int info;
	public TreeNode left, right, father;
	int lCount;
	boolean isLeft;

	public TreeNode(){
		lCount=0;
		info=0;
		left=right=father=null;
		isLeft=false;
	}

	public TreeNode(int x){
		lCount=0;
		info=x;
		left=right=father=null;
		isLeft=false;
	}

	public void setLeft(int x){
		if(this.left!=null){
			System.out.println("void insertion");
			return;
		}else{
			TreeNode p=new TreeNode(x);
			p.father=this;
			this.left=p;
			p.isLeft=true;
		}
	}

	public void setRight(int x){
		if(this.right!=null){
			System.out.println("void insertion");
			return;
		}else{
			TreeNode p=new TreeNode(x);
			p.father=this;
			this.right=p;
			p.isLeft=false;
		}
	}
}
