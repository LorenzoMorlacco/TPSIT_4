#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>
#include<sys/types.h>
main(){
       pid_t pid;// variabile con pid dei processi
       int n;// variabile contenente il numero dei processi

       do{// ciclo che limita inserimento 
          printf("Quanti processi vuoi creare? ");
          scanf("%d",&n);
       }while((n<0)||(n>3));

       printf("Sono il processo padre %d\n",getpid());// stampa del padre

       while(n>0){// ciclo che crea figlio fino a n>0
          pid=fork();// generazione del figlio
          if(pid==0){// se si è un figlio
                 sleep(1);
                 printf("\n");
                 printf("Sono il processo figlio %d",getpid());// stampa dei figli
                 printf(" e mio padre ha PID %d\n",getppid());//stampa dei figli
          }
          n--;// decremento di n
       }

       exit(0);
}
