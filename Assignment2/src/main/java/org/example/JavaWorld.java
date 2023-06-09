package org.example;

public class JavaWorld implements JavaLanguage{

    private PythonLanguage pythonLanguage;

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
