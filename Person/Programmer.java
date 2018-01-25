
public class Programmer extends Employee implements Certification {
	protected int no_of_proj_done;
	protected String cname;
	
	public int getNo_of_proj_done() {
		return no_of_proj_done;
	}
	
	public void setNo_of_proj_done(int no_of_proj_done) {
		this.no_of_proj_done = no_of_proj_done;
		
	}
	public void setCertification(String cname) {
		this.cname = cname;
	}

	public String getCertification() {
		return cname;
		// TODO Auto-generated method stub
		
	}
	
}
