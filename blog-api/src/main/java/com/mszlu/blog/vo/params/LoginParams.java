package com.mszlu.blog.vo.params;

import com.mszlu.blog.vo.Result;
import lombok.Data;

@Data
public class LoginParams {

    private String account;

    private String password;

    private String nickname;

}
