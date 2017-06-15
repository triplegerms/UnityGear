package net.triplegerms.unitygear.lib;

import net.triplegerms.unitygear.UnityGear;

public class Names {

	public static final String ESSENCE_ITEM = "essence_item";
	public static final String UNITY_DIAMOND_ITEM = "unitydiamond_item";
	
	public static final String SCALE_BOOT_ITEM = "scale_boot_item";
	public static final String SCALE_LEG_ITEM = "scale_leg_item";
	public static final String SCALE_CHEST_ITEM = "scale_chest_item";
	public static final String SCALE_HELM_ITEM = "scale_helm_item";
	
	public static final String THIEF_BOOT_ITEM = "thief_boot_item";
	public static final String THIEF_LEG_ITEM = "thief_leg_item";
	public static final String THIEF_CHEST_ITEM = "thief_chest_item";
	public static final String THIEF_HELM_ITEM = "thief_helm_item";
	
	public static final String TRIBAL_BOOT_ITEM = "tribal_boot_item";
	public static final String TRIBAL_LEG_ITEM = "tribal_leg_item";
	public static final String TRIBAL_CHEST_ITEM = "tribal_chest_item";
	public static final String TRIBAL_HELM_ITEM = "tribal_helm_item";
	
	public static final String THIEF_ARMOR = "thief_armor";
	public static final String TRIBAL_ARMOR = "tribal_armor";
	public static final String SCALE_ARMOR = "scale_armor";

	public static String unlocal(String name) {
		return UnityGear.MODID + "." + name;
	}
	
	public static String resName(String name){
		return UnityGear.RESOURCE_PREFIX + name;
	}

}
