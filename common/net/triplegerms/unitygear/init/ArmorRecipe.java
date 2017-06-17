package net.triplegerms.unitygear.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class ArmorRecipe {
	
	public static void init(){
		
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.scaleBoot), 
				"   ", "ODO", "O O", 
				'O', Blocks.OBSIDIAN, 
				'D', ModItems.uDiamond);
		
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.scaleLeg), 
				"OOO", "GDG", "O O", 
				'O', Blocks.OBSIDIAN, 
				'G', Items.GOLD_INGOT,
				'D', ModItems.uDiamond);
		
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.scaleChest), 
				"G G", "ODO", "GOG", 
				'O', Blocks.OBSIDIAN, 
				'G', Items.GOLD_INGOT,
				'D', ModItems.uDiamond);
		
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.scaleHelm), 
				"GOG", "ODO", "   ", 
				'O', Blocks.OBSIDIAN, 
				'G', Items.GOLD_INGOT,
				'D', ModItems.uDiamond);
		
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.thiefBoot), 
				"   ", "LDL", "G G", 
				'L', Items.LEATHER,
				'G', new ItemStack(Blocks.WOOL, 1, 7), // 7 = Gray wool 
				'D', ModItems.uDiamond);
		
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.thiefLeg), 
				"LSL", "LDL", "L L", 
				'L', Items.LEATHER,
				'S', Items.STRING, 
				'D', ModItems.uDiamond);
		
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.thiefChest), 
				"R R", "LDL", "LLL", 
				'L', Items.LEATHER,
				'R', new ItemStack(Blocks.WOOL, 1, 14), // 14 = Red wool 
				'D', ModItems.uDiamond);
		
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.thiefHelm), 
				"RRR", "RDR", "   ", 
				'R', new ItemStack(Blocks.WOOL, 1, 14), // 14 = Red wool 
				'D', ModItems.uDiamond);
		
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.tribalBoot), 
				"   ", "SDS", "L L", 
				'L', Items.LEATHER,
				'S', Items.STRING,
				'D', ModItems.uDiamond);
		
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.tribalLeg), 
				"LLL", "IDI", "L L", 
				'L', Items.LEATHER,
				'I', Items.IRON_INGOT,
				'D', ModItems.uDiamond);
		
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.tribalChest), 
				"I I", "LDL", "ILI", 
				'L', Items.LEATHER,
				'I', Items.IRON_INGOT,
				'D', ModItems.uDiamond);
		
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.tribalHelm), 
				"BBB", "BDB", "   ", 
				'B', Items.BONE,
				'D', ModItems.uDiamond);
		
	}
	


}
