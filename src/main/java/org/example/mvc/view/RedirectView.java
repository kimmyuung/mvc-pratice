package org.example.mvc.view;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

public class RedirectView implements View{

    public static final String DEFAULT_REDIRECT_PREFIX = "redirect";
    private final String name;

    public RedirectView(String name) {
        this.name = name;
    }

    @Override
    public void render(Map<String, ?> model, HttpServletRequest request, HttpServletResponse response) throws Exception {
        response.sendRedirect(name.substring(DEFAULT_REDIRECT_PREFIX.length()) );
        // redirect 자르기
        // return 시 redirect: name으로 포함되서 전송되기 때문
    }
}
