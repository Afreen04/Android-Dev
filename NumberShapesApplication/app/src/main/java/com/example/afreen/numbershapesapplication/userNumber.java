package com.example.afreen.numbershapesapplication;

import static java.lang.StrictMath.pow;

/**
 * Created by afreen on 3/14/16.
 */
public class userNumber {

        int number;

        public boolean isSquare()
        {
                if(number == 1)
                        return true;
                for (int i=1;i<=(number/2);i++)
                        if (pow(i,2) == number)
                                return true;
                return false;
        }

        public boolean isTriangle()
        {
                int sum=0;
                for (int i=0;sum < number;i++)
                {
                        sum+=i;
                        if (sum == number)
                                return true;
                }
                return false;
        }

}
