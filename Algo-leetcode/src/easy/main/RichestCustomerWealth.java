package easy.main;

public class RichestCustomerWealth {

	/* 1672. Richest Customer Wealth */
	public static void main(String[] args) {
		int[][] accounts = {{1,5}, {7,3}, {3, 5}};

		RichestCustomerWealth customer = new RichestCustomerWealth();
		System.out.println(customer.maximumWealth(accounts));
	}

	public int maximumWealth(int[][] accounts) {
		int m = accounts.length;
		int n = accounts[0].length;
		int output = 0;
		
		for(int i=0; i<m; i++) {
			int tmp = 0;
			
			for(int j=0; j<n; j++) 
				tmp += accounts[i][j];
			
			output = Math.max(output, tmp);
		}

		return output;
	}
}
