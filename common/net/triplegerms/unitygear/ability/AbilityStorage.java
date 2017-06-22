package net.triplegerms.unitygear.ability;

import javax.annotation.Nullable;

import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTPrimitive;
import net.minecraft.nbt.NBTTagInt;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.Capability.IStorage;

public class AbilityStorage implements IStorage<IAbility>{

	@Nullable
	@Override
	public NBTBase writeNBT(Capability<IAbility> capability, IAbility instance, EnumFacing side) {
		return new NBTTagInt(instance.getCoolDown());
	}
	@Override
	public void readNBT(Capability<IAbility> capability, IAbility instance, EnumFacing side, NBTBase nbt) {
		instance.setCoolDown(((NBTPrimitive) nbt).getInt());
	}

}
