package net.triplegerms.unitygear.item;

import org.apache.commons.lang3.StringUtils;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.triplegerms.unitygear.UnityGear;
import net.triplegerms.unitygear.lib.Names;

public class ArmorBase extends ItemArmor {
	
	private ArmorMaterial material;
	private String realName;
	
	
	public ArmorBase(String name, ArmorMaterial aMaterial, EntityEquipmentSlot slot){		
		super(aMaterial, 0, slot);
		this.material = aMaterial;
		this.realName = name;
		setCreativeTab(UnityGear.tabGear);
		setUnlocalizedName(Names.unlocal(name));
		setRegistryName(UnityGear.MODID, name);
		GameRegistry.register(this);
	}
	
	@Override
	public String getUnlocalizedName(ItemStack stack) {
		return "item." + UnityGear.RESOURCE_PREFIX + realName;
	}
	
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack){
		String feet = player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem().getUnlocalizedName();
		String leg = player.getItemStackFromSlot(EntityEquipmentSlot.LEGS).getItem().getUnlocalizedName();
        String chest = player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem().getUnlocalizedName();
        String head = player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem().getUnlocalizedName();
        
        //this is fucking retarded. delete this fam
        feet = StringUtils.substring(feet, 15, 18);
        leg = StringUtils.substring(leg, 15, 18);
        chest = StringUtils.substring(chest, 15, 18);
        head = StringUtils.substring(head, 15, 18);
        Boolean fullSet = false;
        //player.getArmorInventoryList();
        
        if(feet.equals(head) && leg.equals(head) && chest.equals(head))
        	fullSet = true;
        
       if(fullSet){
    	   if(material == ArmorType.armorScale){
    		   player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 40, 2, false, false));
    		   player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 40, 0, false, false));
    		   player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 40, 1, false, false));
    		   
    	   }else if(material == ArmorType.armorThief){
    		   //less buggy looking than MobEffects.NIGHT_VISION
    		   player.addPotionEffect(new PotionEffect(Potion.getPotionById(16), 210, 0, false, false));
    		   player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 40, 0, false, false));
    		   player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 40, 1, false, false));
    		   
    	   }else if(material == ArmorType.armorTribal){
    		   //less buggy looking than MobEffects.NIGHT_VISION
    		   player.addPotionEffect(new PotionEffect(Potion.getPotionById(16), 210, 0, false, false));
    		   player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 40, 2, false, false));
    		   player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 40, 0, false, false));
    	   }
       }
		
	}

}
