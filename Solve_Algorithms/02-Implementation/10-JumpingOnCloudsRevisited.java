package com.careerdevs.practice.implementation;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class JumpingOnClouds {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] clouds, int k) {
        int engery=100;
        int numberOfClouds=clouds.length;

        for(int cloud=0; cloud<numberOfClouds; cloud++){
            int cloudJump=(cloud+k)%numberOfClouds;
            if(cloudJump%k==0)
                engery--;
            if(cloudJump%k==0 && clouds[cloud]==1)
                engery=engery-2;
            // System.out.printf("cloud: %d | formula: %d | Clouds: %d | energy: %d\n",cloud, (cloud+k)%numberOfClouds,clouds[cloud],energy);
        }
        return engery;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = jumpingOnClouds(c, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

