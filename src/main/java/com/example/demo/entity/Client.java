package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_client")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cli_code;

    @Column(nullable = false)
    private String cli_name;

    @Column(nullable = false)
    private String cli_last_name;

    @Column(nullable = false)
    private String cli_pic;

    @Column(nullable = false)
    private String cli_email;
    
    @Column(nullable = false)
    private String cli_type;

    @Column(nullable = false)
    private String cli_password;

    
    
    
    
    public Integer getCli_code() {
        return cli_code;
    }

    public void setCli_code(Integer cli_code) {
        this.cli_code = cli_code;
    }

    
    
    public String getCli_name() {
        return cli_name;
    }

    public void setCli_name(String cli_name) {
        this.cli_name = cli_name;
    }
    
    

    public String getCli_last_name() {
        return cli_last_name;
    }

    public void setCli_last_name(String cli_last_name) {
        this.cli_last_name = cli_last_name;
    }
    
    
    

    public String getCli_pic() {
        return cli_pic;
    }

    public void setCli_pic(String cli_pic) {
        this.cli_pic = cli_pic;
    }
    
    
    

    public String getCli_email() {
        return cli_email;
    }

    public void setCli_email(String cli_email) {
        this.cli_email = cli_email;
    }
    
    
    
    public String getCli_type() {
        return cli_type;
    }

    public void setCli_type(String cli_type) {
        this.cli_type = cli_type;
    }

    
    
    
    public String getCli_password() {
        return cli_password;
    }

    public void setCli_password(String cli_password) {
        this.cli_password = cli_password;
    }
    
    
    
}