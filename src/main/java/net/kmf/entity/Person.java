package net.kmf.entity;

import javax.persistence.*;

/**
 * The type Person.
 */
@Entity
@Table (name = "person")
public class Person {
    /**
     * Gets id.
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private int id;


    private String gender;
    private String name;
    private String description;
    private String image_url;

    /**
     * Instantiates a new Person.
     */
    public Person() {
    }

    /**
     * Instantiates a new Person.
     *
     * @param gender      the gender
     * @param name        the name
     * @param description the description
     * @param imageUrl    the image url
     */
    public Person(String gender, String name, String description, String imageUrl) {
        this.gender = gender;
        this.name = name;
        this.description = description;
        this.image_url = imageUrl;
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
    @Column(name = "image_url", nullable = true, length = 300)
    public String getImageUrl() {
        return image_url;
    }

    /**
     * Sets image url.
     *
     * @param imageUrl the image url
     */
    public void setImageUrl(String imageUrl) {
        this.image_url = imageUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (id != person.id) return false;
        if (gender != null ? !gender.equals(person.gender) : person.gender != null) return false;
        if (name != null ? !name.equals(person.name) : person.name != null) return false;
        if (description != null ? !description.equals(person.description) : person.description != null) return false;
        if (image_url != null ? !image_url.equals(person.image_url) : person.image_url != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (image_url != null ? image_url.hashCode() : 0);
        return result;
    }
}
