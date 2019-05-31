package algorithm;

public class quickSort {
    public quickSort() {
    	
    }
    
    public int[] run(int[] input, int left, int right) {
    	if(left<right) {
        	int index = sentryindex(input,left, right);
        	run(input, left, index-1);
        	run(input,index+1,right);
    	}
    	return input;
    }
    
    private int sentryindex(int[] input,int left, int right) {
    	int sentry = input[left];
    	while(left < right) {
        	while(left < right)
            	if(sentry > input[right]) {
            		input[left] = input[right];
            		input[right] = sentry;
            		left++;
                    break;
            	}else {
            		right--;
            	}
        	while(left < right) {
            	if(sentry < input[left]) {
            		input[right] = input[left];
            		input[left] = sentry;
            		right--;
            		break;
            	}else {
            		left++;
            	}
        	}
    	}
        return left;
    }
}
