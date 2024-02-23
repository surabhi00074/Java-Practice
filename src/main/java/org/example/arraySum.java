package org.example;

public class arraySum {
        public static void main(String[] args) {
            int array[] = {2,4, 6, 7, 9};
            int sum =0;
            for(int i = 0; i< array.length ; i++){
                sum=sum+array[i];
            }
            System.out.println(sum);
        }
    }

