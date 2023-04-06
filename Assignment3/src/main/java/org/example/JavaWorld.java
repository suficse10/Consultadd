package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("Java")
public class JavaWorld implements JavaLanguage{

    private PythonLanguage pythonLanguage;

    @Autowired
    public JavaWorld(PythonLanguage pythonLanguage) {
        this.pythonLanguage = pythonLanguage;
    }

    @Override
    public String learningJava() {
        return "I am learning java";
    }

    @Override
    public String learningPython() {
        return pythonLanguage.learningPython();
    }
}
