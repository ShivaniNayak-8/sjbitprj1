package dsaprj.mca.dsa;

import java.util.Objects;

public class  Product {
	int prdId;
	String prdName;
	double prdPrice;
	public Product(int prdId, String prdName, double prdPrice) {
		super();
		this.prdId = prdId;
		this.prdName = prdName;
		this.prdPrice = prdPrice;
	}
	@Override
	public String toString() {
		return "Product [prdId=" + prdId + ", prdName=" + prdName + ", prdPrice=" + prdPrice + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(prdId, prdName, prdPrice);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return prdId == other.prdId && Objects.equals(prdName, other.prdName)
				&& Double.doubleToLongBits(prdPrice) == Double.doubleToLongBits(other.prdPrice);
	}
	
}
