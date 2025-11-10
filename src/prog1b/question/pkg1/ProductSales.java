package prog1b.question.pkg1;

public class ProductSales implements IProductSales {
	public int TotalSales(int[][] productSales) {
		int total = 0;
		if (productSales == null) {
			return 0;
		}
		for (int[] row : productSales) {
			if (row == null) continue;
			for (int v : row) {
				total += v;
			}
		}
		return total;
	}

	public double AverageSales(int[][] productSales) {
		if (productSales == null) {
			return 0.0;
		}
		int count = 0;
		int total = 0;
		for (int[] row : productSales) {
			if (row == null) continue;
			for (int v : row) {
				total += v;
				count++;
			}
		}
		return count == 0 ? 0.0 : (double) total / count;
	}

	public int MaxSale(int[][] productSales) {
		if (productSales == null) {
			return 0;
		}
		int max = Integer.MIN_VALUE;
		boolean hasValue = false;
		for (int[] row : productSales) {
			if (row == null) continue;
			for (int v : row) {
				if (v > max) {
					max = v;
				}
				hasValue = true;
			}
		}
		return hasValue ? max : 0;
	}

	public int MinSale(int[][] productSales) {
		if (productSales == null) {
			return 0;
		}
		int min = Integer.MAX_VALUE;
		boolean hasValue = false;
		for (int[] row : productSales) {
			if (row == null) continue;
			for (int v : row) {
				if (v < min) {
					min = v;
				}
				hasValue = true;
			}
		}
		return hasValue ? min : 0;
	}
}
