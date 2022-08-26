// --== CS400 File Header Information ==--
// Name: Arnav Mehta
// Email: anmehta4@wisc.edu
// Team: LC
// TA: Divyanshu Saxena
// Lecturer: Gary Dahl
// Notes to Grader: None

/**
 * 
 * @author arnav - Testing all possible scenarios in BST adn ensuring the RBT properties are
 *         maintained throughout the code
 *
 */
public class NonJUnitTestRedBlackTree {

  /**
   * To test the case where the parent node and parent sibling nodes are both red and a new node is
   * added
   * 
   * @return boolean true if the node is added as desired, else false
   */
  public static boolean testCase1() {
    RedBlackTree<Integer> tree = new RedBlackTree<Integer>();
    tree.insert(53); // black
    tree.insert(43); // red
    tree.insert(63); // red
    tree.insert(33);// should be red and 43 and 63 should become black

    if (tree.root.leftChild.isBlack && tree.root.rightChild.isBlack
        && !tree.root.leftChild.leftChild.isBlack)
      return true;
    else
      return false;
  }

  /**
   * To test the case where the new node and parent sibling nodes are left and right children of
   * their parents respectively and a new node is added
   * 
   * @return boolean true if the node is added as desired, else false
   */
  public static boolean testCase2() {
    RedBlackTree<Integer> tree = new RedBlackTree<Integer>();
    tree.insert(53); // black
    tree.insert(43); // red
    tree.insert(33); // red
    // now a null node is considered black and so 43 should become black and 53 red

    if (!tree.root.leftChild.isBlack && !tree.root.rightChild.isBlack && tree.root.isBlack)
      return true;
    else
      return false;
  }

  /**
   * To test the case where the new node and parent sibling nodes are right and left children of
   * their parents respectively and a new node is added
   * 
   * @return boolean true if the node is added as desired, else false
   */
  public static boolean testCase3() {
    RedBlackTree<Integer> tree = new RedBlackTree<Integer>();
    tree.insert(53); // black
    tree.insert(63); // red
    tree.insert(73); // red
    // now a null node is considered black and so 63 should become black and 53 red

    if (!tree.root.leftChild.isBlack && !tree.root.rightChild.isBlack && tree.root.isBlack)
      return true;
    else
      return false;

  }

  /**
   * To test the case where the new node and parent sibling nodes are both left children of their
   * parents and a new node is added
   * 
   * @return boolean true if the node is added as desired, else false
   */
  public static boolean testCase4() {
    RedBlackTree<Integer> tree = new RedBlackTree<Integer>();
    tree.insert(50); // black
    tree.insert(60); // red
    tree.insert(55); // red
    // now a after a 2 rotations 55 should be black and 50 should be red

    if (!tree.root.leftChild.isBlack && !tree.root.rightChild.isBlack && tree.root.isBlack)
      return true;
    else
      return false;

  }



  public static void main(String[] args) {
    System.out.println(testCase1());
    System.out.println(testCase2());
    System.out.println(testCase3());
    System.out.println(testCase4());

  }
}
