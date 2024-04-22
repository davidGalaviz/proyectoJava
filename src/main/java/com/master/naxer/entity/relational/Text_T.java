package com.master.naxer.entity.relational;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity(name="Text_T")
@Table(name = "text_t", schema = "test")
public class Text_T {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "text_value", length = 100)
    private String textValue;

    @Column(name = "text_type")
    private Integer textType;

    @Column(name = "application", length = 100)
    private String application;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "textT", cascade = CascadeType.ALL)
    private List<Text_Properties_T> text_properties_t = new ArrayList<>();

    public List<Text_Properties_T> getText_properties_t() {
        return text_properties_t;
    }

    public void setText_Properties_Ts(List<Text_Properties_T> text_Properties_t) {
        this.text_properties_t = text_Properties_t;
    }

    public Integer getTextType() {
        return textType;
    }

    public void setTextType(Integer textType) {
        this.textType = textType;
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public String getTextValue() {
        return textValue;
    }

    public void setTextValue(String textValue) {
        this.textValue = textValue;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}