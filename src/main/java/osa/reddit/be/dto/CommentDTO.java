package osa.reddit.be.dto;

import java.time.LocalDate;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CommentDTO {

    private Integer id;
	private String text;
	private LocalDate timestamp;
	private boolean isDeleted;
	private Integer userId;
	private Integer postId;
    private List<Integer> reportIds;
}
