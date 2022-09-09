package org.example.mvc.view;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ModelAndView {
    private Object view;

    private Map<String, Object> model = new HashMap<>();

    public ModelAndView(String viewName) {
        view = viewName;
    }

    public String getViewName() {
        return (this.view instanceof String ? (String) this.view : null);
        // this.view 가 String이라면 반환 String이 아니라면 null
    }

    public Map<String,?> getModel() {
        return Collections.unmodifiableMap(model);
    }
}
