package net.triplegerms.unitygear.lib;

import net.triplegerms.unitygear.UnityGear;

public class Names {

	public static final String ESSENCE_ITEM = "essence_item";
	public static final String UNITY_DIAMOND_ITEM = "unitydiamond_item";
	public static final String SCALE_CHEST_ITEM = "scale_chest_item";

	public static String unlocal(String name) {
		return UnityGear.MODID + "." + name;
	}
	
	public static String resName(String name){
		return UnityGear.RESOURCE_PREFIX + name;
	}

}
