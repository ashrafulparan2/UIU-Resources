#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

typedef struct TreeNode
{
    struct TreeNode *left;
    int data;
    struct TreeNode *right;
} TreeNode;

TreeNode *createBinaryTree()
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
    // recursively create left and right subtree
    printf("Enter left child of %d: \n", x);
    p->left = createBinaryTree();
    printf("Enter right child of %d: \n", x);
    p->right = createBinaryTree();
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

int main()
{
    TreeNode *root;
    root = createBinaryTree();

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
}

    //       10
    //      /  \
    //     5    15
    //    / \   / \
    //   2   7 12  20          
   


    // 10 5 2 -1 -1 7 -1 -1 15 12 -1 -1 20 -1 -1