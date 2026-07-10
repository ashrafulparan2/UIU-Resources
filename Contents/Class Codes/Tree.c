#include <stdio.h>
#include <stdlib.h>

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
int main()
{
    TreeNode *root;
    root = createBinaryTree();
    printf("\nThe preorder traversal of tree is: \n");
    preorder(root);
}