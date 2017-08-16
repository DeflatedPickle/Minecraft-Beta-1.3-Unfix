package com.deflatedpickle.betaunfix.proxy;

import com.deflatedpickle.betaunfix.events.ForgeEventHandler;
import net.minecraftforge.common.MinecraftForge;

public class ClientProxy implements CommonProxy{
    @Override
    public void init() {
        MinecraftForge.EVENT_BUS.register(new ForgeEventHandler());
    }
}