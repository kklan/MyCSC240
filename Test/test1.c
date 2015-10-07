#include <stdio.h>

int main(void) {
	int i = 4, *j = 0, **k = 240;	     
j = &i;
*j = 30; 
k= &j;
**k = 100;
printf(k);
	return 0;
}
