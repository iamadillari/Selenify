package com.testing;

import java.util.HashMap;
import java.util.Map;

public class Test29Aug {

        /*
         *   The class can only be Main
         */

        public static void main(String []args) {
            String str = "Adil Lari";

            //output : "a2l2i2"
            str = str.toLowerCase().replace(" ", "");
            Map<Character, Integer> charCountMap = new HashMap<>();

            for(char c: str.toCharArray())
            {
                charCountMap.put(c, charCountMap.getOrDefault(c,0)+1);
            }


            StringBuilder output = new StringBuilder();

            //for(char c : charCountMap.keySet())
            for(Map.Entry<Character,Integer> entry :
                    charCountMap.entrySet())

            {
                if (entry.getValue()>1) {
                    output.append(entry.getKey()).append(entry.getValue());
                }
            }

            System.out.println(output.toString());

        }

    }

