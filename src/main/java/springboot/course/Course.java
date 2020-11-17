package springboot.course;

import springboot.topics.Topic;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity //Jpa will recognise this Topic class as entity class and treat Topic as table, class member variables as columns, instance of the class as each rows
public class Course {

    @Id
    private String id;
    private String name;
    private String description;


    @ManyToOne
    private Topic topic;

    public Course() {
    }

    public Course(String id, String name, String description, String topicid) {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
        this.topic=new Topic(topicid, "", "");
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    public Topic getTopic() {
        return topic;
    }


}
