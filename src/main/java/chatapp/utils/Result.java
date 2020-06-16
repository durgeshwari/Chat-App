package chatapp.utils;

import chatapp.user.data.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
public class Result {
	private boolean isSuccess;
	private String message;
	User user;
	
}