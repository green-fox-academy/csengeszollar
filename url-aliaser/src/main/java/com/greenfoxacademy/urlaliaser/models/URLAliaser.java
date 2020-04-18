package com.greenfoxacademy.urlaliaser.models;

import javax.annotation.Generated;
import javax.persistence.*;

@Entity
@Table(name = "url_aliaser")
public class URLAliaser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String URL;
    private String alias;

    public URLAliaser(String URL, String alias) {
        this.URL = URL;
        this.alias = alias;
    }

    public URLAliaser() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }
}
