class WndersofWorld{
 public static void main(String[] agrs)
 {
   String tajMahal = "Taj Mahal";
   String colosseum = "Colosseum";
   String chichenItza = "Chichen Itza";
   String machuPicchu = "Machu Picchu";
   String christTheRedeemer = "Christ the Redeemer ";
   String petra = "Petra ";
   String greatWallOfChina  = "Great Wall of China";

   String[] wonders = {tajMahal,colosseum,christTheRedeemer,machuPicchu,chichenItza,petra,greatWallOfChina};

   for(int i=0; i<wonders.length; i++)
   {
	   System.out.println("Wonder is at possition "+i+" is "+wonders[i]);
   }	   
   System.out.println("===============================================");
   
   wonders[0] = "New Taj Mahal";
   wonders[1] = "New Colosseum";
   
   for(int i=wonders.length-1; i>=0; i--)
   {
	   System.out.println("Wonder is at possition "+i+" is "+wonders[i]);
   }	 
   
 }
}