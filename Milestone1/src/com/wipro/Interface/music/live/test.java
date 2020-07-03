package com.wipro.Interface.music.live;

import com.wipro.Interface.music.playable;
import com.wipro.Interface.music.string.Veena;
import com.wipro.Interface.music.wind.Saxophone;

public class test {
public static void main(String[] args) {
	Veena v=new Veena();
	v.play();
	Saxophone s= new Saxophone();
	s.play();
	playable p= new Veena();
	p.play();
}
}