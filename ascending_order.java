
public class asc_ord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,4,3,9,44,44,889,44,745,41,-798};
			
		for(int h:asc_ordd(a))
			System.out.print(h+" ");	
	}
	
	private static int[] asc_ordd(int[] in) {
		for (int j=0;j<in.length-1;j++) {
			boolean sorted = true;
			for(int i=0;i<in.length-1-j;i++) {
				if (in[i]>in[i+1]) {
					int temp = in[i];
					in[i] = in[i+1];
					in[i+1] = temp;
					sorted = false;	
				}
			}
			if(sorted)
				break;		
		}
		return in;
	}
}
