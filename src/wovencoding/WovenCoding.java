package wovencoding;

import java.util.Scanner;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Medo
 */
public class WovenCoding {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Get input from user as comma separated commands
        String str = input.nextLine();
        //remove the commas
        str = str.replace(",","");
        //Store the input separately in an array
        char[] ch = new char[str.length()]; 
        for (int i = 0; i < str.length(); i++) { 
            ch[i] = str.charAt(i); 
        } 
        //initialize x-axis and y-axis starting point as (0,0)
        int x = 0;
        int y = 0;
        //default initial direction is taken as north
        String direction = "north";
        //number of places the robot moves
        int number = 0;
        for (int i = 0;i<str.length();i=i+2) { 
            if(direction.equals("north"))
            {
                switch(ch[i]) {
                    case 'F': number = Integer.parseInt(String.valueOf(ch[i+1])); 
                              y = y + number;
                              break;
                    case 'B': number = Integer.parseInt(String.valueOf(ch[i+1]));
                              y = y - number;
                              break;
                    case 'R': direction = "east"; 
                              break;
                    case 'L': direction = "west"; 
                              break;
                    default: System.out.println("default");
                }                
            } 
            else if(direction.equals("south"))
            {
                switch(ch[i]) {
                    case 'F': number = Integer.parseInt(String.valueOf(ch[i+1])); 
                              y = y - number;
                              break;
                    case 'B': number = Integer.parseInt(String.valueOf(ch[i+1]));
                              y = y + number;
                              break;
                    case 'R': direction = "west"; 
                              break;
                    case 'L': direction = "east";   
                              break;
                    default: System.out.println("default");
                }                
            } 
            else if(direction.equals("east"))
            {
                switch(ch[i]) {
                    case 'F': number = Integer.parseInt(String.valueOf(ch[i+1])); 
                              x = x + number;
                              break;
                    case 'B': number = Integer.parseInt(String.valueOf(ch[i+1]));
                              x = x - number;                     
                              break;
                    case 'R': direction = "south"; 
                              break;
                    case 'L': direction = "north"; 
                              break;
                    default: System.out.println("default");
                }                
            }
            else if(direction.equals("west"))
            {
                switch(ch[i]) {
                    case 'F': number = Integer.parseInt(String.valueOf(ch[i+1])); 
                              x = x - number;
                              break;
                    case 'B': number = Integer.parseInt(String.valueOf(ch[i+1]));
                              x = x + number;
                              break;
                    case 'R': direction = "north"; 
                              break;
                    case 'L': direction = "south"; 
                              break;
                    default: System.out.println("default");
                }                
            }
            
                
        } 
        int distance = Math.abs(x) + Math.abs(y);
        System.out.println("Maximum number of distance : " + distance);
    }
    }
    

