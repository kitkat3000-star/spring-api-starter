package com.codewithmosh.store.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class UserDto {
    private Long id;
    private String name;
    private String email;

//    @JsonIgnore
//    @JsonProperty("user_id")
//    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
//    private LocalDateTime createdAt;
//    @JsonInclude(JsonInclude.Include.NON_NULL)
//    private String phoneNumber;
}
