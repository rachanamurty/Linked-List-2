// TC: O(1) - we are only accessing the next and next to next values
// SC: O(1) - no additional space is required

/*
class Node
{
    int data ;
    Node next;
    Node(int d)
    {
        data = d;
        next = null;
    }
}
*/

// Function to delete a node without any reference to head pointer.
class Solution {
    void deleteNode(Node node) {
        // Your code here
        // If node is last node, we just mark the node as null
        if(node.next == null){
            node = null;
        }
        // Else, we make the next node as null and copy the next node's values to current node
        // This would effectively delete the next node which has null values and the current node is overwritten
        else{
            node.data = node.next.data;
            node.next = node.next.next;
        }
    }
}
