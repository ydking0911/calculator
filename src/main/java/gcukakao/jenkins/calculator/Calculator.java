package gcukakao.jenkins.calculator;

import org.springframework.stereotype.Service;

@Service
public class Calculator {

    public int sum(int a, int b) {
        return a+b;
    }

    public int sub(int a, int b) { return a-b; }

    public int mul(int a, int b) { return a*b; }

    public int div(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("0으로 나눌 수 없습니다.");
        }
        return a/b;
    }

    public String getMyName() {
        return "박영두";
    }

}
