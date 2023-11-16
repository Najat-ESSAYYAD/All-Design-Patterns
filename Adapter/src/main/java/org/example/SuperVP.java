package org.example;

public class SuperVP implements Vga, HDMI{
    @Override
    public void view(byte[] data) {
        String message =new String(data);
        System.out.println(".........super VP Hdmi........... ");
        System.out.println(message);
        System.out.println(".........super VP Hdmi........... ");
    }

    @Override
    public void print(String message) {
        System.out.println(".........super VP Vga........... ");
        System.out.println(message);
        System.out.println(".........super VP Vga........... ");
    }
}
