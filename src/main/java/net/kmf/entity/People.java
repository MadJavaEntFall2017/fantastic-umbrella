package net.kmf.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * The type People.
 */
@Entity
public class People {
    private int id;
    private String gender;
    private String name;
    private String description;
    private String imageUrl;

    /**
     * Instantiates a new People.
     */
    public People() {
    }

    /**
     * Instantiates a new People.
     *
     * @param id          the id
     * @param gender      the gender
     * @param name        the name
     * @param description the description
     * @param imageUrl    the image url
     */
    public People(int id, String gender, String name, String description, String imageUrl) {
        this.id = id;
        this.gender = gender;
        this.name = name;
        this.description = description;
        this.imageUrl = imageUrl;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets gender.
     *
     * @return the gender
     */
    @Basic
    @Column(name = "gender", nullable = true, length = 20)
    public String getGender() {
        return gender;
    }

    /**
     * Sets gender.
     *
     * @param gender the gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    @Basic
    @Column(name = "name", nullable = true, length = 50)
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets description.
     *
     * @return the description
     */
    @Basic
    @Column(name = "description", nullable = true, length = 1000)
    public String getDescription() {
        return description;
    }

    /**
     * Sets description.
     *
     * @param description the description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Gets image url.
     *
     * @return the image url
     */
    @Basic
    @Column(name = "image_url", nullable = true, length = 60)
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * Sets image url.
     *
     * @param imageUrl the image url
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        People people = (People) o;

        if (id != people.id) return false;
        if (gender != null ? !gender.equals(people.gender) : people.gender != null) return false;
        if (name != null ? !name.equals(people.name) : people.name != null) return false;
        if (description != null ? !description.equals(people.description) : people.description != null) return false;
        if (imageUrl != null ? !imageUrl.equals(people.imageUrl) : people.imageUrl != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (imageUrl != null ? imageUrl.hashCode() : 0);
        return result;
    }
}