#include<stdio.h>
int main()
{
 char name[] = "Your Name";
 printf("Hello, %s\n", name);
 printf("Info: %d %c %p\n", name[0], name[2], &name);
}