package com.yyzzt.govbbo.user.center.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {

    private static final long serialVersionUID = 5930452820870340764L;

    private Integer id;
    private String name;
}
