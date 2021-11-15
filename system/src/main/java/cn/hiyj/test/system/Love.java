package cn.hiyj.test.system;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author yujie
 */
@Component
@ConfigurationProperties(prefix = "love")
public class Love {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Love() {
    }

    public Love(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Love{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}