#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

typedef struct BSTnode
{
    int key;
    struct BSTnode *left;
    struct BSTnode *right;
    struct BSTnode *parent;
} BSTnode;

BSTnode *create()
{
    BSTnode *temp;
    printf("\nEnter key: ");
    temp = (BSTnode *)malloc(sizeof(BSTnode));
    scanf("%d", &temp->key);

    temp->left = temp->right = temp->parent = NULL;

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
            temp->parent = root;
        }
    }
    if (temp->key > root->key)
    {
        if (root->right != NULL)
            insert(root->right, temp);
        else
        {
            root->right = temp;
            temp->parent = root;
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

BSTnode *TreeSuccessor(BSTnode *x)
{
    if (x->right != NULL)
    {
        return TreeMinimum(x->right);
    }
    BSTnode *y = x->parent;
    while (y != NULL && x == y->right)
    {
        x = y;
        y = y->parent;
    }
    return y;
}

BSTnode *TreePredecessor(BSTnode *x)
{
    if (x->left != NULL)
    {
        return TreeMaximum(x->left);
    }
    BSTnode *y = x->parent;
    while (y != NULL && x == y->left)
    {
        x = y;
        y = y->parent;
    }
    return y;
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
        if (root->left != NULL)
            root->left->parent = root;
    }
    // If the key to be deleted is greater than the root's key, then it lies in right subtree
    else if (key > root->key)
    {
        root->right = deleteNode(root->right, key);
        if (root->right != NULL)
            root->right->parent = root;
    }
    // if key is same as root's key, then This is the node to be deleted
    else
    {
        // node with only one child or no child
        if (root->left == NULL)
        {
            BSTnode *temp = root->right;
            if (temp != NULL)
                temp->parent = root->parent;
            free(root);
            return temp;
        }
        else if (root->right == NULL)
        {
            BSTnode *temp = root->left;
            if (temp != NULL)
                temp->parent = root->parent;
            free(root);
            return temp;
        }
        // node with two children: Get the inorder successor (smallest in the right subtree)
        BSTnode *temp = minValueNode(root->right);
        // Copy the inorder successor's content to this node
        root->key = temp->key;
        // Delete the inorder successor
        root->right = deleteNode(root->right, temp->key);
        if (root->right != NULL)
            root->right->parent = root;
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

    if (root != NULL)
    {
        BSTnode *successorNode = TreeSuccessor(root);
        if (successorNode != NULL)
            printf("Successor of root node (%d): %d\n", root->key, successorNode->key);
        else
            printf("The root node has no successor.\n");

        BSTnode *predecessorNode = TreePredecessor(root);
        if (predecessorNode != NULL)
            printf("Predecessor of root node (%d): %d\n", root->key, predecessorNode->key);
        else
            printf("The root node has no predecessor.\n");
    }

    return 0;
}


// 10 y 5 y 15 y 2 y 7 y 12 y 20 n 999 n