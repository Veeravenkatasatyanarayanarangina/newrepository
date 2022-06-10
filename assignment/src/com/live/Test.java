package com.live;

import com.music.Playable;
import music.string.Veena;
import music.string.wind.Saxophone;

public class Test 
{
	
	public static void main(String[] args)
	{
		 
		Playable playable =new  Veena();
		playable.play();
		playable = new Saxophone();
		playable.play();
		
	}

}
