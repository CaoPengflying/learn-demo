package com.cpf.zzc;

public class GCTest {
    public static final int _1MB = 1024 * 1024;

    public static void main(String[] args) {
        /*
        -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8
         */
        testAllocation();
//        testPretenureSizeThreshold();
    }

    public static void testAllocation(){
        byte[] a1, a2, a3, a4;
        a1 = new byte[2 * _1MB];
        a2 = new byte[4 * _1MB];
        a3 = new byte[2 * _1MB];
        a4 = new byte[4 * _1MB];
    }

    public static void testPretenureSizeThreshold() {
        // -XX:PretenureSizeThreshold=3145728
        byte[] a;
        a = new byte[8 * _1MB];
    }

}
