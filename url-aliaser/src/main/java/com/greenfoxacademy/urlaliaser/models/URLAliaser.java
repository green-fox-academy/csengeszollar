package com.greenfoxacademy.urlaliaser.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Random;

@Entity
//@Table(name = "url_aliaser")
public class URLAliaser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String url;
    private String alias;
    private int hitCount;
    @JsonIgnore
    private int secretCode;

    public URLAliaser(String url, String alias, int hitCount) {
        this.url = url;
        this.alias = alias;
        this.hitCount = hitCount;
        this.secretCode = randomNumber();
    }

    public URLAliaser() {
        this.secretCode = randomNumber();
    }

    public URLAliaser(String url, String alias) {
        this.url = url;
        this.alias = alias;
        this.secretCode = randomNumber();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public int getHitCount() {
        return hitCount;
    }

    public void setHitCount(int hitCount) {
        this.hitCount = hitCount;
    }

    public int getSecretCode() {
        return secretCode;
    }

    public void setSecretCode(int secretCode) {
        this.secretCode = secretCode;
    }

    public int randomNumber(){
        return (int)(Math.random()*9000) + 1000;
    }
}
