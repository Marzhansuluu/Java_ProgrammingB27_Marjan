package day24_array.homework;

import java.util.Arrays;

public class ZoneArray {
    public static void main(String[] args) {
        /*
        Given two values:
	app = "google"
	& zone = "us-east-1#us-west-1#us-west-2#eu-east-1#eu-west-1"

deploy the app to each zone. Each zone is seperated by the # character

	Ex:
		Deploying etsy to us-east-1...
		Deployment completed for us-east-1

		Deploying etsy to us-west-1...
		Deployment completed for us-west-1

		etc...
         */
        String str = "us-east-1#us-west-1#us-west-2#eu-east-1#eu-west-1";
        String app ="google";

        String[] str2 = str.split("#");
        System.out.println(Arrays.toString(str2));
        for(String eachString : str2){
            System.out.println(eachString);
            for(int i =0; i < eachString.length()-1; i++){

            }
        }
    }
}
