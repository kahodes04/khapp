package com.na.ponelarepe;

public class pregunta
{
    private String question;
    private String answer;
    private String id;

    pregunta(String _id, String _question, String _answer){
        id = _id;
        answer = _answer;
        question = _question;
    }

    pregunta (){
        id ="";
        answer = "";
        question = "";
    }

    public void setquestion(String _question){
        question = _question;
    }
    public void setanswer(String _answer){
        answer = _answer;
    }
    public void setid(String _id){
        id = _id;
    }
}
