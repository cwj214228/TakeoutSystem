package model;

import java.io.Serializable;

public class RedEvenlope implements Serializable {

	private String cid;
	private String cname;
	private String bid;
	private String bname;
	private String eid;
	private float lowerlimit;
	private float favorable;
	private String descript;
	private String status;
	private String isused;
	

	
	
	public String getCid() {
		return cid;
	}



	public void setCid(String cid) {
		this.cid = cid;
	}



	public String getCname() {
		return cname;
	}



	public void setCname(String cname) {
		this.cname = cname;
	}



	public String getBid() {
		return bid;
	}



	public void setBid(String bid) {
		this.bid = bid;
	}



	public String getBname() {
		return bname;
	}



	public void setBname(String bname) {
		this.bname = bname;
	}



	public String getEid() {
		return eid;
	}



	public void setEid(String eid) {
		this.eid = eid;
	}



	public float getLowerlimit() {
		return lowerlimit;
	}



	public void setLowerlimit(float lowerlimit) {
		this.lowerlimit = lowerlimit;
	}



	public float getFavorable() {
		return favorable;
	}



	public void setFavorable(float favorable) {
		this.favorable = favorable;
	}



	public String getDescript() {
		return descript;
	}



	public void setDescript(String descript) {
		this.descript = descript;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	public String getIsused() {
		return isused;
	}



	public void setIsused(String isused) {
		this.isused = isused;
	}



	public RedEvenlope(String bid, String bname, String eid, float lowerlimit,
			float favorable, String descript) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.eid = eid;
		this.lowerlimit = lowerlimit;
		this.favorable = favorable;
		this.descript = descript;
	}
	

	
	public RedEvenlope(String cid, String cname, String bid, String bname,
			float favorable, String status, String isused) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.bid = bid;
		this.bname = bname;
		this.favorable = favorable;
		this.status = status;
		this.isused = isused;
	}

	
	
	
}
