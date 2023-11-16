package org.example.adapter;

import org.example.HDMI;
import org.example.TV;
import org.example.Vga;

public class HdmiVgaAdapterHeritage extends TV implements Vga {

    @Override
    public void print(String message) {
        System.out.println("====== Adapter ======");
        byte[] data=message.getBytes();
        super.view(data);
        System.out.println("====== Adapter ======");
    }

}
