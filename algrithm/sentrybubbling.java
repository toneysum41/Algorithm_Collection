package algrithm;

public class sentrybubbling {
	
    public sentrybubbling() {
 	   
    }
    
    public int[] run(int[] input){
    	int[] sortarray= input;
    	int indexF = 0;
    	int indexB = 0;
    	for (int i=0;i<input.length;i++) {
    		if(i%2 == 0) {   			
    			sortarray = forwardsort(indexF, indexB,sortarray);
    			indexF++;
    		}
    		else {
    			sortarray = backwardsort(indexF,indexB, input);
    			indexB++;
    		}
    	}
    	
		return input;
    	
    }
    
    private int[] forwardsort(int indexF, int indexB, int[] input) {
    	int temp;
    	for(int i=indexF;i<input.length-indexB-1;i++) {
    		if(input[i]>input[i+1]) {
    			temp = input[i+1];
    			input[i+1] = input[i];
    			input[i] = temp;
    		}
    	}
    	return input;
    }
    
    private int[] backwardsort(int indexF, int indexB, int[] input) {
    	int temp;
    	for(int i=input.length-indexB-1;i>indexF;i--) {
    		if(input[i]<input[i-1]) {
    			temp = input[i-1];
    			input[i-1] = input[i];
    			input[i] = temp;
    		}
    	}
    	return input;
    }
}
