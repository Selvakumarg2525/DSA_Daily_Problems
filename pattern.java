package com.telusko;

public class pattern {
    static void pattern_1(){
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    static void pattern_2(){
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    static void pattern_3(){
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print((j+1)+" ");
            }
            System.out.println();
        }
    }
    static void pattern_4(){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    static void pattern_5(){
        int n=5;
        for(int i=5;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    static void pattern_6(){
        int n=5;
        for(int i=n;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    static void pattern_7(){
        int n=5;
        for(int a=0;a<n;a++) {
            for (int i = n-1-a; i < n && i > 0; i--) {
                System.out.print(" ");
            }

            for (int j = 0;j<2*a+1;j++) {
                System.out.print("*");
            }
            for (int k = n - 1; k < n && k > 0; k--) {
                System.out.print(" ");
            }
            System.out.println();
        }
     }
     static void pattern_8(){
        int n=5;
        for(int a=0;a<n;a++){
            for(int b=0;b<a;b++){
                System.out.print(" ");
            }
            for(int c=0;c<(2*n)-(2*a+1);c++){
                System.out.print("*");
            }
            for(int d=0;d<a;d++){
                System.out.print(" ");
            }
            System.out.println();
        }
     }
     static void pattern_9(){
         int n=5;
         for(int a=0;a<n;a++) {
             for (int i = n-1-a; i < n && i > 0; i--) {
                 System.out.print(" ");
             }

             for (int j = 0;j<2*a+1;j++) {
                 System.out.print("*");
             }
             for (int k = n - 1; k < n && k > 0; k--) {
                 System.out.print(" ");
             }
             System.out.println();
         }

             for(int a=0;a<n;a++){
                 for(int b=0;b<a;b++){
                     System.out.print(" ");
                 }
                 for(int c=0;c<(2*n)-(2*a+1);c++){
                     System.out.print("*");
                 }
                 for(int d=0;d<a;d++){
                     System.out.print(" ");
                 }
                 System.out.println();
             }

    }
    static void pattern_10(){
        int n=5;
        for(int a=0;a<=n;a++){
            for(int b=0;b<a;b++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int c=n-1;c>=0;c--){
            for(int d=c;d>0;d--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern_11(){
        int n=5;
        int start=1;
        for(int a=0;a<n;a++){
            if(a%2==0)start=1;
            else start=0;
            for(int b=0;b<=a;b++){
                System.out.print(start);
                start=1-start;
            }
            System.out.println();
        }
    }
    static void pattern_12(){
        int n=4;
        for(int a=1;a<=n;a++){
            for(int b=0;b<a;b++){
                System.out.print(b+1);
            }
            for(int c=0;c<2*n-2*a;c++){
                System.out.print(" ");
            }
            for(int d=a;d>0;d--){
                System.out.print(d);
            }
            System.out.println();
        }
    }
    static void pattern_13(){
        int n=5;
        int count=1;
        for(int a=0;a<n;a++){
            for(int b=0;b<=a;b++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
    static void pattern_14(){
        int n=5;
        int a=65;
        for(int i=0;i<n;i++){
            for(int b=0;b<i;b++){
                System.out.print((char)a);
                a+=1;
            }
            a=65;
            System.out.println();
        }
    }
    static void pattern_15(){
        int n=5;
        int a=65;
        for(int i=n;i>0;i--){
            for(int b=0;b<i;b++){
                System.out.print((char)a);
                a+=1;
            }
            a=65;
            System.out.println();
        }
    }
    static void pattern_16(){
        int n=5;
        int c=65;
        for(int a=0;a<n;a++){
            for(int b=0;b<=a;b++){
                System.out.print((char)c);
            }
            c+=1;
            System.out.println();
        }
    }
    static void pattern_17(){
        int n=5;
        for(int a=0;a<n;a++){
            for(int b=0;b<n-a-1;b++){
                System.out.print(" ");
            }
            char ch='A';
            for(int c=0;c<2*a+1;c++){
                System.out.print(ch);
                if(c+1>a) ch--;
                else ch++;
            }
            for(int d=0;d<n-a-1;d++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void pattern_18(){
        int n=5;
        char ch=(char)('A'+(n-1));
        for(int a=0;a<n;a++){

            for(int b=0;b<=a;b++){
                System.out.print((char)((ch-a)+b));
            }
            System.out.println();
        }
    }
    static void pattern_19(){
     int n=5;
        int sp=0;
        for(int i=5;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            for(int c=0;c<sp;c++){
                System.out.print(" ");
            }
            sp+=2;
            for(int d=i;d>0;d--){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int a=1;a<=n;a++){
            for(int b=0;b<a;b++){
                System.out.print("*");
            }
            for(int c=0;c<2*n-2*a;c++){
                System.out.print(" ");
            }
            for(int d=a;d>0;d--){
                System.out.print("*");
            }
            System.out.println();
        }
    public static void main(String args[]){
        pattern_18();
    }
}
