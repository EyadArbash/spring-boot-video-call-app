package com.eyad.videocall.user;

public class User {

	private String username;
	private String email;
	private String password;
	private String status;
	public User(String userName, String email, String password, String status) {
		super();
		this.username = userName;
		this.email = email;
		this.password = password;
		this.status = status;
	}
	public String getUserName() {
		return username;
	}
	public void setUserName(String userName) {
		this.username = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public static class Builder {
        private String username;
        private String email;
        private String password;
        private String status;

        public Builder username(String userName) {
            this.username = userName;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder password(String password) {
            this.password = password;
            return this;
        }

        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public User build() {
            return new User(username, email, password, status);
        }
    }

    public static Builder builder() {
        return new Builder();
    }
}
