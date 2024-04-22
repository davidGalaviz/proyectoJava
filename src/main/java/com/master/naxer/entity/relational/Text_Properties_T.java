package com.master.naxer.entity.relational;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "text_properties_t")
public class Text_Properties_T {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "text_size")
    private Integer size;

    @Column(name = "style", length = 100)
    private String style;

    @Column(name = "property_type")
    private Integer propertyType;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "id", referencedColumnName = "id",nullable = false, insertable = false, updatable = false)
    @JsonIgnore
    private Text_T textT;

    public Integer getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(Integer propertyType) {
        this.propertyType = propertyType;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Text_T getTextT() {
        return textT;
    }

    public void setTextT(Text_T textT) {
        this.textT = textT;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}