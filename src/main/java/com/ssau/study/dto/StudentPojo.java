package com.ssau.study.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Builder
public class StudentPojo {
    private long id;
    private String name;
    private Date birthdate;
    private int number;
    private String group;

}
