package algrithm;

import java.util.List;

public class twowaybubbling {
    public twowaybubbling() {
    	   
    }
    
    public int[] run(int[] input){
    	int[] sortarray= input;
    	for (int i=0;i<input.length;i++) {
    		if(i%2 == 0) {
    			sortarray = forwardsort(sortarray);
    		}
    		else {
    			sortarray = backwardsort(input);
    		}
    	}
    	
		return input;
    	
    }
    
    private int[] forwardsort(int[] input) {
    	int temp;
    	for(int i=0;i<input.length-1;i++) {
    		if(input[i]>input[i+1]) {
    			temp = input[i+1];
    			input[i+1] = input[i];
    			input[i] = temp;
    		}
    	}
    	return input;
    }
    
    private int[] backwardsort(int[] input) {
    	int temp;
    	for(int i=input.length-1;i>0;i--) {
    		if(input[i]<input[i-1]) {
    			temp = input[i-1];
    			input[i-1] = input[i];
    			input[i] = temp;
    		}
    	}
    	return input;
    }

}
