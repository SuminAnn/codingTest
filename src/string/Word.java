package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Word {
	public static void main(String[] args)throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine();
		int[] arr= new int[26];
		int max = 0;
		char ch = 0;
		
		for(int i=0; i<word.length(); i++) {
			if('A'<=word.charAt(i) && word.charAt(i) <= 'Z') {
				arr[word.charAt(i)-65]++;
			}else {
				arr[word.charAt(i)-97]++;
			}
		}
		
		for(int j=0; j<26; j++) {
			if(arr[j] > max) {
				max = arr[j];
				ch = (char)(j+65);
			}else if(arr[j] == max) {
				ch = '?';
			}
		}
		System.out.println(ch);
	}
}
