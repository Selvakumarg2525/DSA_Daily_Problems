package com.telusko;

public class pattern {
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
    public static void main(String args[]){
        pattern_18();
    }
}
