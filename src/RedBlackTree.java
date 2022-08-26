// --== CS400 File Header Information ==--
// Name: Arnav Mehta
// Email: anmehta4@wisc.edu
// Team: LC
// TA: Divyanshu Saxena
// Lecturer: Gary Dahl
// Notes to Grader: None

import java.util.LinkedList;

/**
 * Binary Search Tree implementation with a Node inner class for representing the nodes within a
 * binary search tree. You can use this class' insert method to build a binary search tree, and its
 * toString method to display the level order (breadth first) traversal of values in that tree.
 * 
 * @author arnav
 */
public class RedBlackTree<T extends Comparable<T>> {

  /**
   * This class represents a node holding a single value within a binary tree the parent, left, and
   * right child references are always be maintained.
   */
  protected static class Node<T> {
    public T data;
    public Node<T> parent; // null for root node
    public Node<T> leftChild;
    public Node<T> rightChild;
    public boolean isBlack;

    public Node(T data) {
      this.data = data;
      this.isBlack = false;
    }

    /**
     * @return true when this node has a parent and is the left child of that parent, otherwise
     *         return false
     */
    public boolean isLeftChild() {
      return parent != null && parent.leftChild == this;

    }

    /**
     * This method performs a level order traversal of the tree rooted at the current node. The
     * string representations of each data value within this tree are assembled into a comma
     * separated string within brackets (similar to many implementations of java.util.Collection).
     * 
     * @return string containing the values of this tree in level order
     */
    @Override
    public String toString() { // display subtree in order traversal
      String output = "[";
      LinkedList<Node<T>> q = new LinkedList<>();
      q.add(this);
      while (!q.isEmpty()) {
        Node<T> next = q.removeFirst();
        if (next.leftChild != null)
          q.add(next.leftChild);
        if (next.rightChild != null)
          q.add(next.rightChild);
        output += next.data.toString();
        if (!q.isEmpty())
          output += ", ";
      }
      return output + "]";
    }
  }

  protected Node<T> root; // reference to root node of tree, null when empty

  /**
   * Performs a naive insertion into a binary search tree: adding the input data value to a new node
   * in a leaf position within the tree. After this insertion, no attempt is made to restructure or
   * balance the tree. This tree will not hold null references, nor duplicate data values.
   * 
   * @param data to be added into this binary search tree
   * @throws NullPointerException     when the provided data argument is null
   * @throws IllegalArgumentException when the tree already contains data
   */
  public void insert(T data) throws NullPointerException, IllegalArgumentException {
    // null references cannot be stored within this tree
    if (data == null)
      throw new NullPointerException("This RedBlackTree cannot store null references.");

    Node<T> newNode = new Node<>(data);
    if (root == null) {
      root = newNode;
      root.isBlack = true; // ensuring the root node is black
    } // add first node to an empty tree
    else
      insertHelper(newNode, root); // recursively insert into subtree
  }

  /**
   * Recursive helper method to find the subtree with a null reference in the position that the
   * newNode should be inserted, and then extend this tree by the newNode in that position.
   * 
   * @param newNode is the new node that is being added to this tree
   * @param subtree is the reference to a node within this tree which the newNode should be inserted
   *                as a descenedent beneath
   * @throws IllegalArgumentException when the newNode and subtree contain equal data references (as
   *                                  defined by Comparable.compareTo())
   */
  private void insertHelper(Node<T> newNode, Node<T> subtree) {
    int compare = newNode.data.compareTo(subtree.data);
    // do not allow duplicate values to be stored within this tree
    if (compare == 0)
      throw new IllegalArgumentException("This RedBlackTree already contains that value.");

    // store newNode within left subtree of subtree
    else if (compare < 0) {
      if (subtree.leftChild == null) { // left subtree empty, add here
        subtree.leftChild = newNode;
        newNode.parent = subtree;
        if (!subtree.isBlack) {
          enforceRBTreePropertiesAfterInsert(newNode);
        }
        // otherwise continue recursive search for location to insert
      } else
        insertHelper(newNode, subtree.leftChild);
    }

    // store newNode within the right subtree of subtree
    else {
      if (subtree.rightChild == null) { // right subtree empty, add here
        subtree.rightChild = newNode;
        newNode.parent = subtree;
        if (!subtree.isBlack) {
          enforceRBTreePropertiesAfterInsert(newNode);
        }
        // otherwise continue recursive search for location to insert
      } else
        insertHelper(newNode, subtree.rightChild);
    }
  }

  /**
   * Find the Movies object for the given year
   * 
   * @param year of the movie we need t look for
   * @return Movies - of the year given
   */
  public T lookup(int year) {
    Movies findRecord = new Movies("", "", "", year);
    return lookupHelper((T) findRecord, this.root);
  }

  /**
   * Recursive helper method to look up a movie for the year given
   * 
   * @param findRecord - the Movies object we are looking for in the red black tree
   * @param current    - the root of the red black tree from where the search has to begin
   * @return
   */
  private T lookupHelper(T findRecord, RedBlackTree.Node<T> current) {

    if (current.data == null) {
      return null;
    }
    if (current.data.compareTo((T) findRecord) == 0) { // checking if the node is equal to the
      // findRecord
      return current.data;
    } else if (findRecord.compareTo(current.data) > 0) { // determining which tree to
      // follow
      return lookupHelper(findRecord, current.rightChild); // if newRecord is older then
      // right subtree
    } else if (findRecord.compareTo(current.data) < 0) { // else the left subtree
      return lookupHelper(findRecord, current.leftChild);
    }
    return null;
  }

  /**
   * Method to ensure that once a node is inserted the tree follows all the RBT properties and make
   * Necessary changes as required
   * 
   * @param newNode is the new node that is being added to this tree
   */
  private void enforceRBTreePropertiesAfterInsert(Node<T> newNode) {

    Node<T> parentNode = newNode.parent; // storing the parent node
    Node<T> parentSiblingNode; // declaring the parent sibling node
    if (parentNode == null) { // if the parent node is null
      newNode.isBlack = true;
      return;
    }
    if (parentNode.parent == null) // it is the child of the root and since out default for a new
                                   // node is red and that of the root is black there will be no
                                   // violations
      return;

    if (parentNode.isLeftChild()) // if the parent Node is a left child, storing the right child of
                                  // the grandparent and vice versa
      parentSiblingNode = parentNode.parent.rightChild;
    else
      parentSiblingNode = parentNode.parent.leftChild;

    if (parentNode.isBlack) // if parent node is black, nothing is to be done as newNode is red
      return;
    // if the parent node and sibling node are both red, making them both black and repeating
    // forward recursively by calling the method on the grandparentNode
    else if (parentSiblingNode != null && parentSiblingNode.isBlack == false) {

      parentNode.isBlack = true;
      parentSiblingNode.isBlack = true;
      parentNode.parent.isBlack = false;

      enforceRBTreePropertiesAfterInsert(parentNode.parent);
    }

    else { // is parent sibling node is black/null

      if (newNode.isLeftChild() && !parentNode.isLeftChild()) { // if newNode and parentSiblingNode
                                                                // are the same side children
        this.rotate(newNode, parentNode);// rotate the new node and parentNode
        enforceRBTreePropertiesAfterInsert(newNode.rightChild);// calling the method on the parent
                                                               // now the // child node
      }

      else if (newNode.isLeftChild() && parentNode.isLeftChild()) { // same side left children
        parentNode.isBlack = true; // re-coloring to maintain RBT properties
        parentNode.parent.isBlack = false; // re-coloring to maintain RBT properties
        this.rotate(parentNode, parentNode.parent); // rotating the parent and grandparent node
        return;
      }

      else if (!newNode.isLeftChild() && !parentNode.isLeftChild()) {
        parentNode.isBlack = true;// re-coloring to maintain RBT properties
        parentNode.parent.isBlack = false;// re-coloring to maintain RBT properties
        this.rotate(parentNode, parentNode.parent);// rotating the parent and grandparent node
        return;
      }

      else if (!newNode.isLeftChild() && parentNode.isLeftChild()) { // if newNode and
                                                                     // parentSiblingNode
        // are the same side children
        this.rotate(newNode, parentNode);// rotate the new node and parentNode
        enforceRBTreePropertiesAfterInsert(newNode.leftChild);// calling the method on the parent
                                                              // now the // child node
      }

    }
  }

  /**
   * This method performs a level order traversal of the tree. The string representations of each
   * data value within this tree are assembled into a comma separated string within brackets
   * (similar to many implementations of java.util.Collection, like java.util.ArrayList, LinkedList,
   * etc).
   * 
   * @return string containing the values of this tree in level order
   */
  @Override
  public String toString() {
    return root.toString();
  }

  /**
   * Performs the rotation operation on the provided nodes within this BST. When the provided child
   * is a leftChild of the provided parent, this method will perform a right rotation (sometimes
   * called a left-right rotation). When the provided child is a rightChild of the provided parent,
   * this method will perform a left rotation (sometimes called a right-left rotation). When the
   * provided nodes are not related in one of these ways, this method will throw an
   * IllegalArgumentException.
   * 
   * @param child  is the node being rotated from child to parent position (between these two node
   *               arguments)
   * @param parent is the node being rotated from parent to child position (between these two node
   *               arguments)
   * @throws IllegalArgumentException when the provided child and parent node references are not
   *                                  initially (pre-rotation) related that way
   */
  private void rotate(Node<T> child, Node<T> parent) throws IllegalArgumentException {
    // TODO: Implement this method.

    if (child.parent != parent && (parent.rightChild != child || parent.leftChild != child)) {
      throw new IllegalArgumentException("Given child and parent nodes are not parent-child nodes");
    }

    if (child.isLeftChild()) {
      // perform right rotation
      parent.leftChild = child.rightChild;
      if (child.rightChild != null) {
        child.rightChild.parent = parent;
      }
      child.parent = parent.parent;

      // checks if parent is at root
      if (parent == root) {
        root = child;
      } else {
        if (parent.isLeftChild()) {
          parent.parent.leftChild = child;
        } else {
          parent.parent.rightChild = child;

        }
      }

      // put parent as child's right child
      child.rightChild = parent;

      // put child as parent's parent
      parent.parent = child;
    } 
    else {
      // Performs a left rotation
      parent.rightChild = child.leftChild;
      if (child.leftChild != null) {
        child.leftChild.parent = parent;
      }

      child.parent = parent.parent;

      // checks if parent is at root node or not
      if (parent == root) {
        root = child;
      } else {
        if (parent.isLeftChild()) {
          parent.parent.leftChild = child;
        } else {
          parent.parent.rightChild = child;

        }
      }
      child.leftChild = parent;
      parent.parent = child;

    }

  }
}
