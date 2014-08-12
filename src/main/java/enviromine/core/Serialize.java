package enviromine.core;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import enviromine.gui.GuiSettings;

public class Serialize 
{

	  public static void doSerialize(String [] args)
	  {
	      GuiSettings e = new GuiSettings();
	      
	      e = e.LoadDefaults(e);
	      
	      try
	      {
	         FileOutputStream fileOut =
	         new FileOutputStream("enviroOptions.ser");
	         ObjectOutputStream out = new ObjectOutputStream(fileOut);
	         out.writeObject(e);
	         out.close();
	         fileOut.close();
	         System.out.printf("Serialized data is saved in enviroOptions.ser");
	      }catch(IOException i)
	      {
	          i.printStackTrace();
	      }
	   }
	  
	   public static void DeSerialize(String [] args)
	   {
		  GuiSettings e = null;
	      try
	      {
	         FileInputStream fileIn = new FileInputStream("enviroOptions.ser");
	         ObjectInputStream in = new ObjectInputStream(fileIn);
	         e = (GuiSettings) in.readObject();
	         in.close();
	         fileIn.close();
	      }catch(IOException i)
	      {
	         i.printStackTrace();
	         return;
	      }catch(ClassNotFoundException c)
	      {
	         System.out.println("enviroOptions class not found");
	         c.printStackTrace();
	         return;
	      }

	      System.out.println("Gui Scale "+ e.guiScale);
	      System.out.println("Breath Volume "+ e.breathVolume);
	      System.out.println("Breath Sound "+ e.breathSound);
	      System.out.println("Breath Pause "+ e.breathPause);
	      System.out.println("Show Text "+ e.ShowText);
	      System.out.println("Gui Icons "+ e.ShowGuiIcons);
	      System.out.println("Show Debug "+ e.ShowDebug);
	    }
	  
	  
}
