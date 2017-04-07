package io.vertx.ext.swagger.router;

public interface UserIdentity extends Identity {
	String getDisplayName();
	String getEmail();
	String getFirstName();
	String getLastName();
	String getToken();
	void setToken(String token);
}
