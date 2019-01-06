package com.maxmallz;
import  java.io.InputStreamReader;
public class Main {

    public static void main(String[] args) {
    	//This program add two numbers

		float[] values1 = new float[]{100f,50f,30,25};
		float[] values2 = new float[]{20f, 15f, 45f, 0f};
		char[] operationCode = new char[]{'A', 'S', 'M', 'D'};
		float[] results = new float[operationCode.length];

		char type = 'D';

		for(int i = 0; i < operationCode.length; i++){
			switch (type) {
				case 'A':
					results[i] = values1[i] + values2[i];
					break;
				case 'S':
					results[i] = values1[i] - values2[i];
					break;
				case 'M':
					results[i] = values1[i] * values2[i];
					break;
				case 'D':
					if(values2[i] == 0){results[i] = 0;}
					else{results[i] = values1[i] / values2[i];}
					break;
				default:
					System.out.println("Invalid Selection");
					break;
			}
		}

		for (float f:results) {
			System.out.println(f);
		}
    }
}
