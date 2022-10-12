package com.yukio.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 测试
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TbUser implements Serializable {

    private Integer id;

    private String userName;

    private String sex;


}
