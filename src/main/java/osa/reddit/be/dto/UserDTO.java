package osa.reddit.be.dto;

import java.time.LocalDate;
import java.util.List;

import osa.reddit.be.model.Comment;
import osa.reddit.be.model.Post;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
	
	private Integer id;
	private String username;
	private String password;
	private String email;
	private String avatar;
	private LocalDate registrationDate;
	private String description;
	private String displayName;
	private String userType;
    private List<Comment> comments;
    private List<Post> posts;
}