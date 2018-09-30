package pub.taotao.dto;

import com.fasterxml.jackson.annotation.JsonView;

import java.io.Serializable;

public class User implements Serializable {
    public interface SimpleView{}
    public interface DetailView extends SimpleView{}

    private Long id;
    private String username;
    private String password;

    @JsonView(SimpleView.class)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @JsonView(SimpleView.class)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @JsonView(DetailView.class)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
