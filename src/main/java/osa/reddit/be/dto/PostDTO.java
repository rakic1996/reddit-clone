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
public class PostDTO {

    private Integer id;
	private String title;
	private String text;
	private LocalDate creationDate;
	private String imagePath;
	private Integer userId;
	private Integer communityId;
	private Integer flairId;
	private List<Integer> commentIds;
    private List<Integer> reportIds;
}