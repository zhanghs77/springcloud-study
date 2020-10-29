package com.zhanghongshan.study.springcloud.dubbo.provider.module.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author zhangmin
 * @since 2020-10-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Demo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private String id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 关键词
     */
    private String keyWord;

    /**
     * 打卡时间
     */
    private LocalDateTime punchTime;

    /**
     * 工资
     */
    private BigDecimal salaryMoney;

    /**
     * 奖金
     */
    private Double bonusMoney;

    /**
     * 性别 {男:1,女:2}
     */
    private String sex;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 生日
     */
    private LocalDate birthday;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 个人简介
     */
    private String content;

    /**
     * 创建人
     */
    private String createBy;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 修改人
     */
    private String updateBy;

    /**
     * 修改时间
     */
    private LocalDateTime updateTime;

    /**
     * 所属部门编码
     */
    private String sysOrgCode;


}
