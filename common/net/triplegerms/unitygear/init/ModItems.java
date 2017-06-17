package net.triplegerms.unitygear.init;

import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.triplegerms.unitygear.UnityGear;
import net.triplegerms.unitygear.item.ArmorBase;
import net.triplegerms.unitygear.item.ArmorType;
import net.triplegerms.unitygear.item.ItemUnityDiamond;
import net.triplegerms.unitygear.item.ItemUnityEssence;
import net.triplegerms.unitygear.lib.Names;

public class ModItems {

	public static ItemUnityEssence uEssence;
	public static ItemUnityDiamond uDiamond;
	
	public static Item scaleBoot;
	public static Item scaleLeg;
	public static Item scaleChest;
	public static Item scaleHelm;
	public static Item thiefBoot;
	public static Item thiefLeg;
	public static Item thiefChest;
	public static Item thiefHelm;
	public static Item tribalBoot;
	public static Item tribalLeg;
	public static Item tribalChest;
	public static Item tribalHelm;
	

	public static void init() {

		uEssence = new ItemUnityEssence(Names.ESSENCE_ITEM);
		uDiamond = new ItemUnityDiamond(Names.UNITY_DIAMOND_ITEM);
		
		scaleBoot = new ArmorBase(Names.SCALE_BOOT_ITEM, ArmorType.armorScale, EntityEquipmentSlot.FEET);
		scaleLeg = new ArmorBase(Names.SCALE_LEG_ITEM, ArmorType.armorScale, EntityEquipmentSlot.LEGS);
		scaleChest = new ArmorBase(Names.SCALE_CHEST_ITEM, ArmorType.armorScale, EntityEquipmentSlot.CHEST);
		scaleHelm = new ArmorBase(Names.SCALE_HELM_ITEM, ArmorType.armorScale, EntityEquipmentSlot.HEAD);
		thiefBoot = new ArmorBase(Names.THIEF_BOOT_ITEM, ArmorType.armorThief, EntityEquipmentSlot.FEET);
		thiefLeg = new ArmorBase(Names.THIEF_LEG_ITEM, ArmorType.armorThief, EntityEquipmentSlot.LEGS);
		thiefChest = new ArmorBase(Names.THIEF_CHEST_ITEM, ArmorType.armorThief, EntityEquipmentSlot.CHEST);
		thiefHelm = new ArmorBase(Names.THIEF_HELM_ITEM, ArmorType.armorThief, EntityEquipmentSlot.HEAD);
		tribalBoot = new ArmorBase(Names.TRIBAL_BOOT_ITEM, ArmorType.armorTribal, EntityEquipmentSlot.FEET);
		tribalLeg = new ArmorBase(Names.TRIBAL_LEG_ITEM, ArmorType.armorTribal, EntityEquipmentSlot.LEGS);
		tribalChest = new ArmorBase(Names.TRIBAL_CHEST_ITEM, ArmorType.armorTribal, EntityEquipmentSlot.CHEST);
		tribalHelm = new ArmorBase(Names.TRIBAL_HELM_ITEM, ArmorType.armorTribal, EntityEquipmentSlot.HEAD);

	}

	public static void initRecipes() {
		uEssence.addRecipes();
		uDiamond.addRecipes();
		ArmorRecipe.init();
	}

	private static Item registerItem(Item item, String name) {
		GameRegistry.register(item, new ResourceLocation(UnityGear.MODID, name));
		return item;
	}

	@SideOnly(Side.CLIENT)
	public static void initClient() {
		ModRender.preInit();
	}

}
