package com.springboot.blog.payload;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
public class CommentDto {
    private long id;

    //name should not be null or empty
    @NotEmpty(message = "Name should not be null or empty")
    @Size(min = 2, message = "Name should be a minimum of 2 characters")
    private String name;

    //email should not be null or empty
    //email field validation
    @NotEmpty(message = "Email should not be null or empty")
    @Email
    private String email;

    //Comment body should not be null or empty
    //Comment body must be minimum 10 characters
    @NotEmpty
    @Size(min = 10, message = "Comment body must be minimum 10 characters")
    private String body;
}
