package com.example.parul.mapwithfloat;


public class HelplineClass{

private String name,pol,amb,fire;
private int display_pic;

public HelplineClass(String name,String police,String amb,String fire,int display_pic){
        this.name=name;
        this.pol=police;
        this.amb=amb;
        this.fire=fire;
        this.display_pic=display_pic;
        }

        public String getName(){
                return name;
        }
public String getPolice(){
        return pol;
        }

public String getAmb() {
        return amb;
        }

public String getFire(){
        return fire;
        }

public int getDisplay_pic(){return display_pic;}
        }