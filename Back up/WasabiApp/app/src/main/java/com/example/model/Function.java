package com.example.model;

public class Function {
    private int functionThumb;
    private  String functionName;
    private  String functionName2;

    public Function(int functionThumb, String functionName, String functionName2) {
        this.functionThumb = functionThumb;
        this.functionName = functionName;
        this.functionName2 = functionName2;
    }

    public int getFunctionThumb() {
        return functionThumb;
    }

    public void setFunctionThumb(int functionThumb) {
        this.functionThumb = functionThumb;
    }

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public String getFunctionName2() {
        return functionName2;
    }

    public void setFunctionName2(String functionName2) {
        this.functionName2 = functionName2;
    }
}
