package edu.neu.coe.info6205.union_find;

import java.util.Random;
import java.util.Scanner;

public class union_find {
    public static void main(String[] args) {
        System.out.println("n=1,m="+count(1));
        System.out.println("n=4,m="+count(4));
        System.out.println("n=8,m="+count(8));
        System.out.println("n=16,m="+count(16));
        System.out.println("n=32,m="+count(32));
        System.out.println("n=64,m="+count(64));
        System.out.println("n=128,m="+count(128));
    }
    public static int count(int n){
        WQUPC wqupc = new WQUPC(n);
        int count=0;
        Random random = new Random();
        while(!union(wqupc,n)){
            int[] pair = new int[] {random.nextInt(n), random.nextInt(n)};
            if(!wqupc.connected(pair[0],pair[1])){
                wqupc.union(pair[0],pair[1] );
                count++;
            }

        }
        return count;
    }
    public static boolean union(WQUPC w, int n){
        for(int i=1;i<n;i++){
            if(!w.connected(0,i)){
                return false;
            }
        }
        return true;
    }
}
