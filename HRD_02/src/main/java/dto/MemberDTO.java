package dto;

public class MemberDTO {
	String m_no,p_name,m_name,p_school,m_jumin,m_city,p_tel;

	public String getM_no() {
		return m_no;
	}

	public void setM_no(String m_no) {
		this.m_no = m_no;
	}

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public String getM_name() {
		return m_name;
	}

	public void setM_name(String m_name) {
		this.m_name = m_name;
	}

	public String getP_school() {
		return p_school;
	}

	public void setP_school(String p_school) {
		this.p_school = p_school;
	}

	public String getM_jumin() {
		return m_jumin;
	}

	public void setM_jumin(String m_jumin) {
		this.m_jumin = m_jumin;
	}

	public String getM_city() {
		return m_city;
	}

	public void setM_city(String m_city) {
		this.m_city = m_city;
	}

	public String getP_tel() {
		return p_tel;
	}

	public void setP_tel(String p_tel) {
		this.p_tel = p_tel;
	}

	@Override
	public String toString() {
		return "MemberDTO [m_no=" + m_no + ", p_name=" + p_name + ", m_name=" + m_name + ", p_school=" + p_school
				+ ", m_jumin=" + m_jumin + ", m_city=" + m_city + ", p_tel=" + p_tel + "]";
	}

	public MemberDTO(String m_no, String p_name, String m_name, String p_school, String m_jumin, String m_city,
			String p_tel) {
		super();
		this.m_no = m_no;
		this.p_name = p_name;
		this.m_name = m_name;
		this.p_school = p_school;
		this.m_jumin = m_jumin;
		this.m_city = m_city;
		this.p_tel = p_tel;
	}


}
