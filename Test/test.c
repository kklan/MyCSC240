#ifndef __ACCOUNT_H__ #define __ACCOUNT_H__ #define USERNAME_LENGTH 20 #define PIN_LENGTH 8 #define OFFSET 1000000 2.a)typedef struct { char username[USERNAME_LENGTH]; int account; short version; union { int old; char new[PIN_LENGTH]; } pin; } account_t; 2.b)
int translate_account (int n);2.c)void import_account (int * n); void print_account(account_t * acct); #endif
