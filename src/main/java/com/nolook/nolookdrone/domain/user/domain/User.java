package com.nolook.nolookdrone.domain.user.domain;

import com.nolook.nolookdrone.global.common.BaseTimeEntity;
import jakarta.persistence.*;

@Entity
public class User extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long userIdx;
    @Column
    private String userId;
    @Column
    private String userPassword;
    @Column
    private String userName;
    @Column
    private String address;
    @Column
    private String phone;
    @Column
    private String email;
    @Column
    private Integer age;
    @Column
    private Character sex;

}
