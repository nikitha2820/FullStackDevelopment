package com.gentech.assignment.overloading;
class MSWord
{
    MSWord(String title)
    {
        System.out.println("title of report in msword:"+title);
    }
    MSWord(int noofpage)
    {
        System.out.println("no of pages in ms word:"+noofpage);
        System.out.println("-----------------------------");
    }
}
class PPT
{
    PPT(String title)
    {
        System.out.println("title of report in ppt:"+title);
    }
    PPT(int noofslides)
    {
        System.out.println("no of slides:"+noofslides);
    }
}
public class ReportGeneration {
    public static void main(String[] args) {
        MSWord m1=new MSWord("Project 1");
        MSWord m2=new MSWord(45);

        PPT p1=new PPT("PPT 1");
        PPT p2=new PPT(15);

    }
}
