//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package baslotto.entity;

public class SaleInfo {
    private String id;
    private String page;
    private String customerName;
    private String lottoNumber;
    private String type;
    private String price;
    private String date;
    
	public SaleInfo() {

	}
	
	public SaleInfo(String page, String customerName, String lottoNumber, String type, String price,
			String date) {
		this.page = page;
		this.customerName = customerName;
		this.lottoNumber = lottoNumber;
		this.type = type;
		this.price = price;
		this.date = date;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getLottoNumber() {
		return lottoNumber;
	}

	public void setLottoNumber(String lottoNumber) {
		this.lottoNumber = lottoNumber;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
}
