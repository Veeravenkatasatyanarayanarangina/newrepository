package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the passenger database table.
 * 
 */
@Entity
@NamedQuery(name="Passenger.findAll", query="SELECT p FROM Passenger p")
public class Passenger implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer page;

	private String pfrom;
	@Id
	private Integer pid;

	private String pmobno;

	private String pname;

	private String pticketid;

	private String pto;

	public Passenger() {
	}

	public Integer getPage() {
		return this.page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public String getPfrom() {
		return this.pfrom;
	}

	public void setPfrom(String pfrom) {
		this.pfrom = pfrom;
	}

	public Integer getPid() {
		return this.pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getPmobno() {
		return this.pmobno;
	}

	public void setPmobno(String pmobno) {
		this.pmobno = pmobno;
	}

	public String getPname() {
		return this.pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPticketid() {
		return this.pticketid;
	}

	public void setPticketid(String pticketid) {
		this.pticketid = pticketid;
	}

	public String getPto() {
		return this.pto;
	}

	public void setPto(String pto) {
		this.pto = pto;
	}

}