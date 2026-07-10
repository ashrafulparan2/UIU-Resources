#include <stdio.h>

#define MAX 100

int stk[MAX], top = -1, n = MAX;

int pop()
{
    int y;
    if (top <= -1)
        printf("\n Stack is under flow");
    else
    {
        y = stk[top];
        top--;
        return y;
    }
}

void push(int x)
{
    if (top >= n - 1)
        printf("\n STACK is over flow");
    else
    {
        top++;
        stk[top] = x;
    }
}

void printStack()
{
    int i;

    if (top <= -1)
    {
        printf("\n Stack is empty");
        return;
    }

    printf("\n Current stack (top to bottom): ");
    for (i = top; i >= 0; i--)
        printf("%d ", stk[i]);
}

int main()
{
    push(10);
    push(20);
    push(30);

    printStack();

    printf("\n Popped element is: %d", pop());
    printStack();
    printf("\n Popped element is: %d", pop());
    printStack();
    printf("\n Popped element is: %d", pop());
    printStack();

    return 0;
}