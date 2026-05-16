#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

typedef struct TreeNode
{
    struct TreeNode *left;
    int data;
    struct TreeNode *right;
    struct TreeNode *parent;
} TreeNode;

TreeNode *createBinaryTree(TreeNode *parent)
{
    TreeNode *p;
    int x;
    printf("Enter data(-1 for no data): ");
    scanf("%d", &x);
    if (x == -1)
        return NULL;
    // create current node
    p = (TreeNode *)malloc(sizeof(TreeNode));
    p->data = x;
    p->parent = parent;
    // recursively create left and right subtree
    printf("Enter left child of %d: \n", x);
    p->left = createBinaryTree(p);
    printf("Enter right child of %d: \n", x);
    p->right = createBinaryTree(p);
    return p;
}

// Preorder: Root -> Left -> Right
void preorder(TreeNode *t)
{
    if (t != NULL)
    {
        printf("\n%d", t->data);
        preorder(t->left);
        preorder(t->right);
    }
}

// Inorder: Left -> Root -> Right

void inorder(TreeNode *t)
{
    if (t != NULL)
    {
        inorder(t->left);
        printf("%d ", t->data);
        inorder(t->right);
    }
}

// Postorder: Left -> Right -> Root

void postorder(TreeNode *t)
{
    if (t != NULL)
    {
        postorder(t->left);
        postorder(t->right);
        printf("%d ", t->data);
    }
}

bool TreeSearch(TreeNode *x, int k)
{
    while (x != NULL && k != x->data)
    {
        if (k < x->data)
            x = x->left;
        else
            x = x->right;
    }
    return (x != NULL);
}

TreeNode *TreeMinimum(TreeNode *x)
{
    while (x != NULL && x->left != NULL)
    {
        x = x->left;
    }
    return x;
}

TreeNode *TreeMaximum(TreeNode *x)
{
    while (x != NULL && x->right != NULL)
    {
        x = x->right;
    }
    return x;
}

TreeNode *TreeSuccessor(TreeNode *x)
{
    if (x->right != NULL)
    {
        return TreeMinimum(x->right);
    }
    TreeNode *y = x->parent;
    while (y != NULL && x == y->right)
    {
        x = y;
        y = y->parent;
    }
    return y;
}

TreeNode *TreePredecessor(TreeNode *x)
{
    if (x->left != NULL)
    {
        return TreeMaximum(x->left);
    }
    TreeNode *y = x->parent;
    while (y != NULL && x == y->left)
    {
        x = y;
        y = y->parent;
    }
    return y;
}

int main()
{
    TreeNode *root;
    root = createBinaryTree(NULL);

    printf("%d\n", TreeSearch(root, 5));

    TreeNode *minNode = TreeMinimum(root);
    if (minNode != NULL)
        printf("Minimum value in the tree: %d\n", minNode->data);
    else
        printf("The tree is empty.\n");

    TreeNode *maxNode = TreeMaximum(root);
    if (maxNode != NULL)
        printf("Maximum value in the tree: %d\n", maxNode->data);
    else
        printf("The tree is empty.\n");

    TreeNode *successorNode = TreeSuccessor(root);
    if (successorNode != NULL)  
        printf("Successor of root node (%d): %d\n", root->data, successorNode->data);
    else
        printf("The root node has no successor.\n");
    
    TreeNode *predecessorNode = TreePredecessor(root);
    if (predecessorNode != NULL)    
        printf("Predecessor of root node (%d): %d\n", root->data, predecessorNode->data);
    else
        printf("The root node has no predecessor.\n");
}

//       10
//      /  \
//     5    15
//    / \   / \
//   2   7 12  20

// 10 5 2 -1 -1 7 -1 -1 15 12 -1 -1 20 -1 -1