package com.csuft.builder;

/**
 * 构造者设计模式(Builder)
 * 
 * @author ZX
 *
 */
public class User {

	String name;
	int age;
	String phone;
	String email;
	String address;

	private User() {
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", phone=" + phone + ", email=" + email + ", address=" + address
				+ "]";
	}

	public static class Builder {

		private String name;
		private int age;
		private String phone;
		private String email;
		private String address;

		public Builder() {
		}
		
		public Builder setName(String name) {
			this.name = name;
			return this;
		}

		public Builder setAge(int age) {
			this.age = age;
			return this;
		}

		public Builder setPhone(String phone) {
			this.phone = phone;
			return this;
		}

		public Builder setEmail(String email) {
			this.email = email;
			return this;
		}

		public Builder setAddress(String address) {
			this.address = address;
			return this;
		}

		public User build() {
			User user = new User();
			user.name = name;
			user.age = age;
			user.email = email;
			user.phone = phone;
			user.address = address;
			return user;
		}
	}
}
