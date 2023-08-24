package hello.hellospring.Controller;

public class MemberForm {
    private String name; //post로 전달된 name 이 들어옴
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
