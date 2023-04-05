package org.example;

import org.springframework.stereotype.Component;

@Component("Python")
public class PythonWorld implements PythonLanguage{

    @Override
    public String learningPython() {
        return "I am learning python";
    }
}
