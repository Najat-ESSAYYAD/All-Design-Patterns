package org.example.adapter;

import org.example.HDMI;
import org.example.Vga;

public class HdmiVgaAdapterComposition implements Vga {
    private HDMI hdmi;
    @Override
    public void print(String message) {
        System.out.println("====== Adapter ======");
        byte[] data=message.getBytes();
        hdmi.view(data);
        System.out.println("====== Adapter ======");
    }

    public void setHdmi(HDMI hdmi){
        this.hdmi=hdmi;
    }
}
