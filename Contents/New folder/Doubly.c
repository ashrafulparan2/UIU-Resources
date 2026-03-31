#include <stdio.h>
#include <stdlib.h>

struct dnode
{
    struct dnode *prev;
    int value;
    struct dnode *next;
};

struct dnode *head, *last;

void insert_begning(int data)
{
    struct dnode *newItem;
    newItem = (struct dnode *)malloc(sizeof(struct dnode));
    newItem->value = data;
    if (head == NULL)
    {
        head = newItem;
        head->prev = NULL;
        head->next = NULL;
        last = head;
    }
    else
    {
        newItem->prev = NULL;
        newItem->next = head;
        head->prev = newItem;
        head = newItem;
    }
}

void insert_end(int data)
{
    struct dnode *newItem, *temp;
    newItem = (struct dnode *)malloc(sizeof(struct dnode));
    newItem->value = data;
    if (head == NULL)
    {
        head = newItem;
        head->prev = NULL;
        head->next = NULL;
        last = head;
    }
    else
    {
        last = head;
        while (last != NULL)
        {
            temp = last;
            last = last->next;
        }
        newItem->prev = temp;
        newItem->next = NULL;
        temp->next = newItem;
        last = newItem;
    }
}

int insert_after(int data, int x)
{
    // Insert after node x
    struct dnode *temp, *newItem, *temp1;
    newItem = (struct dnode *)malloc(sizeof(struct dnode));
    newItem->value = data;
    if (head == NULL)
    {
        head = newItem;
        head->prev = NULL;
        head->next = NULL;
    }
    else
    {
        temp = head;
        while (temp != NULL && temp->value != x)
            temp = temp->next;
        if (temp == NULL)
            printf("\n %d is not present in the list ", x);
        else
        {
            temp1 = temp->next;
            newItem->prev = temp;
            newItem->next = temp1;
            temp1->prev = newItem;
            temp->next = newItem;
        }
    }
}

void deleteNode(struct dnode *old)
{
    if (head == old) /* If node to be deleted is head node */
        head = old->next;
    /* Change next only if node to be deleted is not the last node */
    if (old->next != NULL)
        old->next->prev = old->prev;
    /* Change prev only if node to be deleted is not the first node */
    if (old->prev != NULL)
        old->prev->next = old->next;
    free(old); /* Finally, free the memory occupied by old*/
    return;
}

struct dnode *findNode(int value)
{
    struct dnode *temp = head;
    while (temp != NULL)
    {
        if (temp->value == value)
        {
            return temp;
        }
        temp = temp->next;
    }
    return NULL;
}

void printList()
{
    struct dnode *temp;

    if (head == NULL)
    {
        printf("List is empty.\n");
        return;
    }

    printf("Forward : ");
    temp = head;
    while (temp != NULL)
    {
        printf("%d ", temp->value);
        if (temp->next == NULL)
            last = temp;
        temp = temp->next;
    }
    printf("\n");

    printf("Backward: ");
    temp = last;
    while (temp != NULL)
    {
        printf("%d ", temp->value);
        temp = temp->prev;
    }
    printf("\n");
}

void delete_by_value(int value)
{
    struct dnode *target = findNode(value);
    if (target == NULL)
    {
        printf("%d not found in list.\n", value);
        return;
    }
    deleteNode(target);
}

void clearList()
{
    struct dnode *temp = head;
    while (temp != NULL)
    {
        struct dnode *nextNode = temp->next;
        free(temp);
        temp = nextNode;
    }
    head = NULL;
    last = NULL;
}

int main()
{
    head = NULL;
    last = NULL;

    printf("Create doubly linked list with numbers (insert at end):\n");
    insert_end(10);
    insert_end(20);
    insert_end(30);
    insert_end(40);
    printList();

    printf("\nInsert at beginning (5):\n");
    insert_begning(5);
    printList();

    printf("\nInsert at end (50):\n");
    insert_end(50);
    printList();

    printf("\nInsert after a middle node (25 after 20):\n");
    insert_after(25, 20);
    printList();

    printf("\nDelete head node (5):\n");
    delete_by_value(5);
    printList();

    printf("\nDelete middle node (25):\n");
    delete_by_value(25);
    printList();

    printf("\nDelete tail node (50):\n");
    delete_by_value(50);
    printList();

    printf("\nTry deleting non-existing value (99):\n");
    delete_by_value(99);
    printList();

    clearList();
    return 0;
}
