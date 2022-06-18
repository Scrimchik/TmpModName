package com.scrim.tmpmodid;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(TmpModName.modID)
public class TmpModName
{
    public static final String modID = "tmpmodid";

    public TmpModName()
    {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
    }
}
