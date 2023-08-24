package hello.hellospring.Controller;

import org.springframework.stereotype.Controller;

@Controller
public class MemberForm {
    private String name; //post로 전달된 name 이 들어옴
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
