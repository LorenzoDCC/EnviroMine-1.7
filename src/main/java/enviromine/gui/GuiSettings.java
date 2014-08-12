package enviromine.gui;


public class GuiSettings implements java.io.Serializable
{

   public static boolean ShowGuiIcons;
   public static float guiScale;
   public static boolean sweatParticals;	
   public static boolean insaneParticals;
   public static boolean useFarenheit = false;
   public static String heatBarPos;
   public static String waterBarPos;
   public static String sanityBarPos;
   public static String oxygenBarPos;
	
   public static boolean ShowText;
   public static boolean ShowDebug;
	
   public static boolean breathSound;
   public static int breathPause;
   public static float breathVolume;

   public GuiSettings LoadDefaults(GuiSettings e)
   {
	   e.ShowGuiIcons = true;
	   e.guiScale = 1f;
	   e.sweatParticals = true;
	   e.insaneParticals = true;
	   e.useFarenheit = true;
	   e.ShowText = true;
	   e.ShowDebug = true;
	   e.breathSound = true;
	   e.breathPause = 300;
	   e.breathVolume = .75f;
	   
	   return e;
   }
}


