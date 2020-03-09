package ccom.nt.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Product2 {
	private int prodId;
	private String prodCode;
	private double prodCost;
	private double prodDisc;
	private double prodGst;
	public Product2() {
	}
	public Product2(int prodId, String prodCode, double prodCost, double prodDisc, double prodGst) {
		super();
		this.prodId = prodId;
		this.prodCode = prodCode;
		this.prodCost = prodCost;
		this.prodDisc = prodDisc;
		this.prodGst = prodGst;
	}
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getProdCode() {
		return prodCode;
	}
	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}
	public double getProdCost() {
		return prodCost;
	}
	public void setProdCost(double prodCost) {
		this.prodCost = prodCost;
	}
	public double getProdDisc() {
		return prodDisc;
	}
	public void setProdDisc(double prodDisc) {
		this.prodDisc = prodDisc;
	}
	public double getProdGst() {
		return prodGst;
	}
	public void setProdGst(double prodGst) {
		this.prodGst = prodGst;
	}
	@Override
	public String toString() {
		return "Product2 [prodId=" + prodId + ", prodCode=" + prodCode + ", prodCost=" + prodCost + ", prodDisc="
				+ prodDisc + ", prodGst=" + prodGst + "]";
	}
	

}
