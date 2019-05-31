package algorithm;

public class dividandconquerSort {
	public dividandconquerSort() {
		
	}
    
	public int[] run(int[] input) {		
		sort(input, 0, input.length-1);
		return input;	
	}
	private void sort(int[] input, int left, int right) {
		if(left < right) {
			int mid = (left+right)/2;
			sort(input,left,mid);
			sort(input,mid+1,right);
			merge(input, left, mid, right);
		}	
	}
	
	private static int[] merge(int[] input, int left, int mid, int right) {
		int i=left,j=mid+1;
		int initial = left;
		int[] temp = new int[input.length];
		while(i<=mid && j<=right) {
			if(input[left]<=input[j]) {
				temp[i++] = input[left++];
			}else {
				temp[i++] = input[j++];
			}	
		}
		
        while (left <= mid) {
            temp[i++] = input[left++];
        }

        while ( j <= right ) {
            temp[i++] = input[j++];
        }
       //System.out.println("±¾ÂÖÎ»ÖÃ£º"+initial+"-"+right);
        for(int z=initial; z<=right; z++) {
        	input[z] = temp[z];
        	//System.out.print(temp[z]+"\t");
        }
       // System.out.println();
        
       return input;
	}

}
