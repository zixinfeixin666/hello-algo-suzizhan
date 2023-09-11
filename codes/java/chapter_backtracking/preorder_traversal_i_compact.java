/**
 * File: preorder_traversal_i_compact.java
 * Created Time: 2023-04-16
 * Author: Krahets (krahets@163.com)
 */

package chapter_backtracking;

import utils.*;
import java.util.*;

public class preorder_traversal_i_compact {
    static List<TreeNode> res;

    static void preOder(TreeNode root){
        if(root == null){
            return;
        }
        if(root.val == 7){
            res.add(root);
        }
        preOder(root.left);
        preOder(root.right);
    }
    public static void main(String[] args) {
        TreeNode root = TreeNode.listToTree(Arrays.asList(1,7,3,4,5,6,7));
        System.out.println("\n初始化二叉树");
        PrintUtil.printTree(root);

        res = new ArrayList<>();
        preOder(root);
        ArrayList<Integer> vals = new ArrayList<>();
        for(TreeNode node: res){
            vals.add(node.val);
        }
        System.out.println(vals);
    }
}
