#include <stdio.h>
#include <stdlib.h>

struct node
{
    int value;
    struct node *next;
};

struct node *head;

void insertHead(int x)
{
    struct node *newItem;
    newItem = (struct node *)malloc(sizeof(struct node));
    newItem->value = x;
    newItem->next = head;
    head = newItem;
}

void insertTail(int x)
{
    // create a new node to be inserted
    struct node *newItem;
    newItem = (struct node *)malloc(sizeof(struct node));
    newItem->value = x;
    newItem->next = NULL;
    // set last to point to the last node of the list
    struct node *last = head;
    while (last->next != NULL)
        last = last->next;
    last->next = newItem;
}

void insertMiddle(int num)
{
    // create a new node to be inserted
    struct node *newItem;
    newItem = (struct node *)malloc(sizeof(struct node));
    newItem->value = 10;
    newItem->next = NULL;
    // set prev to point to the desired node of the list
    struct node *prev = head;
    while (prev->value != num)
    {
        prev = prev->next;
    }
    newItem->next = prev->next;
    prev->next = newItem;
}

int search(int num)
{
    struct node *temp = head;

    while (temp != NULL)
    {
        if (temp->value == num)
        {
            return 1; // found
        }
        temp = temp->next;
    }

    return 0; // not found
}

void deleteHead()
{
    struct node *cur;

    if (head == NULL) // list empty
    {
        return;
    }

    cur = head;        // save head pointer
    head = head->next; // advance head

    free(cur);
}

void deleteTail()
{
    if (head == NULL) // list empty
    {
        return;
    }

    struct node *cur = head;
    struct node *prev = NULL;

    while (cur->next != NULL)
    {
        prev = cur;
        cur = cur->next;
    }

    if (prev != NULL)
        prev->next = NULL;

    free(cur);
}

void deleteAny(int x)
{
    if (head == NULL) // list empty
        return;

    struct node *cur = head;
    struct node *prev = NULL;

    while (cur->value != x)
    {
        prev = cur;
        cur = cur->next;
    }
    if (prev != NULL)
        prev->next = cur->next;

    free(cur);
}

void printList()
{
    if (head == NULL) // no list at all
    {
        return;
    }

    struct node *cur = head;

    while (cur != NULL)
    {
        printf("%d \t", cur->value);
        cur = cur->next;
    }
}

int main()
{
    head = NULL;

    insertHead(5);
    insertHead(8);

    insertTail(9);

    insertMiddle(5);

    // printf("%d \n", search(7));

    // deleteHead();
    // deleteTail();
    // deleteAny(5);

    printList();

    return 0;
}