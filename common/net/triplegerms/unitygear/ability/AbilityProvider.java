package net.triplegerms.unitygear.ability;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import net.minecraft.nbt.NBTBase;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;

public class AbilityProvider implements ICapabilitySerializable<NBTBase>{
	
	@CapabilityInject(IAbility.class)

	 public static final Capability<IAbility> COOLDOWN = null;
	 private IAbility instance = COOLDOWN.getDefaultInstance();

	@Override
	public boolean hasCapability(@Nonnull Capability<?> capability,
			@Nullable EnumFacing facing) {
		return capability == COOLDOWN;
	}

	@Nullable
	@Override
	public	<T> T getCapability(@Nonnull Capability<T> capability, @Nullable EnumFacing facing) {
		return capability == COOLDOWN ? COOLDOWN.<T> cast(this.instance) : null; 
	}

	public NBTBase serializeNBT() {
		return COOLDOWN.getStorage().writeNBT(COOLDOWN, this.instance, null);
	}

	public void deserializeNBT(NBTBase nbt) {
		COOLDOWN.getStorage().readNBT(COOLDOWN, this.instance, null, nbt);
		
	}

}
