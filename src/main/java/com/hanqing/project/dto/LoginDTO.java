package com.hanqing.project.dto;

import com.hanqing.project.entity.Account;
import lombok.Data;

@Data
public class LoginDTO {
    private String path;
    private String error;
    private Account account;
}
