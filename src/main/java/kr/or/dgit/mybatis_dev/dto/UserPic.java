package kr.or.dgit.mybatis_dev.dto;

public class UserPic {
	private int id;
	private String name;
	private byte[] pic;
	private String bio;

	/// mybatis에서는 생성자 잘 쓰지 않음...
	// 내가 필요해서 생성자 쓸 경우에는 기본 생성자 만들어줘야 함. 아니면 mybatis 에러 발생

	public int getId() {
		return id;
	}

	public UserPic(int id, String name, byte[] pic, String bio) {
		super();
		this.id = id;
		this.name = name;
		this.pic = pic;
		this.bio = bio;
	}

	public UserPic() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public byte[] getPic() {
		return pic;
	}

	public void setPic(byte[] pic) {
		this.pic = pic;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

}
