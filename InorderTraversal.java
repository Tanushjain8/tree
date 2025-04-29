import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int value;
    TreeNode leftChild;
    TreeNode rightChild;

    TreeNode(int value) {
        this.value = value;
    }
}

public class InorderTraversal {
    public List<Integer> inorderTraversal(TreeNode rootNode) {
        List<Integer> inorderList = new ArrayList<>();
        performInorderTraversal(rootNode, inorderList);
        return inorderList;
    }

    private void performInorderTraversal(TreeNode currentNode, List<Integer> inorderList) {
        if (currentNode == null) return;
        performInorderTraversal(currentNode.leftChild, inorderList);
        inorderList.add(currentNode.value);
        performInorderTraversal(currentNode.rightChild, inorderList);
    }

    public static TreeNode buildSampleTree() {
        TreeNode rootNode = new TreeNode(1);
        rootNode.rightChild = new TreeNode(2);
        rootNode.rightChild.leftChild = new TreeNode(3);
        return rootNode;
    }

    public static void main(String[] args) {
        InorderTraversal traversalSolver = new InorderTraversal();
        TreeNode rootNode = buildSampleTree();
        List<Integer> result = traversalSolver.inorderTraversal(rootNode);
        System.out.println(result);
    }
}
