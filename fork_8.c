#include<stdio.h>
#include<unistd.h>
#include<stdlib.h>
#include<sys/types.h>
int main(){
        int i;
        int cont=0;
        int p;
        for(i=0;i<2;i++){
                p=fork();
                if(p>0){
                 cont++;
                 p=fork();
                 }
                 if(p==0) cont=0;
        }
        printf("Il sono il processo con pid %d  cicli: %d \n",getpid(), cont);
}
