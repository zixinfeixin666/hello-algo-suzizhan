/**
 * File: preorder_traversal_ii_compact.java
 * Created Time: 2023-04-16
 * Author: Krahets (krahets@163.com)
 */

package chapter_backtracking;

import utils.*;
import java.util.*;

public class preorder_traversal_ii_compact {
    static List<TreeNode> path;
    static List<List<TreeNode>> res;

    static void preOder(TreeNode root){
        if(root == null){
            return;
        }
        path.add(root);
        if(root.val == 7){
            res.add(new ArrayList<>(path));
        }
        preOder(root.left);
        preOder(root.right);
        path.remove(path.size() - 1);
    }

    public static void main(String[] args) {
        TreeNode root = TreeNode.listToTree(Arrays.asList(1,7,3,4,5,6,7));  
        System.out.println("初始化二叉树");
        PrintUtil.printTree(root);

        path = new ArrayList<>();
        res = new ArrayList<>();
        preOder(root);

        System.out.println("\n输出所有根节点到节点 7 的路径");
        for(List<TreeNode> path : res){
            ArrayList<Integer> vals = new ArrayList<>();
            for(TreeNode node : path){
                vals.add(node.val);
            }
            System.out.println(vals);
        }

    }
}
