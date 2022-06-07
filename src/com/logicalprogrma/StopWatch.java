package com.logicalprogrma;

import java.util.Scanner;

public class StopWatch

{

public long startTime=0;

public long stopTime=0;

public long elapsed;




public void start()

{

    startTime=System.currentTimeMillis();

    System.out.println("Start time is: "+startTime);

}




public void stop()

{

    stopTime=System.currentTimeMillis();

    System.out.println("Stop time is: "+stopTime);

}




public long getElapsedTime()

{

    elapsed=stopTime-startTime;

    return elapsed;

}




public static void main(String[] args) throws Exception

{

    StopWatch sw=new StopWatch();

    Scanner sc = new Scanner(System.in);

    System.out.println("Press 1 to Start Time: ");

    sc.nextInt();

    sw.start();




    System.out.println();

    System.out.println("Press anynumber to Stop Time: ");

    sc.nextInt();

    sw.stop();




    long l=sw.getElapsedTime();

    System.out.println();

    System.out.println("Total Time Elapsed(in millisec) is:"+l);

    System.out.println();

    System.out.println("Converting millisec to seconds: "+(l/1000)+" sec");

}

}