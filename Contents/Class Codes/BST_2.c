#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

typedef struct BSTnode
{
    int key;
    struct BSTnode *left;
    struct BSTnode *right;
} BSTnode;

BSTnode *create()
{
    BSTnode *temp;
    printf("\nEnter key: ");
    temp = (BSTnode *)malloc(sizeof(BSTnode));
    scanf("%d", &temp->key);

    temp->left = temp->right = NULL;

    return temp;
}

void insert(BSTnode *root, BSTnode *temp)
{
    if (temp->key < root->key)
    {
        if (root->left != NULL)
            insert(root->left, temp);
        else
        {
            root->left = temp;
        }
    }
    if (temp->key > root->key)
    {
        if (root->right != NULL)
            insert(root->right, temp);
        else
        {
            root->right = temp;
        }
    }
}

bool TreeSearch(BSTnode *x, int k)
{
    while (x != NULL && k != x->key)
    {
        if (k < x->key)
            x = x->left;
        else
            x = x->right;
    }
    return (x != NULL);
}

BSTnode *TreeMinimum(BSTnode *x)
{
    while (x != NULL && x->left != NULL)
    {
        x = x->left;
    }
    return x;
}

BSTnode *TreeMaximum(BSTnode *x)
{
    while (x != NULL && x->right != NULL)
    {
        x = x->right;
    }
    return x;
}

BSTnode *minValueNode(BSTnode *node)
{
    BSTnode *current = node;
    while (current->left != NULL)
        current = current->left;
    return current;
}

BSTnode *deleteNode(BSTnode *root, int key)
{
    if (root == NULL)
        return root;
    // If the key to be deleted is smaller than the root's key, then it lies in left subtree
    if (key < root->key)
    {
        root->left = deleteNode(root->left, key);
    }
    // If the key to be deleted is greater than the root's key, then it lies in right subtree
    else if (key > root->key)
    {
        root->right = deleteNode(root->right, key);
    }
    // if key is same as root's key, then This is the node to be deleted
    else
    {
        // node with only one child or no child
        if (root->left == NULL)
        {
            BSTnode *temp = root->right;
            free(root);
            return temp;
        }
        else if (root->right == NULL)
        {
            BSTnode *temp = root->left;
            free(root);
            return temp;
        }
        // node with two children: Get the inorder successor (smallest in the right subtree)
        BSTnode *temp = minValueNode(root->right);
        // Copy the inorder successor's content to this node
        root->key = temp->key;
        // Delete the inorder successor
        root->right = deleteNode(root->right, temp->key);
    }
    return root;
}
void inorder(BSTnode *root)
{
    if (root != NULL)
    {
        inorder(root->left);
        printf("%d ", root->key);
        inorder(root->right);
    }
}

int main()
{
    char ch;
    int item;
    BSTnode *root = NULL, *temp;
    do
    {
        temp = create();
        if (root == NULL)
            root = temp;
        else
            insert(root, temp);
        printf("\n Do you want to enter more(y/n)? ");
        scanf(" %c", &ch);
    } while (ch == 'y' || ch == 'Y');
    printf("\n Inorder traversal of the tree:\t");
    inorder(root);
    do
    {
        if (root == NULL)
        {
            printf("\n No key to delete!");
            return 0;
        }
        else
        {
            printf("\nDelete what? ");
            scanf("%d", &item);
            root = deleteNode(root, item);
            printf("\nInorder traversal of the modified tree \t");
            inorder(root);
        }
        printf("\nDo you want to delete more(y/n)? ");
        scanf(" %c", &ch);
    } while (ch == 'y' || ch == 'Y');

    printf("\n%d\n", TreeSearch(root, 5));

    BSTnode *minNode = TreeMinimum(root);
    if (minNode != NULL)
        printf("Minimum value in the tree: %d\n", minNode->key);
    else
        printf("The tree is empty.\n");

    BSTnode *maxNode = TreeMaximum(root);
    if (maxNode != NULL)
        printf("Maximum value in the tree: %d\n", maxNode->key);
    else
        printf("The tree is empty.\n");

    return 0;
}

// 10 y 5 y 15 y 2 y 7 y 12 y 20 n 999 n