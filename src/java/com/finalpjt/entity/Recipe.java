package com.finalpjt.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class Recipe implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(nullable = true , length = 100)
    private String name;
    
    @OneToOne(fetch = FetchType.LAZY)
    private Description description; 
    
    @Column(nullable = true)
    @Temporal(TemporalType.TIME)
    private Date cookingTime;
    
    @Column(nullable = true)
    @Temporal(TemporalType.TIME)
    private Date preparationTime;
   
    @ManyToOne
    private Category category;
    
    @ManyToOne
    private User owner;
            
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Description getDescription() {
        return description;
    }

    public void setDescription(Description description) {
        this.description = description;
    }

    public Date getCookingTime() {
        return cookingTime;
    }

    public void setCookingTime(Date cookingTime) {
        this.cookingTime = cookingTime;
    }

    public Date getPreparationTime() {
        return preparationTime;
    }

    public void setPreparationTime(java.util.Date preparationTime) {
        this.preparationTime = preparationTime;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    
        @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof User)) {
            return false;
        }
        User other = (User) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.finalpjt.entity.Recipe[ id=" + id + " ]";
    }
}
