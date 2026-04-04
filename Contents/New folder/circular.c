#include <stdio.h>
#include <stdlib.h>

struct node
{
    int value;
    struct node *next;
};

struct node *last;

void addToEmpty(int data)
{
    // Create a node dynamically
    struct node *newItem = (struct node *)malloc(sizeof(struct node));
    // Assign the data.
    newItem->value = data;
    // Note : list was empty. We link single node to itself.
    last = newItem;
    newItem->next = last;
}

void addBegin(int data)
{
    // Create a node dynamically
    struct node *newItem = (struct node *)malloc(sizeof(struct node));
    // Assign the data.
    newItem->value = data;
    // Adjust the links.
    newItem->next = last->next;
    last->next = newItem;
}

void addEnd(int data)
{
    // Create a node dynamically
    struct node *newItem = (struct node *)malloc(sizeof(struct node));
    // Assign the data
    newItem->value = data;
    // Adjust the links
    newItem->next = last->next;
    last->next = newItem;
    last = newItem;
}

void printList()
{
    if (last == NULL)
    {
        printf("List is empty.\n");
        return;
    }

    struct node *temp = last->next;

    printf("Circular list: ");
    do
    {
        printf("%d ", temp->value);
        temp = temp->next;
    } while (temp != last->next);
    printf("\n");
}

int main()
{
    printf("Create list with addToEmpty(10)\n");
    addToEmpty(10);
    printList();

    printf("Add at beginning: addBegin(5)\n");
    addBegin(5);
    printList();

    printf("Add at beginning: addBegin(1)\n");
    addBegin(1);
    printList();

    printf("Add at end: addEnd(20)\n");
    addEnd(20);
    printList();

    printf("Add at end: addEnd(30)\n");
    addEnd(30);
    printList();

    return 0;
}