package com.viktorisa.frmltrx.model;

public class Repository
{
    public static final int TYPE_JSON = 1;
    public static final int TYPE_XML = 2;
    
    private String name;
    private int type;
    private String content;
    
    public Repository(String name, int type, String content) {
        this.name = name;
        this.type = type;
        this.content = content;
    }
    
    public String getName ()
    {
        return name;
    }
    
    public void setName (String name)
    {
        this.name = name;
    }
    
    public int getType ()
    {
        return type;
    }
    
    public void setType (int type)
    {
        this.type = type;
    }
    
    public String getContent ()
    {
        return content;
    }
    
    public void setContent (String content)
    {
        this.content = content;
    }
}
